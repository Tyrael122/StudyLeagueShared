package dtos

import dtos.statistic.ReadStatisticDTO
import dtos.student.goals.ReadGoalDTO
import kotlinx.serialization.Serializable

@Serializable
class SubjectDTO(
    var id: Long = 0,
    var name: String = "",

    var weeklyGoals: ReadGoalDTO = ReadGoalDTO(),
    var allTimeGoals: ReadGoalDTO = ReadGoalDTO(),

    var dailyStatistic: ReadStatisticDTO = ReadStatisticDTO(),
    var weeklyStatistic: ReadStatisticDTO = ReadStatisticDTO(),
    var allTimeStatistic: ReadStatisticDTO = ReadStatisticDTO(),
)