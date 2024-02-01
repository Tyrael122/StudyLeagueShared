package dtos.student.schedule

import util.LocalTimeSerializer
import kotlinx.serialization.Serializable
import java.time.LocalTime

@Serializable
class ScheduleEntryDTO(
    @Serializable(with = LocalTimeSerializer::class)
    var start: LocalTime = LocalTime.MIDNIGHT,

    @Serializable(with = LocalTimeSerializer::class)
    var end: LocalTime = LocalTime.MIDNIGHT,

    var subjectId: Long = 0,
)