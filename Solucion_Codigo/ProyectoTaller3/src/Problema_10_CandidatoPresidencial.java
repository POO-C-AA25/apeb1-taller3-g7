class Problema_10_CandidatoPresidencial {

    public String nombre;
    public int edad;
    public String partidoPolitico;
    public String planGobierno;
    public int numeroPropuestas;
    public String cumpleEdad;

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

    public static String verificarEdadMinima(int edad) {
        if (edad >= 35) {
            return "Sí";
        } else {
            return "No";
        }
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
    public void setCumpleEdad(String cumpleEdad) {
        this.cumpleEdad = cumpleEdad;
}
    public String toString() {
        return String.format(
            "Candidato Presidencial\nNombre: %s\nEdad: %d\nPartido: %s\nPlan de Gobierno: %s\nPropuestas Clave: %d\nCumple edad mínima: %s",
            nombre, edad, partidoPolitico, planGobierno, numeroPropuestas, cumpleEdad
        );
    }
 }