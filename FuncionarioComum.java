package br.com.gustavo.pagamento;

public class FuncionarioComum extends Funcionario {
    private double salarioBase;

    public FuncionarioComum(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}