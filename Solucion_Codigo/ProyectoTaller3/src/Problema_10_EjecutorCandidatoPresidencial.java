
import java.util.Scanner;

public class Problema_10_EjecutorCandidatoPresidencial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos del primer candidato:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Partido político: ");
        String partidoPolitico = sc.nextLine();
        System.out.print("Plan de gobierno: ");
        String planGobierno = sc.nextLine();
        System.out.print("Número de propuestas clave: ");
        int numeroPropuestas = sc.nextInt();
        sc.nextLine();
        Problema_10_CandidatoPresidencial candidatoCompleto = new Problema_10_CandidatoPresidencial(nombre, edad, partidoPolitico, planGobierno, numeroPropuestas);

        System.out.println("\nIngrese los datos del segundo candidato (nombre y partido):");
        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();
        System.out.print("Partido político: ");
        String partido2 = sc.nextLine();

        Problema_10_CandidatoPresidencial candidatoSimple = new Problema_10_CandidatoPresidencial(nombre2, partido2);

        System.out.println("\nPrimer candidato:");
        System.out.println(candidatoCompleto);
        System.out.println("Cumple edad mínima: " + (candidatoCompleto.validarEdad() ? "Sí" : "No"));

        System.out.println("\nSegundo candidato:");
        System.out.println(candidatoSimple);
        System.out.println("Cumple edad mínima: " + (candidatoSimple.validarEdad() ? "Sí" : "No"));
    }
}

