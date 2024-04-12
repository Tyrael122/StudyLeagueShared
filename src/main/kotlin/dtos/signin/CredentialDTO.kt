package dtos.signin

import kotlinx.serialization.Serializable

@Serializable
class CredentialDTO {
    var email: String = ""
    var password: String = ""
}