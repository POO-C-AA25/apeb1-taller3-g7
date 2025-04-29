class Problema_1_Terreno{
    public double ancho;
    public double largo;
    public double valorMetroCuadrado;
    public double area;
    public double costo_terreno;
    public Problema_1_Terreno(){}
    public Problema_1_Terreno(double ancho, double largo, double valorMetroCuadrado){
        this.ancho = ancho;
        this.largo= largo;
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    public void setAncho(double ancho){
        this.ancho= ancho;
    }
    public void setLargo(double largo){
        this.largo= largo;
}
    public void setValorMetroCuadrado(double valorMetroCuadrado){
        this.valorMetroCuadrado= valorMetroCuadrado;
    }
    public double getAncho(){
        return this.ancho;
    }
        public double getLargo(){
        return this.largo;
        }
        public double getValorMetroCuadrado(){
        return this.valorMetroCuadrado;
        }
        public double getArea(double area){
        return this.area;
        }
        public double getCostoTerreno(){
        return this.costo_terreno;
        }
        public double calcularArea(){
        return this.area= this.ancho*this.largo;
        }
        public double calcularCostoTerreno(){
        return this.costo_terreno= this.area*this.valorMetroCuadrado;
        }
        public String toString(){
            return "(Ancho: "+ this.getAncho()+ ", " +
                    "largo: " +this.getLargo() + ", " +
                    "ValorMetro: "+ this.getValorMetroCuadrado()+ ", " +
                    "Area: " +this.getArea(area) + ", " +
                            "Costo Terreno: "+ this.getCostoTerreno()+ ")";
}
}