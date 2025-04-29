
import java.util.Scanner;

public class Problema_6_EjecutorProfesor {

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
        Problema_6_Profesor profesor = new Problema_6_Profesor(nombre, apellido, cedula, sueldo_basico);
        System.out.println(profesor);
    }
}

