package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal {

		private Reptil listado[];
		public int iguanas;
		public int serpientes;
		private String colorEscamas;
		private int largoCola;
		int i = 0;
		
		
		
		public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
			super(nombre, edad, habitat, genero);
			this.colorEscamas = colorEscamas;
			this.largoCola = largoCola;
			i++;
		}
		public Reptil() {}
		
		
		public int cantidadReptiles() {
			return iguanas+serpientes+i;
		}
		
		public String movimiento() {
			return "reptar";
			
		}
		
		
		public void crearIguana( String nombre, int edad, String genero) {
			Reptil obj = new Reptil (nombre, edad, "humedal", genero, "verde", 3);
			iguanas++;
		}
	

		public void crearSerpiente(String nombre, int edad, String genero) {
			Reptil obj = new Reptil (nombre, edad, "jungla", genero, "blanco", 1);
			serpientes++;
		}
		
		
		
}
