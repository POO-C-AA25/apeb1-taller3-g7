
import java.util.Scanner;

public class EjecutorEmprendimiento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre comercial: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el RUC: ");
        String ruc = sc.nextLine();

        System.out.print("Ingrese el sector económico: ");
        String sector = sc.nextLine();

        System.out.print("Ingrese el nombre del propietario: ");
        String propietario = sc.nextLine();

        System.out.print("Ingrese la ubicación: ");
        String ubicacion = sc.nextLine();

        System.out.print("Ingrese el año de inicio: ");
        int anioInicio = sc.nextInt();

        System.out.print("Ingrese el capital inicial: ");
        double capital = sc.nextDouble();

        System.out.print("Ingrese el año actual: ");
        int anioActual = sc.nextInt();

        Emprendimiento emprendimiento = new Emprendimiento(
                nombre, ruc, sector, propietario, ubicacion, anioInicio, capital
        );

        emprendimiento.calcularAntiguedad(anioActual);
        emprendimiento.determinarTipoNegocio();

        System.out.println(emprendimiento);
    }
}

class Emprendimiento {

    private String nombreComercial;
    private String ruc;
    private String sectorEconomico;
    private String propietario;
    private String ubicacion;
    private int anioInicio;
    private double capitalInicial;
    private int antiguedad;
    private String tipoNegocio;

    public Emprendimiento(String nombreComercial, String ruc, String sectorEconomico,
            String propietario, String ubicacion, int anioInicio,
            double capitalInicial) {
        this.nombreComercial = nombreComercial;
        this.ruc = ruc;
        this.sectorEconomico = sectorEconomico;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.anioInicio = anioInicio;
        this.capitalInicial = capitalInicial;
    }

    public void calcularAntiguedad(int anioActual) {
        antiguedad = anioActual - anioInicio;
    }

    public void determinarTipoNegocio() {
        if (capitalInicial < 20000.0) {
            tipoNegocio = "Micro";
        } else if (capitalInicial < 100000.0) {
            tipoNegocio = "Pequeño";
        } else {
            tipoNegocio = "Mediano";
        }
    }

    public String toString() {
        return "Emprendimiento:\n"
                + "Nombre Comercial: " + nombreComercial + "\n"
                + "RUC: " + ruc + "\n"
                + "Sector Económico: " + sectorEconomico + "\n"
                + "Propietario: " + propietario + "\n"
                + "Ubicación: " + ubicacion + "\n"
                + "Año de Inicio: " + anioInicio + "\n"
                + "Capital Inicial: $" + capitalInicial + "\n"
                + "Antigüedad: " + antiguedad + " años\n"
                + "Tipo de Negocio: " + tipoNegocio;
    }
}
