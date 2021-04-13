package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal {
	private Mamifero listado[];
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	int i = 0;
	
	
	
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
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		i++;
	}
	public Mamifero() {}
	
	public int cantidadMamiferos() {
		return caballos+leones+i;
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
