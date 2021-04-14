package zooAnimales;

public class Pez extends Animal{
	private static Pez listado [];
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public static int i = 0;
	
	
	
	public Pez[] getListado() {
		return listado;
	}



	public void setListado(Pez[] listado) {
		this.listado = listado;
	}



	public String getColorEscamas() {
		return colorEscamas;
	}



	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}



	public int getCantidadAletas() {
		return cantidadAletas;
	}



	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}



	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado[i] = this;
		i++;
	}
	
	
	
	public int cantidadPeces() {
		return i;
	}
	
	public String movimiento() {
		return "reptar";
	}
	

	public void crearSalmon(String nombre, int edad,  String genero) {
		Pez obj = new Pez (nombre, edad, "oceano", genero, "rojo", 6);
		listado[i] = this;
		salmones++;
		i++;
	}
	
	
	public void crearBacalao(String nombre, int edad, String genero) {
		Pez obj = new Pez (nombre, edad, "oceano", genero, "gris", 6);
		listado[i] = this;
		bacalaos++;
		i++;
	}
	
	
}
