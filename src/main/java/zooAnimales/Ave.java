package zooAnimales;

public class Ave extends Animal {
	private static Ave listado [];
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public static int i = 0;
	
	public Ave[] getListado() {
		return listado;
	}
	public void setListado(Ave[] listado) {
		this.listado = listado;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas ) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorPlumas = colorPlumas;
		listado[i] = this;
		i++;
	}
	
	public Ave() {}
	
	public int cantidadAves() {
		return i;
	}
	
	public String movimiento() {
		return "volar";
		
	}
	 
	public void crearHalcon(String nombre, int edad, String genero ) {
		Ave obj1 = new Ave (nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
	}
	
	public void crearAguila(String nombre, int edad, String genero) {
		Ave obj1 = new Ave (nombre, edad, "montanas", genero, "blanco y amarillo" );
		listado[i] = this;
		aguilas++;
		i++;
		
	}
	
	
	
	
}
