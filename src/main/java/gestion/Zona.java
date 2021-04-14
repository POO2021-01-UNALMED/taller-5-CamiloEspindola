package gestion;
import zooAnimales.Animal;
public class Zona {
	
	private String nombre;
	private static Zoologico zoo [];
	private static Animal Animales [];
	public static int i = 0;
    
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
	
	
	public void agregarAnimales() {
		Animales[i] = new Animal(); 
		i++;
	}
	
	
	int total = 0;
	
	
	public int cantidadAnimales() {
		for(int i = 0; i<Animales.length; i++) {
			total += Animales[i].getTotalAnimales();
		}
		return total;
	}
	
}
