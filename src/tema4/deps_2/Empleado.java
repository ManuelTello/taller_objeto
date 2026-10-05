package tema4.deps_2;

public abstract class Empleado {
    private String nombre;
    
    private double sueldoBasico;
    
    private int antiguedad;
    
    public Empleado(String unNombre, double unSueldoBasico, int unaAntiguedad){
        setNombre(unNombre);
        setSueldoBasico(unSueldoBasico);
        setAntiguedad(unaAntiguedad);
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public void setSueldoBasico(double unSueldoBasico){
        sueldoBasico = unSueldoBasico;
    }
    
    public void setAntiguedad(int unaAntiguedad){
        antiguedad = unaAntiguedad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getSueldoBasico(){
        return sueldoBasico;
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }
    
    public abstract double calcularEfectividad();
    
    public abstract double calcularSueldoACobrar();
    
    @Override
    public String toString(){
        return "nombre " + getNombre();
    }
}
