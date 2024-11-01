package br.com.gustavo.pagamento;

public class FolhadePagamento {
    public void imprimirSalarios(Funcionario[] funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out.printf("Nome: %s \nSalário: %.2f%n\n", funcionario.getNome(), funcionario.calcularSalario());
        }
    }
}