public class Problema2_EjecutorEquivalenteHora {
    public static void main(String [] args){
        Problema2_EquivalenteHora horaX = new Problema2_EquivalenteHora(52);      
        System.out.println(horaX);      
    }   
}
class Problema2_EquivalenteHora{
    public int horas;
    public int minutos;
    public int segundos;
    public int dias;
    
    
    public Problema2_EquivalenteHora(){}
    public Problema2_EquivalenteHora(int horas){
        this.horas = horas;
        calcularDias();
        calcularMinutos();
        calcularSegundos();
    }

    public void calcularDias(){
        this.dias = horas / 24;
    }
    public void calcularMinutos(){
        this.minutos = horas * 60;
    }
    public void calcularSegundos(){
        this.segundos = horas * 3600;
    }
    public String toString(){
        return"\nDias: "+ this.dias +
              "\nMinutos: " + this.minutos + 
              "\nSegundos: " + this.segundos + "\n";
                
    }
}
