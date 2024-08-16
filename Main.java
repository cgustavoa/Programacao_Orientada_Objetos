package br.com.gustavo.main;

import br.com.gustavo.veiculo.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		// Tirando o carro da forma (instanciar)
		
		Veiculo objVeiculo1 = new Veiculo("Fiat", "Uno", 1997);
		objVeiculo1.acelerar();
		objVeiculo1.exibirInformacao();
		
		Veiculo objVeiculo2 = new Veiculo("Chevrolet", "Opala", 1968);
		objVeiculo2.acelerar();
		objVeiculo2.exibirInformacao();
		
		Veiculo objVeiculo3 = new Veiculo("Fiat", "Uno", 1997);
		objVeiculo3.freiar();
		objVeiculo3.exibirInformacao();
		
		Veiculo objVeiculo4 = new Veiculo("Chevrolet", "Opala", 1968);
		objVeiculo4.freiar();
		objVeiculo4.exibirInformacao();
		
	
	}

}
