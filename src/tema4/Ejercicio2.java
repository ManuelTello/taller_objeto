package tema4;

import tema4.deps_2.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Empleado entrenador = new Entrenador(50,"Entrenador",(double)500,15);
        Empleado jugador = new Jugador(40,20,"Jugador",(double)100,5);
    
        System.out.println(entrenador.toString());
        System.out.println(jugador.toString());
    }
}
