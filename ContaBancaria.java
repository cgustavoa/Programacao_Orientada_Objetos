package br.com.gustavo.banco;

public class ContaBancaria {
    private double saldo;
    private String titular;


    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de %.2f realizado com sucesso!%n\n", valor);
        } else {
            System.out.println("Valor de depósito deve ser positivo!\n");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.printf("Saque de %.2f realizado com sucesso!%n\n", valor);
            } else {
                System.out.println("Saldo insuficiente para saque!\n");
            }
        } else {
            System.out.println("Valor de saque deve ser positivo!\n");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String novoTitular) {
        if (novoTitular != null && !novoTitular.trim().isEmpty()) {
            this.titular = novoTitular;
            System.out.println("Titular alterado com sucesso!\n");
        } else {
            System.out.println("Nome do titular inválido!\n");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void exibirInformacoes() {
        System.out.printf("Titular: %s \nSaldo: %.2f%n\n", titular, saldo);
    }
}