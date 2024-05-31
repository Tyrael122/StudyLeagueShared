package dtos.student

import enums.StatisticType
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

@Serializable
class ReadStatisticDTO(
    var hours: Float = 0F, var questions: Int = 0, var reviews: Int = 0
)

@Serializable
class WriteStatisticDTO(
    var statisticType: StatisticType, var value: Float
)