package one.digitalInnovation.digionebank

class Pessoa {
    var nome:String ="Fernanda"
    var cpf: String ="123.345.989-11"
    inner class Endereco {
        var rua : String = "Rua teste"
    }
}
fun main(){
    val fernanda = Pessoa()
    println(fernanda.nome)
    println(fernanda.cpf)
}
