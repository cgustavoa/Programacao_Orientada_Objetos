package br.com.gustavo.pagamento;

public class Diretor extends Funcionario {
    private double salarioBase;
    private double participacaoLucros;

    public Diretor(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.70;
    }
}
