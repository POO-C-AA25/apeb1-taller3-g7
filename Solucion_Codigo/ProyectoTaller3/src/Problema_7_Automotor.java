class Problema_7_Automotor {

    private String cedulaDueno;
    private String marcaVeh;
    private int anioFabr;
    private double valorVeh;
    private double valorMatricula;

    public Problema_7_Automotor() {
    }

    public Problema_7_Automotor(String cedulaDuenio, String marcaVeh, int anioFabr, double valorVeh) {
        this.cedulaDueno = cedulaDuenio;
        this.marcaVeh = marcaVeh;
        this.anioFabr = anioFabr;
        this.valorVeh = valorVeh;
    }

    public void calcularValorMatricula() {
        int anioActual = 2025;
        int antiguedad = anioActual - anioFabr;
        this.valorMatricula = valorVeh * 0.002 * antiguedad;
    }

    public String toString() {
        return String.format(
                "Automotor:%nDueño: %s%nMarca: %s%nAño: %d%nValor: $%.2f%nMatrícula: $%.2f",
                cedulaDueno, marcaVeh, anioFabr, valorVeh, valorMatricula
        );
    }
}
