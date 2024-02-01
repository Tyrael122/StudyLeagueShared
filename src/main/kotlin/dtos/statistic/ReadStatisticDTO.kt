package dtos.statistic

import kotlinx.serialization.Serializable

@Serializable
class ReadStatisticDTO(
    var hours: Float = 0F,
    var questions: Int = 0,
    var reviews: Int = 0
)