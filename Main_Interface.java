package br.com.gustavo.retangulo;

import java.util.ArrayList;
import java.util.List;

public class Main_Interface {
    public static void main(String[] args) {
        List<AreaCalculavel> formas = new ArrayList<>();

        formas.add(new Retangulo(4, 5));
        formas.add(new Circulo(3));    
        formas.add(new Triangulo(6, 8));

        for (AreaCalculavel forma : formas) {
            System.out.println( " Área do " + forma.toString() + " = " + forma.calcularArea());
        }
    }
}
