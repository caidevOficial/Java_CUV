/**
 * 
 */
package Ejercicios_C06;

import java.util.Scanner;

/**
 * @author FacuFalcone
 *
 */
public class Ejercicio_05 {

	static Scanner data = new Scanner(System.in);
	
	/**
	 * 5 - Escribe una aplicacion con un string que contenga
	 * una contraseña cualquiera. Despues se te pedira que pongas
	 * la contraseña con 3 intentos. Cuando aciertes ya no te pedira 
	 * mas la contraseñay mostrara un mensaje diciendo "Contraseña correcta"
	 * Pensa bien en la condicion de salida (3 intentos y el acierto).
	 */
	private static void Contrasenha() {
		String password = "Java";
		String passwordByUser;
		int remain = 3;
		boolean passCorrect = false;
		
		do {
			System.out.printf("Quedan %d intentos\n",remain);
			System.out.print("Ingrese una contraseña alfabética: ");
			passwordByUser = data.next();
			if(password.equals(passwordByUser)) {
				passCorrect = true;
				System.out.println("Contraseña Correcta!.");
			}
			remain--;
		}while(remain>0 && !passCorrect);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contrasenha();
	}
}
