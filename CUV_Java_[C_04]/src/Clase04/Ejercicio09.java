/**
 * 
 */
package Clase04;

/**
 * @author caidev
 *
 */
public class Ejercicio09 {

	/**
	 * Escribir un programa que muestre el producto de los 10 primeros
	 * números impares.
	 */
	public static void ProductoDe10Impares() {
		int contadorImpar = 0;
		int productoImpares = 1;
		for(int i = 0;i<50;i++) {
			if(i%2==1 && contadorImpar<10) {
				contadorImpar++;
				productoImpares *= i;
			}
		}
		System.out.println("El priducto de los primeros 10 impares es: " + productoImpares);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProductoDe10Impares();
	}
}
