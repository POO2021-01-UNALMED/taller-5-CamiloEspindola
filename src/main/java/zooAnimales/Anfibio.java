package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal{

	private Anfibio listado[];
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	int i = 0;
	
	
	public Anfibio[] getListado() {
		return listado;
	}
	public void setListado(Anfibio[] listado) {
		this.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		i++;
	}
	public Anfibio() {}
	
	public int cantidadAnfibios() {
		return ranas+salamandras+i;
		
	}
		
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad, String genero) {
		Anfibio obj = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		ranas++;
		
	}
		
	public void crearSalamandra(String nombre, int edad, String genero) {
		Anfibio obj = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras++;
	}
	
	
	
}
