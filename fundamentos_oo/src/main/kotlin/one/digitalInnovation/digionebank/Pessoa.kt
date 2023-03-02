package one.digitalInnovation.digionebank

class Pessoa {
    var nome:String ="Fernanda"
    var cpf: String ="123.345.989-11"
    private set
    constructor()
    fun pessoaInfo()="$nome e $cpf"
}
fun main(){
    val fernanda = Pessoa()

    println(fernanda.pessoaInfo())

}
