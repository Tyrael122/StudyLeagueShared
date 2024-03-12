package dtos.signin

import dtos.student.StudentDTO
import kotlinx.serialization.Serializable

@Serializable
class SignUpStudentData {
    var credential: CredentialDTO = CredentialDTO()
    var student: StudentDTO = StudentDTO()
}