package zooAnimales;

import gestion.Zona;

public class Ave extends Animal {
	private Ave listado [];
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	int i = 0;
	
	
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
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		i++;
	}
	public Ave() {}
	
	public int cantidadAves() {
		return halcones+aguilas+i;
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
		aguilas++;
		
	}
	
	
	
	
}
