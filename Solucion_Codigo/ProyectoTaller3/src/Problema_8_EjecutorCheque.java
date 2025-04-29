
import java.util.Scanner;

public class Problema_8_EjecutorCheque {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del cliente: ");
        String cliente = sc.nextLine();

        System.out.print("Ingrese nombre del banco: ");
        String banco = sc.nextLine();

        System.out.print("Ingrese valor del cheque: ");
        double valorCheque = sc.nextDouble();

        Problema_8_Cheque cheque = new Problema_8_Cheque(cliente, banco, valorCheque);
        cheque.calcularComision();

        System.out.println(cheque);
    }
}
