package dtos

import dtos.student.ReadGoalDTO
import dtos.student.ReadStatisticDTO
import kotlinx.serialization.Serializable

@Serializable
class SubjectDTO(
    var id: Long = 0,
    var name: String = "",

    var hoursToStudyToday: Float = 0F,

    var weeklyGoals: ReadGoalDTO = ReadGoalDTO(),
    var allTimeGoals: ReadGoalDTO = ReadGoalDTO(),

    var dailyStatistic: ReadStatisticDTO = ReadStatisticDTO(),
    var weeklyStatistic: ReadStatisticDTO = ReadStatisticDTO(),
    var allTimeStatistic: ReadStatisticDTO = ReadStatisticDTO(),
)