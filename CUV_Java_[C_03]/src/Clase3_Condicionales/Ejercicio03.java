/**
 * 
 */
package Clase3_Condicionales;

import java.util.Scanner;

/**
 * @author caidev
 *
 */
public class Ejercicio03 {

	/**
	 *  Escriba un programa que permita leer dos valores numéricos A y B. 
	 *  Si A es mayor que B debe realizar la suma de ambos, caso contrario, 
	 *  se hace el producto.
	 */
	public static void SumaroMultiplicarMaximo() {
		int num1;
		int num2;
		int resultado;
		System.out.print("Ingrese el primer numero: ");
		@SuppressWarnings("resource")
		Scanner numero = new Scanner(System.in);
		num1 = numero.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		num2 = numero.nextInt();
		
		if(num1 > num2) {
			resultado = num1 + num2;
			System.out.println("El maximo es " + num1 + " y la suma de ambos es: " + resultado);
		}
		else if(num1<num2) {
			resultado = num1 * num2;
			System.out.println("El maximo es " + num2 + " y el producto de ambos es: " + resultado);
		}
		else
			System.out.println("Los numeros son iguales");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SumaroMultiplicarMaximo();
	}
}
