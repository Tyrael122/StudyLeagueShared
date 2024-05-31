package dtos.student

import kotlinx.serialization.Serializable
import dtos.SubjectDTO

@Serializable
class StudyCycleDTO {
    var id: Long = 0
    var entries: List<StudyCycleEntryDTO> = emptyList()
    var currentEntry: StudyCycleEntryDTO = StudyCycleEntryDTO()
    var weeklyMinutesToStudy: Int = 0
}

@Serializable
class StudyCycleEntryDTO {
    var id: Long = 0
    var subject: SubjectDTO = SubjectDTO()
    var durationInMinutes: Int = 0
}