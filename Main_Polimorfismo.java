package br.com.gustavo.pagamento;

public class Main_Polimorfismo {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {
            new FuncionarioComum("Alice", 3000),
            new Gerente("Bob", 5000),
            new Diretor("Charlie", 8000)
        };

        FolhadePagamento folhaPagamento = new FolhadePagamento();
        folhaPagamento.imprimirSalarios(funcionarios);
    }
}