
import java.util.Scanner;

public class EjecutorProfesor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Cédula: ");
        String cedula = sc.nextLine();

        System.out.print("Sueldo básico: ");
        double sueldo_basico = sc.nextDouble();
        Profesor profesor = new Profesor(nombre, apellido, cedula, sueldo_basico);
        System.out.println(profesor);
    }
}

class Profesor {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldo_basico;
    private double sueldo_total;

    public Profesor(String nombre, String apellido, String cedula, double sueldo_basico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldo_basico = sueldo_basico;
        this.sueldo_total = sueldo_basico * 1.2;
    }

    public String toString() {
        return String.format(
                "Profesor: %s %s%n"
                + "Cédula: %s%n"
                + "Sueldo Básico: $%.2f%n"
                + "Sueldo Total:  $%.2f",
                nombre, apellido, cedula,
                sueldo_basico, sueldo_basico
        );
    }
}
