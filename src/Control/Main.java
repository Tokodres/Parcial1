package Control;

import java.util.Scanner;

import Modelo.*;

public class Main {

	public static void main(String args[]) {
		menu();
	}

	public static void menu() {
		int opc = 0;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("////////////////////Calculo TMB.//////////////////// ");
			System.out.println("Por favor elija la opcion que desea realizar: ");
			System.out.println("1.Calcular TMB. ");
			System.out.println("2.Salir. ");
			opc = sc.nextInt();
			if(opc ==1) {
				System.out.println("Por favor escoja cual es su genero: ");
				System.out.println("1.Masculino. ");
				System.out.println("2.Femenino. ");
				int sexo = sc.nextInt();
				System.out.println("Por favor digite su peso en kilogramos: ");
				float peso = sc.nextFloat();
				System.out.println("Por favor digite su altura en cm: ");
				int altura = sc.nextInt();
				System.out.println("Por favor digite su edad en años: ");
				int edad = sc.nextInt();

				Personas p;
				if(sexo == 1) {
					p = new Hombre("Hombre", peso, altura, edad);
					System.out.println("El valor de la tasa metabolica basal es de: "+p.calculoTMB());
				}
				else {
					p = new Mujer("Mujer", peso, altura, edad);
					System.out.println("El valor de la tasa metabolica basal es de: "+p.calculoTMB());
				}

			}
			else {
				System.exit(0);
				
			}
		}while(opc !=3);
	
	
	}


}

