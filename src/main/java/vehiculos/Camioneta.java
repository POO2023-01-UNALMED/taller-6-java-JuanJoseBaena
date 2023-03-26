package vehiculos;

public class Camioneta extends Vehiculo{
	boolean volco;
	static int cantidadCamionetas;
	public Camioneta(String placa, int puertas, String nombre, float precio, float peso, Fabricante f, boolean volco) {
		super (placa, puertas, 90, nombre, precio, peso, "4x4", f);
		this.volco = volco;
		cantidadCamionetas +=1;
		}
	
	public boolean isVolco() {
		return this.volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
}