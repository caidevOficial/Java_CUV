/**
 * 
 */
package Clase04;

/**
 * @author caidev
 *
 */
public class Ejercicio05 {

	/**
	 * Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y
	 * 3. Utiliza el bucle que desees.
	 */
	public static void DivisiblesEntre2y3() {
		for(int i = 1;i<101;i++) {
			if(i%2==0 && i%3==0) {
				System.out.println("Numero: " + i);
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DivisiblesEntre2y3();
	}
}
