
public class Problema_1_EjecutorTerreno {

public static Problema_1_Terreno terrenoX = new Problema_1_Terreno();
    public static void main(String[] args) {
        double ancho=(Math.random()*10)+1;
        double largo=(Math.random()*10)+1;
        double valorMetroCuadrado=(Math.random()*10)+1;
        terrenoX.setAncho(ancho);
        terrenoX.setLargo(largo);
        terrenoX.setValorMetroCuadrado(valorMetroCuadrado);
        terrenoX.calcularArea();
        terrenoX.calcularCostoTerreno();
        System.out.println("terrenoX: "+terrenoX.toString());
        System.out.println("FORMA EFICIENTE");
        Problema_1_Terreno miTerreno = new Problema_1_Terreno (2,3,3);
        miTerreno.calcularArea();
        miTerreno.calcularCostoTerreno();
        System.out.println("Miterreno " + miTerreno.toString());
        
    }
   
}
  
