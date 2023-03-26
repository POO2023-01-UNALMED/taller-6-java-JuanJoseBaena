package vehiculos;

public class Automovil extends Vehiculo{
	int puestos;
	static int cantidadAutomoviles;
	public Automovil (String placa, String nombre, float precio, float peso, Fabricante f, int puestos) {
		super (placa, 4, 100, nombre, precio, peso "FWD", f);
		this.puestos = puestos;
		cantidadAutomoviles +=1;
	}
	
	public int getPuestos() {
		return this.puestos;
	}
	public void setPuestos () {
		this.puestos = puestos;
	}
}
