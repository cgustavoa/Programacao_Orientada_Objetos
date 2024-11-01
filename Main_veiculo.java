package br.com.gustavo.concessionaria;

public class Main_veiculo {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota", "Corolla", 2020, 4);
        Veiculo moto = new Moto("Honda", "CB500", 2021, true);
        Veiculo caminhao = new Caminhao("Mercedes-Benz", "Actros", 2019, 15000);

        carro.exibirInformacoes();
        System.out.println();
        moto.exibirInformacoes();
        System.out.println();
        caminhao.exibirInformacoes();
    }
}
