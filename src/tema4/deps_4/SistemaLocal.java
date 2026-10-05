package tema4.deps_4;

public class SistemaLocal extends Sistema{
    public SistemaLocal(String unPartido, String unaProvincia, Fecha unaFecha, int unaTamLocalidad){
        super(unPartido, unaProvincia, unaFecha, unaTamLocalidad);
    }
    
    @Override
    public double calcularPromedio(int localidad){
        double total = 0;
        
        for(int i = 0; i < 3; i++){
            total += this.obtenerTemperatura(i, localidad);
        }
        
        return total / 3;
    }
    
    @Override
    public String toString(){
        String aux = "";
        
        for(int i = 0; i < this.getMaxTamLocalidad(); i++){
            aux += "Localidad " + (i + 1) + " " +calcularPromedio(i) + "°C\n";
        }
        
        return super.toString() + aux;
    }
}