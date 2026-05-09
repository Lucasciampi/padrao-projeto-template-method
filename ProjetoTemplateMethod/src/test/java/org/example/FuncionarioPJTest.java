package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioPJTest {

    @Test
    void deveRetornarSalarioLiquido() {
        FuncionarioPJ funcionario = new FuncionarioPJ();
        funcionario.setSalarioBase(1000.0f);
        assertEquals(1000.0f, funcionario.calcularSalarioLiquido());
    }

    @Test
    void deveRetornarCargo() {
        FuncionarioPJ funcionario = new FuncionarioPJ();
        assertEquals("Prestador PJ", funcionario.getCargo());
    }

    @Test
    void deveRetornarInformacoesContratuais() {
        FuncionarioPJ funcionario = new FuncionarioPJ();
        funcionario.setSalarioBase(1000.0f);
        funcionario.setId(1);
        funcionario.setNome("Prestador PJ");
        assertEquals("Prestador PJ{id=1, nome='Prestador PJ', salarioLiquido=1000.0}", funcionario.getInformacoesContratuais());
    }

}