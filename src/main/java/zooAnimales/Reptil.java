package zooAnimales;


public class Reptil extends Animal {

		private static Reptil listado[];
		public static int iguanas;
		public static int serpientes;
		private String colorEscamas;
		private int largoCola;
		public static int i = 0;
		
		
		public Reptil[] getListado() {
			return listado;
		}
		public void setListado(Reptil[] listado) {
			this.listado = listado;
		}
		public String getColorEscamas() {
			return colorEscamas;
		}
		public void setColorEscamas(String colorEscamas) {
			this.colorEscamas = colorEscamas;
		}
		public int getLargoCola() {
			return largoCola;
		}
		public void setLargoCola(int largoCola) {
			this.largoCola = largoCola;
		}
		
		public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
			super.setNombre(nombre);
			super.setEdad(edad);
			super.setHabitat(habitat);
			super.setGenero(genero);
			this.colorEscamas = colorEscamas;
			this.largoCola = largoCola;
			listado[i] = this;
			i++;
		}
		public Reptil() {}
		
		
		public int cantidadReptiles() {
			return i;
		}
		
		public String movimiento() {
			return "reptar";
			
		}
		
		
		public void crearIguana( String nombre, int edad, String genero) {
			Reptil obj = new Reptil (nombre, edad, "humedal", genero, "verde", 3);
			listado[i] = this;
			iguanas++;
			i++;
		}
	

		public void crearSerpiente(String nombre, int edad, String genero) {
			Reptil obj = new Reptil (nombre, edad, "jungla", genero, "blanco", 1);
			listado[i] = this;
			serpientes++;
			i++;
		}
		
		
		
}
