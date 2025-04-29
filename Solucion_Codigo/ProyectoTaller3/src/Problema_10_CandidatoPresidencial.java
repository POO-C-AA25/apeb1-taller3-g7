class Problema_10_CandidatoPresidencial {

    private String nombre;
    private int edad;
    private String partidoPolitico;
    private String planGobierno;
    private int numeroPropuestas;

    public Problema_10_CandidatoPresidencial() {
    }

    public Problema_10_CandidatoPresidencial(String nombre, int edad, String partidoPolitico, String planGobierno, int numeroPropuestas) {
        this.nombre = nombre;
        this.edad = edad;
        this.partidoPolitico = partidoPolitico;
        this.planGobierno = planGobierno;
        this.numeroPropuestas = numeroPropuestas;
    }

    public Problema_10_CandidatoPresidencial(String nombre, String partidoPolitico) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.planGobierno = "No definido";
        this.numeroPropuestas = 0;
        this.edad = 0;
    }

    public boolean validarEdad() {
        return edad >= 35;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public String getPlanGobierno() {
        return planGobierno;
    }

    public int getNumeroPropuestas() {
        return numeroPropuestas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public void setPlanGobierno(String planGobierno) {
        this.planGobierno = planGobierno;
    }

    public void setNumeroPropuestas(int numeroPropuestas) {
        this.numeroPropuestas = numeroPropuestas;
    }

    public String toString() {
        return String.format(
                "Nombre: %s\nEdad: %d\nPartido Político: %s\nPlan de Gobierno: %s\nNúmero de Propuestas: %d",
                nombre, edad, partidoPolitico, planGobierno, numeroPropuestas
        );
    }
}