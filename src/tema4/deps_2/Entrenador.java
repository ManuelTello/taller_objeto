package tema4.deps_2;

public class Entrenador extends Empleado{
    private int cantidadCampeonatosGanados;
    
    public Entrenador(int unaCCG, String unNombre, double unSB, int unaAntiguedad){
        super(unNombre, unSB, unaAntiguedad);
        setCantidadCampeonatosGanados(unaCCG);
    }
    
    public void setCantidadCampeonatosGanados(int unaCCG){
        cantidadCampeonatosGanados = unaCCG;
    }
    
    public int getCantidadCampeonatosGanados(){
        return cantidadCampeonatosGanados;
    }
    
    @Override
    public double calcularEfectividad(){
        return cantidadCampeonatosGanados / this.getAntiguedad();
    }

    @Override
    public double calcularSueldoACobrar() {
        double adicion = 0;
        
        if(getCantidadCampeonatosGanados() >= 1 && getCantidadCampeonatosGanados() <= 4){
            adicion = 5000;
        }else if(getCantidadCampeonatosGanados() >= 5 && getCantidadCampeonatosGanados() <= 10){
            adicion = 30000;
        }else if(getCantidadCampeonatosGanados() >= 10){
            adicion = 50000;
        }
        
        return this.getSueldoBasico() + adicion;
    }
    
    @Override 
    public String toString(){
        return super.toString() + ", efectividad " + calcularEfectividad() + calcularSueldoACobrar();
    }
}
