package dtos.student.schedule

import kotlinx.serialization.Serializable

@Serializable
class ScheduleDTO(
    var days: List<StudyDayDTO> = emptyList(),
)