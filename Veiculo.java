//Pacote
package br.com.gustavo.veiculo;
//Classe
public class Veiculo {
	
	//Características (atributos, propriedades)
	
	private String marca;
	private String modelo;
	private int ano;
	
	// serve para inicializar as características/ atributos da classe
	
	public Veiculo(String marca, String modelo, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	//ações(métodos)
	
	public void acelerar() {
		System.out.println( modelo + " acelerando...");
	}
	public void freiar() {
		System.out.println( modelo + " freiando...");
	}
	
	public void exibirInformacao() {
		System.out.println("marca: " + this.marca );
		System.out.println("modelo: " + this.modelo );
		System.out.println("ano: " + this.ano );
	}
}
