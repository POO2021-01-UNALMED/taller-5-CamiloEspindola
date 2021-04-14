package gestion;
import java.util.ArrayList;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	public static int i = 0;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public ArrayList<Zona> getZonas() {
		return zonas;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico() {};
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	int total = 0;
	public int cantidadTotalAnimales() {
		int total = 0;
		 for(Zona zona : zonas) {
			 total += zona.cantidadAnimales();
		 }
		 return total;
	}
	
	
	
}
