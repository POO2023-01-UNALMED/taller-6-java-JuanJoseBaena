package vehiculos;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


public class Pais {
    String nombre;
    static ArrayList<Pais> paises = new ArrayList<Pais>();
    public Pais(String nombre){
        this.nombre = nombre;
        paises.add(this);
    }
    
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    public static Pais paisMasVendedor(){
        HashMap<String, Integer> cont = new HashMap<String, Integer>();
        for(Pais pais: paises){
            if(cont.containsKey(pais.getNombre())){
                cont.put(pais.getNombre(), cont.get(pais.getNombre())+1);
            }else{
                cont.put(pais.getNombre(), 1);
            }
        }
        
        
        int mayor = 0;
        String nombrep = "";
        for(Entry<String, Integer> entry : cont.entrySet()){
            if(entry.getValue() > mayor) {
                mayor = entry.getValue();
                nombrep = entry.getKey();
            }
        }
        
        
        for(Pais pais: paises){
            if(pais.getNombre().equals(nombrep)){
                return pais;
            }
        }
        return null;
    }
}