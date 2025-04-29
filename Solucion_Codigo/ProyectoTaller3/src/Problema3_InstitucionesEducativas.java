class Problema3_InstitucionEducativa{
    public String nombre;
    public String tipo;
    public int numAlumnos;
    public int numDocentes;
    public int numSedes;
    public double gastosEstudiante;
    public double presupuesto;
    
    public Problema3_InstitucionEducativa(){}
    public Problema3_InstitucionEducativa(String nombre, String tipo, int numAlumnos, int numDocentes, int numSedes, double gastosEstudiante){
        this.nombre = nombre;
        this.tipo = tipo;
        this.numAlumnos = numAlumnos;
        this.numDocentes = numDocentes;
        this.numSedes = numSedes;
        this.gastosEstudiante = gastosEstudiante;
        
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setNumAlumnos(int numAlumnos){
        this.numAlumnos = numAlumnos;
    }
    public void setNumDocentes(int numDocentes){
        this.numDocentes = numDocentes;
    }
    public void setNumSedes(int numSedes){
        this.numSedes = numSedes;
    }
    public void setGastosEstudiante(double gastosEstudiante){
        this.gastosEstudiante = gastosEstudiante;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getNumAlumnos(){
        return this.numAlumnos;
    }
    public int getNumDocentes(){
        return this.numDocentes;
    }
    public int getNumSedes(){
        return this.numSedes;
    }
    public double getGastosEstudiante(){
        return this.gastosEstudiante;
    }
    public double getPresupuesto(){
        return this.presupuesto;
    }
    public void calcularPresupuesto(){
        this.presupuesto = this.numAlumnos * this.gastosEstudiante;
    }
    public String toString(){
        return "\nNombre: " + this.getNombre() + "\n"+
               "Tipo: " + this.getTipo() + "\n" +
               "Numero de Alumnos: " + this.getNumAlumnos() + "\n" +
               "Numero de Docentes: " + this.getNumDocentes() + "\n" +
               "Numero de Sedes: " + this.getNumSedes() + "\n" +
               "Gastos por Estudiante: " + this.getGastosEstudiante() + "\n" + 
               "El Presupuesto es de: " + this.getPresupuesto() + "\n";           
    }
         
}
