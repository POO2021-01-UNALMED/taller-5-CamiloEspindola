package gestion;
import zooAnimales.Animal;
public class Zona {
	
	private String nombre;
	private Zoologico zoo [];
	private  Animal Animales [];
	int i = 0;
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico[] getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico[] zoo) {
		this.zoo = zoo;
	}
	public Animal[] getAnimales() {
		return Animales;
	}
	public void setAnimales(Animal[] animales) {
		Animales = animales;
	}
	public Zona (String nombre) {
		this.nombre = nombre;
	}
	public Zona() {}
	
	
	public void agregarAnimales(Animal animalNuevo) {
		Animales[i] = animalNuevo; 
		i++;
	}
	public int cantidadAnimales() {
		return i;
	}
	
}
