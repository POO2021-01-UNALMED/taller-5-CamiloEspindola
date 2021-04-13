package gestion;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private Zona Zonas [];
	
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
	public Zona[] getZonas() {
		return Zonas;
	}
	public void setZonas(Zona[] zonas) {
		Zonas = zonas;
	}
	int i = 0;
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico() {};
	
	public void agregarZonas() {
		
	}
	public int cantidadTotalAnimales() {
		return 2;
		
	}
	
	
	
}
