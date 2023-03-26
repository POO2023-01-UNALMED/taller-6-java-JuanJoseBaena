package vehiculos;

public class Vehiculo {
	String placa;
	int puertas;
	float velocidadMaxima;
	String nombre;
	float precio;
	float peso;
	String traccion;
    Fabricante fabricante;
    static int CantidadVehiculos;
    
    
    public Vehiculo(String placa, int puertas, float velocidadMaxima, String nombre, float precio, float peso, String traccion, Fabricante fabricante){
    	 this.placa = placa;
         this.puertas = puertas;
         this.velocidadMaxima=velocidadMaxima;
         this.nombre = nombre;
         this.precio = precio;
         this.peso = peso;
         this.traccion = traccion;
         this.fabricante = fabricante;
         CantidadVehiculos += 1;
    }
    
    
    public static int getCantidadVehiculos(){
        return CantidadVehiculos;
    }
    public static void setCantidadVehiculos(int CantidadVehiculos){
        Vehiculo.CantidadVehiculos = CantidadVehiculos;
    }
    
    
    public  String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    
    public int getPuertas(){
        return this.puertas;
    }
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
    
    
    public float getVelocidadMaxima(){
        return this.velocidadMaxima;
    }
    public void setVelocidadMaxima(float velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    
    public float getPrecio(){
        return this.precio;
    }
    public void setPrecio (float precio){
        this.precio = precio;
    }
    
    
    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    
    public String getTraccion(){
        return this.traccion;
    }
    public void setTraccion(String traccion){
        this.traccion = traccion;
    }
    
    
    public Fabricante getFabricante(){
        return this.fabricante;
    }

    public String vehiculosPorTipo(){
        return "Automoviles: "+Automovil.CantidadVehiculos+"\nCamionetas: "+Camioneta.cantidadCamionetas+
                "\nCamiones: "+Camion.cantidadCamiones;
    }
}