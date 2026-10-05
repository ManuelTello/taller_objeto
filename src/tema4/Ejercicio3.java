package tema4;

import PaqueteLectura.GeneradorAleatorio;
import tema4.deps_3.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Entidad persona = new Persona("Raul",GeneradorAleatorio.generarInt(4000000), 30);
        Entidad trabajador = new Trabajador("Sebastian",GeneradorAleatorio.generarInt(4000000),27,"jardinero");
        
        System.out.println(persona.toString());
        System.out.println(trabajador.toString());
    }
}
