package br.com.gustavo.pagamento;

public class Gerente extends Funcionario {
    private double salarioBase;
    private double bonusGerente;

    public Gerente(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.30;
    }
}

