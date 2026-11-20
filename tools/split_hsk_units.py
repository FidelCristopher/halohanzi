import re

with open('app/src/main/java/com/example/chineselearning/data/repository/LearningRepository.kt', 'r', encoding='utf-8') as f:
    text = f.read()

# Find BAB 17
bab17_marker = "        // BAB 17: Keluarga Besar, Kerabat & Kenangan Masa Kecil (家庭亲属、辈分称谓与童年时光)"
idx = text.find(bab17_marker)
assert idx != -1, "BAB 17 marker not found!"

# Find end of units listOf:
# The last part is the end of unit_30:
#             )
#         )
#     )
# }
end_marker = """                    exercisesPart1 = bab30Stage6Part1Exercises,
                    exercisesPart2 = bab30Stage6Part2Exercises
                )
            )
        )
    )
}"""
assert end_marker in text, "End marker not found!"

end_idx = text.rfind("""                    exercisesPart1 = bab30Stage6Part1Exercises,
                    exercisesPart2 = bab30Stage6Part2Exercises
                )
            )
        )""") + len("""                    exercisesPart1 = bab30Stage6Part1Exercises,
                    exercisesPart2 = bab30Stage6Part2Exercises
                )
            )
        )""")

hsk2_code = text[idx:end_idx]

hsk2_file_content = f"""package com.example.chineselearning.data.repository

import androidx.compose.ui.graphics.Color
import com.example.chineselearning.data.model.Lesson
import com.example.chineselearning.data.model.NodeIconType
import com.example.chineselearning.data.model.PathNode
import com.example.chineselearning.data.model.UnitCourse
import com.example.chineselearning.data.model.Word

val hsk2Units: List<UnitCourse> by lazy {{
    val stories = LearningRepository.stories
    listOf(
{hsk2_code}
    )
}}
"""

with open('app/src/main/java/com/example/chineselearning/data/repository/Hsk2UnitsData.kt', 'w', encoding='utf-8') as f:
    f.write(hsk2_file_content)

print(f"Written Hsk2UnitsData.kt ({len(hsk2_file_content)} bytes)")

# Now update LearningRepository.kt
# Before idx, there was a comma before BAB 17:
#                     exercisesPart2 = bab16Stage6Part2Exercises
#                 )
#             )
#         ),
#
#         // BAB 17:

comma_idx = text.rfind(",\n\n" + bab17_marker)
if comma_idx == -1:
    comma_idx = text.rfind(",\n" + bab17_marker)

hsk1_end = """                    exercises = bab16Stage6Part1Exercises,
                    exercisesPart1 = bab16Stage6Part1Exercises,
                    exercisesPart2 = bab16Stage6Part2Exercises
                )
            )
        )"""

hsk1_idx = text.find(hsk1_end) + len(hsk1_end)

# In LearningRepository.kt, replace units definition:
# We can have:
# private val hsk1Units: List<UnitCourse> by lazy {
#     listOf(
#         ... (Bab 1 to 16)
#     )
# }
#
# val units: List<UnitCourse> by lazy {
#     hsk1Units + hsk2Units
# }

# Let's find "val units: List<UnitCourse> = listOf("
units_start = "    val units: List<UnitCourse> = listOf("
assert units_start in text

text_part1 = text[:text.find(units_start)]
hsk1_units_body = text[text.find(units_start) + len(units_start):hsk1_idx]

new_units_code = f"""    private val hsk1Units: List<UnitCourse> by lazy {{
        listOf({hsk1_units_body}
        )
    }}

    val units: List<UnitCourse> by lazy {{
        hsk1Units + hsk2Units
    }}
}}"""

new_learning_repo = text_part1 + new_units_code

with open('app/src/main/java/com/example/chineselearning/data/repository/LearningRepository.kt', 'w', encoding='utf-8') as f:
    f.write(new_learning_repo)

print("Updated LearningRepository.kt successfully!")
