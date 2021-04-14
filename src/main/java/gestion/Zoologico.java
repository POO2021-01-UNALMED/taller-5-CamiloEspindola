package gestion;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static Zona Zonas [];
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
	public Zona[] getZonas() {
		return Zonas;
	}
	public void setZonas(Zona[] zonas) {
		Zonas = zonas;
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico() {};
	
	
	public void agregarZonas() {
		Zonas[i] = new Zona();
		i++;
	}
	int total = 0;
	public int cantidadTotalAnimales() {
		for(int i = 0; i<Zonas.length; i++) {
			total += Zonas[i].cantidadAnimales();
		}
		return total;
	}
	
	
}
