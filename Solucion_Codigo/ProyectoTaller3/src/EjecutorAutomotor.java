import java.util.Scanner;

public class EjecutorAutomotor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cédula del dueño: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese marca del vehículo: ");
        String marca = sc.nextLine();

        System.out.print("Ingrese año de fabricación: ");
        int anio = sc.nextInt();

        System.out.print("Ingrese valor del vehículo: ");
        double valor = sc.nextDouble();

        Automotor automotor = new Automotor(cedula, marca, anio, valor);
        automotor.calcularValorMatricula();

        System.out.println(automotor);
    }
}


class Automotor {
    private String cedulaDuenio;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String cedulaDuenio, String marcaVehiculo, int anioFabricacion, double valorVehiculo) {
        this.cedulaDuenio = cedulaDuenio;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
    }

    public void calcularValorMatricula() {
        int anioActual = java.time.Year.now().getValue();
        int antiguedad = anioActual - anioFabricacion;
        this.valorMatricula = valorVehiculo * 0.002 * antiguedad;
    }

    public String toString() {
        return String.format(
            "Automotor:%nDueño: %s%nMarca: %s%nAño: %d%nValor: $%.2f%nMatrícula: $%.2f",
            cedulaDuenio, marcaVehiculo, anioFabricacion, valorVehiculo, valorMatricula
        );
    }
}

