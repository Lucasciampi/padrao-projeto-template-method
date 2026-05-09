package org.example;

public class FuncionarioCLT extends Funcionario {

    @Override
    public float calcularSalarioLiquido() {
        return this.getSalarioBase() * 0.9f;
    }

    @Override
    public String getCargo() {
        return "Funcionário CLT";
    }

}
