package br.com.gustavo.pagamento;

abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }
}