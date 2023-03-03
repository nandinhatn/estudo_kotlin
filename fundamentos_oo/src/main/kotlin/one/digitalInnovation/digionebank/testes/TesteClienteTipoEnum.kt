package one.digitalInnovation.digionebank.testes
import one.digitalInnovation.digionebank.ClienteTipo
fun main() {
    ClienteTipo.values().forEach{ element->
        println("${element.name} - ${element.descricao}")

    }
    ClienteTipo.values().forEach{
        println("${it.name} - ${it.descricao}")

    }
    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.descricao}")
}