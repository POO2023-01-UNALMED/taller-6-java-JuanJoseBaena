package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Fabricante{
	String nombre;
	Pais pais;
	static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante (String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = this.nombre ;
	}
	
	
	public Pais getPais() {
		return this.pais;
	}
	public void setPais(Pais pais) {
		this.pais = this.pais;
	}
	
	
	public static Fabricante fabricaMayorVentas() {
		HashMap<String, Interger> cont = new HashMap<String, Interger>();
		for (Fabricante fabricante: fabricantes) {
			if (cont.containsKey(fabricante.getNombre())){
			cont.put(fabricante.getNombre(), cont.get(fabricante.getNombre())+1);
		}else {
			cont.put(fabricante.getNombre(), 1);
		}
	}
	
	int mayor = 0;
	String nombref = "";
	for (Map.Entry<String, Interger> entry: cont.entrySet()){
		if(entry.getValue() > mayor) {
			mayor = entry.getValue();
			nombref = entry.getKey();
		}
	}
	for(Fabricante fabricante : fabricantes) {
		if (fabricantes.getNombre().equals(nombref)) {
			return fabricante;
		}x
	}
	return null;
	
			
 }
}