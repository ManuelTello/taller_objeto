package tema4.deps_4;

public class SistemaGlobal extends Sistema{
    public SistemaGlobal(String unPartido, String unaProvincia, Fecha unaFecha, int unaTamLocalidad){
        super(unPartido, unaProvincia, unaFecha, unaTamLocalidad);
    }
    
    @Override 
    public double calcularPromedio(int horario){
        double total = 0;
        
        for(int i = 0; i < this.getMaxTamLocalidad(); i++){
            total += this.obtenerTemperatura(horario, i);
        }
        
        return total / this.getMaxTamLocalidad();
    }
    
    @Override
    public String toString(){
        String aux = "";
        
        for(int i = 0; i < 3; i++){
            aux += "Franja horaria " + (i + 1) + " " +calcularPromedio(i) + "°C\n";
        }
        
        return super.toString() + aux;
    }
}