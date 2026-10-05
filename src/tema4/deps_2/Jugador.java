package tema4.deps_2;

import tema4.deps_2.Empleado;

public class Jugador extends Empleado{
    private int cantidadPartidosJugados;
    
    private int cantidadGolesAnotados;
    
    public Jugador(int unaCPJ, int unaCGA, String unNombre, double unSueldoBasico, int unaAntiguedad){
        super(unNombre, unSueldoBasico, unaAntiguedad);
        setCantidadPartidosJugados(unaCPJ);
        setCantidadGolesAnotados(unaCGA);
    }
    
    public void setCantidadPartidosJugados(int unaCPJ){
        cantidadPartidosJugados = unaCPJ;
    }
    
    public void setCantidadGolesAnotados(int unaCGA){
        cantidadGolesAnotados = unaCGA;
    }
    
    @Override
    public double calcularEfectividad(){
        return cantidadPartidosJugados / cantidadGolesAnotados;
    }

    @Override
    public double calcularSueldoACobrar() {
        double total = this.getSueldoBasico();
        
        if(calcularEfectividad() > 0.5){
            total += this.getSueldoBasico();
        }
        
        return total;
    }
    
    @Override 
    public String toString(){
        return super.toString() + ", efectividad " + calcularEfectividad() + calcularSueldoACobrar();
    }
}
