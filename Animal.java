package br.com.gustavo.animal;

public class Animal {
	
	private String especie;
	private String raca;
	private String cor;
	private int idade;
	
	public Animal(String especie, String raca, String cor, int idade) {
		super();
		this.especie = especie;
		this.raca = raca;
		this.cor = cor;
		this.idade = idade;
	}
	
	//ações(métodos)

	public void latir() {
		System.out.println( especie +" "+ raca + " latindo: AU AU AU");
	}
	public void miar() {
		System.out.println( especie +" "+ raca + " miando: MIAU MIAU MIAU");
	}
	
	public void exibirDados() {
		System.out.println("Espécie: "  + this.especie );
		System.out.println("Raça: " + this.raca);
		System.out.println("Idade: " + this.idade );
	}

}
