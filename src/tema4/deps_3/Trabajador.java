package tema4.deps_3;

public class Trabajador extends Entidad{
    private String empleo;
    
    public Trabajador(String unNombre, int unDni, int unaEdad, String unEmpleo){
        super(unNombre,unDni,unaEdad);
        setEmpleo(unEmpleo);
    }
    
    public void setEmpleo(String unEmpleo){
        empleo = unEmpleo;
    }
    
    public String getEmpleo(){
        return empleo;
    }
    
    @Override
    public String toString(){
        return super.toString() + ". Soy " + getEmpleo();
    }
}