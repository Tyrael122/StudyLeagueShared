package dtos.student.schedule

import kotlinx.serialization.Serializable
import java.time.DayOfWeek

@Serializable
class StudyDayDTO(
    var dayOfWeek: DayOfWeek = DayOfWeek.MONDAY,
    var entries: List<ScheduleEntryDTO> = emptyList(),
)