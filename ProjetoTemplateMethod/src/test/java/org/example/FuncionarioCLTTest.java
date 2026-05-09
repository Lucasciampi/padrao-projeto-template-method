package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioCLTTest {

    @Test
    void deveRetornarSalarioLiquido() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setSalarioBase(1000.0f);
        assertEquals(900.0f, funcionario.calcularSalarioLiquido());
    }

    @Test
    void deveRetornarCargo() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        assertEquals("Funcionário CLT", funcionario.getCargo());
    }

    @Test
    void deveRetornarInformacoesContratuais() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setSalarioBase(1000.0f);
        funcionario.setId(1);
        funcionario.setNome("Funcionário CLT");
        assertEquals("Funcionário CLT{id=1, nome='Funcionário CLT', salarioLiquido=900.0}", funcionario.getInformacoesContratuais());
    }

}