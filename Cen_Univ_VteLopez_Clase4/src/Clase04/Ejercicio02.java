/**
 * 
 */
package Clase04;

import java.util.Scanner;

/**
 * @author caidev
 *
 */
public class Ejercicio02 {

	/**
	 * Escribir un programa que simule una calculadora básica que realice
	 * operaciones de suma, resta, multiplicación y división. Se deben recibir
	 * como entrada dos números reales y un operador, que puede ser +, -, * ó /. La
	 * salida del programa debe ser el resultado de la operación.
	 */
	public static void Calculadora() {
		int num1;
		int num2;
		double resultado = 0;
		Boolean operacionIncorrecta = true;
		String operacion;
		@SuppressWarnings("resource")
		Scanner opcion = new Scanner(System.in);
		System.out.print("Ingrese el primer numero: ");
		num1 = opcion.nextInt();
		
		System.out.print("Ingrese el segundo numero: ");
		num2 = opcion.nextInt();
		
		System.out.print("Ingrese la operacion [+ | - | * | /]: ");
		operacion = opcion.next();
		
		switch(operacion) {
		case "+":
			resultado = num1+num2;
			operacionIncorrecta = false;
			break;
		case "-":
			resultado = num1-num2;
			operacionIncorrecta = false;
			break;
		case "*":
			resultado = num1*num2;
			operacionIncorrecta = false;
			break;
		case "/":
			if(num2!=0) {
				resultado = (float)num1/num2;
				operacionIncorrecta = false;
			}
			break;
		default:
			System.out.println("Operacion incorrecta!");
			break;
		}
		
		if(!operacionIncorrecta) {
			System.out.println(num1 + operacion + num2 + " es: " + resultado);			
		}else {
			System.out.println("Operacion incorrecta, por favor reintente.");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculadora();
	}

}
