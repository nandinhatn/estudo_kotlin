package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Funcionario
import one.digitalInnovation.digionebank.Gerente


fun main() {
    val maria = Gerente(nome = "maria carmo", cpf = "145648487-787", 5000.0 , senha = "senha123")

    ImprimeRelatorioFuncionario.imprime(maria)
    TesteAutenticacao().autentica((maria))

}
