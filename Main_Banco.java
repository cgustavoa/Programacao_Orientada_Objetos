package br.com.gustavo.banco;

public class Main_Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Alice", 1000.00);

        conta.exibirInformacoes();
        conta.depositar(500.00);
        conta.sacar(200.00);
        conta.sacar(2000.00);
        conta.setTitular("Alice Silva");
        conta.exibirInformacoes();
    }
}
