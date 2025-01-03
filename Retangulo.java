package br.com.gustavo.retangulo;

public class Retangulo implements AreaCalculavel {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
    
    @Override
    public String toString() {
        return "Retângulo";
    }
}