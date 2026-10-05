package tema4.deps_1;

public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double radio, String colorRelleno, String colorLinea){
        super(colorRelleno, colorLinea);
        setRadio(radio);
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * (getRadio() * 2);
    }
    
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * getRadio();
    }
    
    @Override
    public String toString(){
        return super.toString() + ", radio " + getRadio();
    }
}
