package tema4.deps_1;

public abstract class Figura {
    private String colorRelleno;
    
    private String colorLinea;
   
    public Figura(String unCR, String unCL){
        setColorRelleno(unCR);
        setColorLinea(unCL);
    }

    public String getColorRelleno(){
        return colorRelleno;       
    }
    
    public void setColorRelleno(String unColor){
        colorRelleno = unColor;       
    }
    
    public String getColorLinea(){
        return colorLinea;       
    }
    
    public void setColorLinea(String unColor){
        colorLinea = unColor;       
    }
    
    public void despintar(){
        colorRelleno = "blanco";
        colorLinea = "negro";
    }
    
    public boolean esGrande(){
        return (calcularArea() > 100);
    }
    
    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();
        
    @Override
    public String toString(){
        String aux = "Area: " + this.calcularArea() + " CR: "  + getColorRelleno() + " CL: " + getColorLinea();             
        return aux;
    }
}
