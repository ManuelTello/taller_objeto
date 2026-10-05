package tema4;

import tema4.deps_4.*;
import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio4 {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(24, 12, 2025);
        Sistema local = new SistemaLocal("La Plata","Buenos Aires",fecha,5);
        Sistema global = new SistemaGlobal("Berisso", "Buenos Aires", fecha, 4);
        
        GeneradorAleatorio.iniciar();
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                local.registrarTemperatura(i, j, GeneradorAleatorio.generarDouble(40));
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                global.registrarTemperatura(i, j, GeneradorAleatorio.generarDouble(40));
            }
        }
        
        System.out.println(local.toString());
        System.out.println(global.toString());
        System.out.println(local.maxTemperatura());
        System.out.println(global.maxTemperatura());
        System.out.println("HOla");
    }
}
