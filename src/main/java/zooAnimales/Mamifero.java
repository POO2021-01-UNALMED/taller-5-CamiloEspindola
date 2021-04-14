package zooAnimales;

public class Mamifero extends Animal {
	private static Mamifero listado[];
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public static int i = 0;
	
	public Mamifero[] getListado() {
		return listado;
	}
	public void setListado(Mamifero[] listado) {
		this.listado = listado;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado[i] = this;
		i++;
	}
	
	public Mamifero() {}
	
	public int cantidadMamiferos() {
		return i;
	}
	
	
	public void crearCaballo(String nombre, int edad, String genero) {
		Mamifero objM = new Mamifero (nombre,  edad, "pradera", genero, true, 4);
		caballos++;	
	}

	public void crearLeon(String nombre, int edad, String genero) {
		Mamifero objM = new Mamifero (nombre, edad, "selva", genero, true, 4 );
		leones++;
	}
}
