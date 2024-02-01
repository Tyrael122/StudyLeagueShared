package dtos.student.goals

import kotlinx.serialization.Serializable

@Serializable
class ReadGoalDTO(
    var hours: Float = 0F,
    var questions: Int = 0,
    var reviews: Int = 0
)