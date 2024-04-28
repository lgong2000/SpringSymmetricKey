# SpringSymmetricKey

ASymmetricKey - private key and public key
SymmetricKey - one key
Spring Web
OAuth2 Resource Server

Version 1
InMemoryUserDetailsManager
OAuth2
AuthController
application.properties
    jwt.key=
    #e.g. Generate from https://www.browserling.com/tools/random-string
@Value
JwtEncoder, JwtDecoder

Test by Postman
1. GET - Authorization Type: Bearer Token - http://localhost:8080 -> Status: 401 Unauthorized
2. New Tab - POST - Authorization Type: Basic Auth - Username/Password - http://localhost:8080/api/auth/token
3. Copy token - Back to 1. - Paste Token - Send