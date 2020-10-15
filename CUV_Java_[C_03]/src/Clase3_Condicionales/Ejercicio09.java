package Clase3_Condicionales;

import java.util.Scanner;

public class Ejercicio09 {

	/**
	 * Escribir un programa que cuando el usuario ingrese el mes, me digacuantos días tiene.
	 */
	public static void InformarDiasdeMes() {
		int numeroMes;
		int cantidadDias = 0;
		
		@SuppressWarnings("resource")
		Scanner mes = new Scanner(System.in);
		
		System.out.print("ingrese el numero de mes: ");
		numeroMes = mes.nextInt();
		
		switch(numeroMes) {
			case 2:
				cantidadDias = 28;
				break;
			case 1: // Enero
			case 3: // Marzo
			case 5:	// Mayo			
			case 7: // Julio
			case 8: // Agosto
			case 10: //Octubre
			case 12: // Diciembre
				cantidadDias = 31;
				break;
			case 4: // Abril
			case 6: // Junio
			case 9: // Septiembre
			case 11: // Noviembre
				cantidadDias = 30;
				break;
		}
		if(numeroMes >0 && numeroMes<13)
		System.out.println("Teniendo en cuenta que el año no es bisiesto, El mes elegido tiene: Dias: " + cantidadDias);
		else
		System.out.println("numero incorrecto");
	}
	public static void main(String[] args) {
		InformarDiasdeMes();
	}
}
