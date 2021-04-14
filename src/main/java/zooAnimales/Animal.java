package zooAnimales;
import gestion.Zona;
import gestion.Zoologico;
public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private static Zona zona [];
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona[] getZona() {
		return zona;
	}

	public void setZona(Zona[] zona) {
		this.zona = zona;
	}

	
	public int getTotalAnimales() {
		return totalAnimales;
	}

	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}

	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	
	
	public Animal() {}
	
	public String movimiento() {
		return "desplazarse";
	}
	

	
    Mamifero objM;
    Ave objA;
    Reptil objR;
    Pez objP;
    Anfibio objAn;
	public String totalPorTipo() {
		return ("Mamiferos: "+Integer.toString(objM.cantidadMamiferos())+
			    "Aves: "+Integer.toString(objA.cantidadAves())+
			    "Reptiles: "+Integer.toString(objR.cantidadReptiles())+
			    "Peces: "+Integer.toString(objP.cantidadPeces())+
			    "Anfibios: "+Integer.toString(objAn.cantidadAnfibios())
				);
	}
	
    Zoologico objZ;
    Zona objZona;
    
	public String toString() {
		
		return ("Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "
	    +habitat+"y mi genero es "+genero+", la zona en la que me ubico es "+objZona.getNombre()+", en el  "+
		objZ.getNombre());
		
	}
}
