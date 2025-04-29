
class Problema_6_Profesor {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldo_basico;
    private double sueldo_total;

    public Problema_6_Profesor() {
    }

    public Problema_6_Profesor(String nombre, String apellido, String cedula, double sueldo_basico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldo_basico = sueldo_basico;
        this.sueldo_total = sueldo_basico * 1.2;
    }

    public String toString() {
        return String.format(
                "Profesor: %s %s%n"
                + "Cédula: %s%n"
                + "Sueldo Básico: $%.2f%n"
                + "Sueldo Total:  $%.2f",
                nombre, apellido, cedula,
                sueldo_basico, sueldo_total
        );
    }
}