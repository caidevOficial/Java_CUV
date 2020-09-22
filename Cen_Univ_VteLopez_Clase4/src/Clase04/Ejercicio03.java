/**
 * 
 */
package Clase04;

/**
 * @author caidev
 *
 */
public class Ejercicio03 {

	/**
	 * Muestra los números del 1 al 100 (ambos incluidos).
	 */
	public static void Mostrar1a100() {
		int contador = 1;
		while(contador<101) {
			System.out.println("N°: " + contador);
			contador++;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mostrar1a100();
	}
}
