
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
        double sueldoBasico = sc.nextDouble();

        Profesor profesor = new Profesor(nombre, apellido, cedula, sueldoBasico);

        System.out.println(profesor);
    }
}

class Profesor {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;

    public Profesor(String nombre, String apellido, String cedula, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldoBasico = sueldoBasico;
        calcularSueldoTotal();
    }

    private void calcularSueldoTotal() {
        this.sueldoTotal = this.sueldoBasico * 1.2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String toString() {
        return String.format(
                "Profesor: %s %s%n"
                + "Cédula: %s%n"
                + "Sueldo Básico: $%.2f%n"
                + "Sueldo Total (+20%%): $%.2f",
                nombre, apellido, cedula,
                sueldoBasico, sueldoTotal
        );
    }
}
