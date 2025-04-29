import java.util.Scanner;

public class EjecutorAutomotor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cédula del dueño: ");
        String cedulaDueno = sc.nextLine();

        System.out.print("Marca del vehículo: ");
        String marcaVeh = sc.nextLine();

        System.out.print("Año de fabricación: ");
        int anioFabr = sc.nextInt();

        System.out.print("Valor del vehículo: ");
        double valorVeh = sc.nextDouble();
        Automotor auto = new Automotor(cedulaDueno, marcaVeh, anioFabr, valorVeh);
        System.out.println(auto);
    }
}

class Automotor {
    private String cedulaDueno;
    private String marcaVeh;
    private int anioFabr;
    private double valorVeh;
    private double valorMatricula;

    public Automotor(String cedulaDueno, String marcaVeh, int anioFabr, double valorVeh) {
        this.cedulaDueno = cedulaDueno;
        this.marcaVeh = marcaVeh;
        this.anioFabr = anioFabr;
        this.valorVeh = valorVeh;
        calcularValorMatricula();
    }

    private void calcularValorMatricula() {
        int anioActual = java.time.Year.now().getValue();
        int antiguedad = anioActual - anioFabr;
        this.valorMatricula = valorVeh * 0.002 * antiguedad;
    }

    public String getCedulaDuenio() {
        return cedulaDueno;
    }

    public String getMarcaVehiculo() {
        return marcaVeh;
    }

    public int getAnioFabricacion() {
        return anioFabr;
    }

    public double getValorVehiculo() {
        return valorVeh;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }
    
    public String toString() {
        return String.format(
            "Automotor:%n" +
            "  Dueño (cédula): %s%n" +
            "  Marca: %s%n" +
            "  Año fabric.: %d%n" +
            "  Valor vehículo: $%.2f%n" +
            "  Valor matrícula: $%.2f",
            cedulaDueno, marcaVeh, anioFabr, valorVeh, valorMatricula
        );
    }
}
