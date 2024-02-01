package dtos.statistic

import enums.StatisticType
import kotlinx.serialization.Serializable

@Serializable
class WriteStatisticDTO(
    var statisticType: StatisticType,
    var value: Float
)