package br.com.gustaavo.IMC;

public class Main_IMC {

	public static void main(String[] args) {
		Pessoa objPessoa = new Pessoa ("Gustavo", 80.0, 1.85);
		System.out.println(objPessoa.calcularIMC());
		Atleta objAtleta = new Atleta ("Joao", 60.0, 1.70);
		System.out.println(objAtleta.calcularIMC());
	}

}
