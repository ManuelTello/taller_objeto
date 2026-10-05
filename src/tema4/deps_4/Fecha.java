package tema4.deps_4;

public class Fecha {
    private int dia;
    
    private int mes;
    
    private int año;
    
    public Fecha(int unDia, int unMes, int unAño){
        setDia(unDia);
        setMes(unMes);
        setAño(unAño);
    }
    
    public void setDia(int unDia){
        dia = unDia;
    }
    
    public void setMes(int unMes){
       mes = unMes;
    } 
   
    public void setAño(int unAño){
       año = unAño;
    }
   
   public int getDia(){
       return dia;
   }
   
   public int getMes(){
       return mes;
   }
   
   public int getAño(){
       return año;
   }
   
   @Override
   public String toString(){
       return dia + "/" + mes + "/" + año;
   }
}
