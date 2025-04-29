
import java.util.Scanner;

public class Problema_9_EjecutorEmprendimiento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre comercial: ");
        String nombreComercial = sc.nextLine();

        System.out.print("Ingrese el RUC: ");
        String ruc = sc.nextLine();

        System.out.print("Ingrese el sector económico: ");
        String sectorEconomico = sc.nextLine();

        System.out.print("Ingrese el nombre del propietario: ");
        String propietario = sc.nextLine();

        System.out.print("Ingrese la ubicación: ");
        String ubicacion = sc.nextLine();

        System.out.print("Ingrese el año de inicio: ");
        int anioInicio = sc.nextInt();

        System.out.print("Ingrese el capital inicial: ");
        double capital_inicial = sc.nextDouble();

        int anioActual = 2025;

        Problema_9_Emprendimiento emprendimiento = new Problema_9_Emprendimiento(
                nombreComercial, ruc, sectorEconomico, propietario, ubicacion, anioInicio, capital_inicial
        );

        emprendimiento.calcularAntiguedad(anioActual);
        emprendimiento.determinarTipoNegocio();

        System.out.println(emprendimiento);
    }
}

