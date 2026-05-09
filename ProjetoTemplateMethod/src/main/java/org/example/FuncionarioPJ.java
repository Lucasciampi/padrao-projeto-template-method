package org.example;

public class FuncionarioPJ extends Funcionario {

    @Override
    public float calcularSalarioLiquido() {
        return this.getSalarioBase();
    }

    @Override
    public String getCargo() {
        return "Prestador PJ";
    }

}
