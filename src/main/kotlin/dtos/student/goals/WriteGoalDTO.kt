package dtos.student.goals

import enums.StatisticType
import kotlinx.serialization.Serializable

@Serializable
class WriteGoalDTO(
    var statisticType: StatisticType,
    var target: Float
)