package dtos.student

import kotlinx.serialization.Serializable

@Serializable
class StudentDTO(
    var id: Long = 0,
    var email: String = "",
    var name: String = "",
    var goal: String = "",
    var studyArea: String = "",
)