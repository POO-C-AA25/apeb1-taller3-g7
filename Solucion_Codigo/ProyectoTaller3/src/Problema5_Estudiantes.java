class Problema5_Estudiantes{
    public String nombre;
    public double calificMateria1;
    public double calificMateria2;
    public double calificMateria3;
    public double promedio;
    public String estado;
    
    public Problema5_Estudiantes(){}
    public Problema5_Estudiantes(String nombre, double calificMateria1, double calificMateria2, double calificMateria3){
        this.nombre = nombre;
        this.calificMateria1 = calificMateria1;
        this.calificMateria2 = calificMateria2;
        this.calificMateria3 = calificMateria3;
        
    }
    public void calcularPromedio(){
        this.promedio = (this.calificMateria1 + this.calificMateria2 + this.calificMateria3) / 3;
    }
    public void determinarEstado(){
        if(this.promedio >= 6.5){
            this.estado = "Aprobado";
        } else{
            this.estado = "Reprobado";
        }
    }
    public String toString(){
        return"EL Estudiante " + this.nombre + " tiene un Promedio de " + this.promedio + " por lo tanto esta " + this.estado;
    }
}
