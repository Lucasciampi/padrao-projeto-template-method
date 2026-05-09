package org.example;

public abstract class Funcionario {

    private int id;
    protected String nome;
    private float salarioBase;

    public float getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public abstract float calcularSalarioLiquido();

    public String getCargo() {
        return "Funcionário";
    }

    public String getInformacoesContratuais() {
        return getCargo() + "{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", salarioLiquido=" + this.calcularSalarioLiquido() +
                '}';
    }

}
