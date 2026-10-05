package tema4;

import tema4.deps_1.Circulo;
import tema4.deps_1.Figura;
import tema4.deps_1.Triangulo;
import tema4.deps_1.Cuadrado;
import tema4.deps_1.Rectangulo;

public class Ejercicio1 {
    public static void main(String[] args) {
        Figura circulo = new Circulo((double)10, "rojo", "negro");
        Figura cuadrado = new Cuadrado((double)10,"rojo","negro");
        Figura triangulo = new Triangulo((double)10, 10, 10, "rojo", "negro");
        Figura rectangulo = new Rectangulo((double)5, (double)20, "rojo", "negro");
        
        System.out.println("Circulo " + circulo.toString());
        System.out.println("Cuadrado " + cuadrado.toString());
        System.out.println("Triangulo " + triangulo.toString());
        System.out.println("Rectangulo " + rectangulo.toString());
    }
}
