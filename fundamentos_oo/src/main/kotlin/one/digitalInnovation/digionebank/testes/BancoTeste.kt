package one.digitalInnovation.digionebank.testes
import one.digitalInnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)
    println(digiOneBank.nome)
    println(digiOneBank.numero)
    println(digiOneBank.info())
}
