package Modelo;



public class Hombre extends Personas {

	
	
	public Hombre(String sexo, float peso, int altura, int edad) {
		super(sexo, peso, altura, edad);
		
	}

	@Override
	public double calculoTMB() {
		double resultado;
		resultado = 88.362 + (13.397*this.peso) + (4.799 * this.altura) - (5.677 * this.edad);
		return resultado;
	}
	
	
	
	

	
	
}
