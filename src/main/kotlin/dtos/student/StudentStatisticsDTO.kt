package dtos.student

import dtos.statistic.ReadStatisticDTO
import kotlinx.serialization.Serializable

@Serializable
class StudentStatisticsDTO(
    var dailyGrade: Float = 0F,
    var weeklyGrade: Float = 0F,
    var monthlyGrade: Float = 0F,

    var hoursGoalsCompleted: Int = 0,

    var dailyStatistic: ReadStatisticDTO = ReadStatisticDTO(),
    var weeklyStatistic: ReadStatisticDTO = ReadStatisticDTO(),
    var allTimeStatistic: ReadStatisticDTO = ReadStatisticDTO()
)