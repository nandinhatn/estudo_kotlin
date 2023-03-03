package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Analista
import one.digitalInnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val joao = Analista(nome = "Joao Pedro", cpf = "145648487-787", 2000.0 )

    ImprimeRelatorioFuncionario.imprime(joao)

}
fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())