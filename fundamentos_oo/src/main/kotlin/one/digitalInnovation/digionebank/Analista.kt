package one.digitalInnovation.digionebank

import one.digitalInnovation.digionebank.Funcionario

class Analista (nome: String, cpf: String, salario: Double) : Funcionario (nome, cpf, salario) {
    override fun calculoAuxilio() = salario * 0.1
}