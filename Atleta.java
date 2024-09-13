package br.com.gustaavo.IMC;

public class Atleta extends Pessoa{
	
	private String esportePraticado;

	public Atleta(String nome, double peso, double altura) {
		super(nome, peso, altura);
	}

	@Override
	public double calcularIMC() {
		double imcBase = super.calcularIMC();
		double imcComAjuste = imcBase * 0.95;
		return imcComAjuste;
	
	}

	
}
