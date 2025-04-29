public class Problema4_EjecutorDispositivosElectronicos {
    public static void main (String [] args){
        Problema4_DispositivosElectronicos dispositivoX = new Problema4_DispositivosElectronicos("Android", 15.5, 350.0, 15, "00:1E:C2:9E:28:6B", 451236200698231L);
        System.out.println(dispositivoX);
    }  
    
}
class Problema4_DispositivosElectronicos{
    public String sistemaOpertivo;
    public double tamanioPantalla;
    public double costoInicial;
    public double IVA;
    public double IvaCostoInicial;
    public double costoFinal;
    public String MAC;
    public long IMEI;  
    
    public Problema4_DispositivosElectronicos(){}
    public Problema4_DispositivosElectronicos(String sistemaOpertivo, double tamanioPantalla, double costoInicial, double IVA, String MAC, long IMEI){
        this.sistemaOpertivo = sistemaOpertivo;
        this.tamanioPantalla = tamanioPantalla;
        this.costoInicial = costoInicial;
        this.IVA = IVA;
        this.MAC = MAC;
        this.IMEI = IMEI;
        calcularIvaCostoInicial();
        calcularCostoFinal();
    }
    public void calcularIvaCostoInicial(){
        this.IvaCostoInicial = this.costoInicial * (this.IVA / 100);
    }
    public void calcularCostoFinal(){
        this.costoFinal = this.costoInicial + this.IvaCostoInicial;
    }
    public String toString(){
        return"El Dispositivo con las siguientes Caracteristicas: " +
              "\nSistema Operativo: " + this.sistemaOpertivo +
              "\nTamanio de la Pantalla: " + this.tamanioPantalla +
              "\nCosto: " + this.costoInicial +
              "\nDireccion MAC: " + this.MAC +
              "\nIMEI: " + this.IMEI +
              "\nY con un IVA del " + this.IVA + "%" +
              "\nEl Coste Total del Dipositivo es de: " + this.costoFinal;
                
              
    }
}

