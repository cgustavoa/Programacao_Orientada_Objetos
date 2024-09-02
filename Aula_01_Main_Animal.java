package br.com.gustavo.main;

import br.com.gustavo.animal.Animal;

public class Main {

	public static void main(String[] args) {
		
		// Tirando o carro da forma (instanciar)
		
		Animal objAnimal1 = new Animal("Cachorro", "vira-lata", "caramelo", 10);
		objAnimal1.latir();
		objAnimal1.exibirDados();
		
		System.out.println("=====================================");
		
		Animal objAnimal2 = new Animal("Gato", "Siamês", "Branco", 5);
		objAnimal2.miar();
		objAnimal2.exibirDados();
		
		
	
	}

}
