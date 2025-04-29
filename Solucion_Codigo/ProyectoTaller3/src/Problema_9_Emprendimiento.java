class Problema_9_Emprendimiento {

    private String nombreComercial;
    private String ruc;
    private String sectorEconomico;
    private String propietario;
    private String ubicacion;
    private int anioInicio;
    private double capital_inicial;
    private int antiguedad;
    private String tipoNegocio;

    public Problema_9_Emprendimiento() {
    }

    public Problema_9_Emprendimiento(String nombreComercial, String ruc, String sectorEconomico,
            String propietario, String ubicacion, int anioInicio,
            double capital_inicial) {
        this.nombreComercial = nombreComercial;
        this.ruc = ruc;
        this.sectorEconomico = sectorEconomico;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.anioInicio = anioInicio;
        this.capital_inicial = capital_inicial;
    }

    public void calcularAntiguedad(int anioActual) {
        antiguedad = anioActual - anioInicio;
    }

    public void determinarTipoNegocio() {
        if (capital_inicial < 20000.0) {
            tipoNegocio = "Micro";
        } else if (capital_inicial < 100000.0) {
            tipoNegocio = "Pequeño";
        } else {
            tipoNegocio = "Mediano";
        }
    }

    public String toString() {
        return String.format(
                "Emprendimiento:\n"
                + "Nombre Comercial: %s\n"
                + "RUC: %s\n"
                + "Sector Económico: %s\n"
                + "Propietario: %s\n"
                + "Ubicación: %s\n"
                + "Año de Inicio: %d\n"
                + "Capital Inicial: $%.2f\n"
                + "Antigüedad: %d años\n"
                + "Tipo de Negocio: %s",
                nombreComercial, ruc, sectorEconomico, propietario,
                ubicacion, anioInicio, capital_inicial, antiguedad, tipoNegocio);
    }
}