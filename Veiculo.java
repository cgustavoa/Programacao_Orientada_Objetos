package br.com.gustavo.concessionaria;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.printf("Marca: %s \nModelo: %s \nAno: %d%n", marca, modelo, ano);
    }
}
