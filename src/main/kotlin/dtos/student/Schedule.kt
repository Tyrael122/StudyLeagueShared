package dtos.student

import kotlinx.serialization.Serializable
import util.serializers.LocalTimeSerializer
import java.time.DayOfWeek
import java.time.LocalTime

@Serializable
class ScheduleDTO(
    var days: List<StudyDayDTO> = emptyList(),
)

@Serializable
class StudyDayDTO(
    var dayOfWeek: DayOfWeek = DayOfWeek.MONDAY,
    var entries: List<ScheduleEntryDTO> = emptyList(),
)

@Serializable
class ScheduleEntryDTO(
    @Serializable(with = LocalTimeSerializer::class)
    var startTime: LocalTime = LocalTime.MIDNIGHT,

    @Serializable(with = LocalTimeSerializer::class)
    var endTime: LocalTime = LocalTime.MIDNIGHT,

    var subjectId: Long = 0,
)