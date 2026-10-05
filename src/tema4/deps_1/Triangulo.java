package tema4.deps_1;

public class Triangulo extends Figura{
    private double lado1;
    
    private double lado2;
    
    private double lado3;
        
    public Triangulo(double lado1, double lado2, double lado3, String colorRelleno, String colorLinea){
        super(colorRelleno, colorLinea);
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }
    
    public void setLado1(double lado){
        lado1 = lado;
    }
    
    public void setLado2(double lado){
        lado2 = lado;
    }
        
    public void setLado3(double lado){
        lado3 = lado;
    }
    
    public double getLado1(){
        return lado1;
    }
    
    public double getLado2(){
        return lado2;
    }
    
    public double getLado3(){
        return lado3;
    }
    
    @Override
    public double calcularArea(){
        return 0;
    }
    
    @Override
    public double calcularPerimetro(){
        return getLado1() + getLado2() + getLado3();
    }
      
    @Override
    public String toString(){
        return super.toString() + ", lado 1 " + getLado1() + ", lado2 " + getLado2() + ", lado 3 " + getLado3();
    }
}
