package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Cliente
import one.digitalInnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "12546487-89",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"

    )
    println(jose)
    TesteAutenticacao().autentica(jose)
}


