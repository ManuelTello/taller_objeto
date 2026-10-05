package tema4.deps_4;

public abstract class Sistema {
    private String partido;
    
    private String provincia;
    
    private Fecha fecha;
    
    private double [][] mediciones;
    
    private int tamLocalidad;
        
    public Sistema(String unPartido, String unaProvincia, Fecha unaFecha, int unaTamLocalidad){
        setPartido(unPartido);
        setProvincia(unaProvincia);
        setFecha(unaFecha);
        tamLocalidad = unaTamLocalidad;
        mediciones = new double[3][unaTamLocalidad];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < unaTamLocalidad; j++){
                mediciones[i][j] = 999;
            }
        }
    }
    
    public void setPartido(String unPartido){
        partido = unPartido;
    }
    
    public void setProvincia(String unaProvincia){
        provincia = unaProvincia;
    }
    
    public void setFecha(Fecha unaFecha){
        fecha = unaFecha;
    }
    
    public String getPartido(){
        return partido;
    }
    
    public String getProvincia(){
        return provincia;
    }
    
    public Fecha getFecha(){
        return fecha;
    }
    
    public int getMaxTamLocalidad(){
        return tamLocalidad;
    }
    
    public void registrarTemperatura(int horario, int localidad, double temperatura){
        mediciones[horario][localidad] = temperatura;
    }
    
    public double obtenerTemperatura(int horario, int localidad){
        return mediciones[horario][localidad];
    }
    
    public String maxTemperatura(){
        int maxHorario = 0;
        int maxLocalidad = 0;
        double maxTemperatura = -99999;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < tamLocalidad; j++){
                if(mediciones[i][j] > maxTemperatura){
                    maxHorario = i;
                    maxLocalidad = j;
                    maxTemperatura = mediciones[i][j];
                }
            }
        }
        
        return "Franja horaria " + (maxHorario + 1) + ", Localidad " + (maxLocalidad + 1);
    }
    
    public abstract double calcularPromedio(int eleccion);
    
    @Override
    public String toString(){
        return partido + " - " + provincia + " - " + fecha.toString() + "\n";
    }
}