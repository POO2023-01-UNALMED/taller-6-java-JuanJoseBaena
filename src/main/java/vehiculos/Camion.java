package vehiculos;

public class Camion extends Vehiculo{
	int ejes;
	static int cantidadCamiones;
	public Camion(String placa, String nombre, float precio, float peso, Fabricante f, int ejes) {
		super (placa, 2, 80, nombre, precio, peso, "4x2", f);
		this.ejes = ejes;
		cantidadCamiones +=1;
	}
	
	public int getEjes() {
		return this.ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}