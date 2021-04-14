package zooAnimales;


public class Anfibio extends Animal{

	private static Anfibio listado[];
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public static int i = 0;
	
	
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
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado[i] = this;
		i++;
	}
	public Anfibio() {}
	
	public int cantidadAnfibios() {
		return i;
		
	}
		
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad, String genero) {
		Anfibio obj = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		listado[i] = this;
		ranas++;
		i++;
		
	}
		
	public void crearSalamandra(String nombre, int edad, String genero) {
		Anfibio obj = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		listado[i] = this;
		salamandras++;
		i++;
	}
	
	
	
}
