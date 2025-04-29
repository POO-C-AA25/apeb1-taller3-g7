import java.util.Scanner;

public class EjecutorCheque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del cliente: ");
        String cliente = sc.nextLine();

        System.out.print("Ingrese nombre del banco: ");
        String banco = sc.nextLine();

        System.out.print("Ingrese valor del cheque: ");
        double valor = sc.nextDouble();

        Cheque cheque = new Cheque(cliente, banco, valor);
        cheque.calcularComision();

        System.out.println(cheque);
    }
}

class Cheque {
    private String cliente;
    private String banco;
    private double valorCheque;
    private double comision;

    public Cheque(String cliente, String banco, double valorCheque) {
        this.cliente = cliente;
        this.banco = banco;
        this.valorCheque = valorCheque;
    }

    public void calcularComision() {
        this.comision = valorCheque * 0.00003;
    } 
    public String toString() {
        return String.format(
            "Cliente: %s%nBanco: %s%nValor: $%.2f%nComisión: $%.2f",
            cliente, banco, valorCheque, comision
        );
    }
}
