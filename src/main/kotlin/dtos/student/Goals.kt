package dtos.student

import enums.StatisticType
import kotlinx.serialization.Serializable

@Serializable
class ReadGoalDTO(
    var hours: Float = 0F,
    var questions: Int = 0,
    var reviews: Int = 0
)

@Serializable
class WriteGoalDTO(
    var statisticType: StatisticType,
    var target: Float
)