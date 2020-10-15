/**
 * 
 */
package Clase04;

/**
 * @author caidev
 *
 */
public class Ejercicio08 {

	/**
	 * Escribir todos los números múltiplos de 7 menores que 100.
	 */
	public static void Multiplo7Menora100() {
		for(int i = 1;i<100;i++) {
			if(i%7==0) {
				System.out.println("El " + i + " es multiplo de 7.");
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Multiplo7Menora100();
	}
}
