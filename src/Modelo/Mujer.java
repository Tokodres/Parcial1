package Modelo;

public class Mujer extends Personas {

	public Mujer(String sexo, float peso, int altura, int edad) {
		super(sexo, peso, altura, edad);
		
	}

	@Override
	public double calculoTMB() {
		double resultado;
		resultado = 447.593 + (9.247*this.peso) + (3.098 * this.altura) - (4.33 * this.edad);
		return resultado;
	}

}
