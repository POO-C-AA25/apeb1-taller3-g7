
import java.util.Scanner;

public class Problema_7_EjecutorAutomotor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cédula del dueño: ");
        String cedulaDueno = sc.nextLine();

        System.out.print("Ingrese marca del vehículo: ");
        String marcaVeh = sc.nextLine();

        System.out.print("Ingrese año de fabricación: ");
        int anioFabr = sc.nextInt();

        System.out.print("Ingrese valor del vehículo: ");
        double valorVeh = sc.nextDouble();

        Problema_7_Automotor automotor = new Problema_7_Automotor(cedulaDueno, marcaVeh, anioFabr, valorVeh);
        automotor.calcularValorMatricula();

        System.out.println(automotor);
    }
}

