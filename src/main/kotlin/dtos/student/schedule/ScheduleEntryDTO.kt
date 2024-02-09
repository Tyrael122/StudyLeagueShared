package dtos.student.schedule

import util.LocalTimeSerializer
import kotlinx.serialization.Serializable
import java.time.LocalTime

@Serializable
class ScheduleEntryDTO(
    @Serializable(with = LocalTimeSerializer::class)
    var startTime: LocalTime = LocalTime.MIDNIGHT,

    @Serializable(with = LocalTimeSerializer::class)
    var endTime: LocalTime = LocalTime.MIDNIGHT,

    var subjectId: Long = 0,
)