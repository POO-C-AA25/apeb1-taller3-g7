class Problema_8_Cheque {

    private String cliente;
    private String banco;
    private double valorCheque;
    private double comision;

    public Problema_8_Cheque() {
    }

    public Problema_8_Cheque(String cliente, String banco, double valorCheque) {
        this.cliente = cliente;
        this.banco = banco;
        this.valorCheque = valorCheque;
    }

    public void calcularComision() {
        this.comision = valorCheque * 0.003;
    }

    public String toString() {
        return String.format(
                "Cliente: %s%nBanco: %s%nValor: $%.2f%nComisión: $%.2f",
                cliente, banco, valorCheque, comision
        );
    }
}