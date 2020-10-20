/**
 * 
 */
package Ejercicios_C06;

/**
 * @author FacuFalcone
 *
 */
public class Ejercicio_06 {

	/**
	 * Elimina todos los espacios de un string.
	 * @param word String con espacios.
	 * @return Retorna el string con asteriscos en vez de espacios.
	 */
	private static String DeleteSpaces(String word) {
		String wordToReturn = null;
		if(word!=null) {
			wordToReturn = word.replace(" ", "");
		}
		return wordToReturn;
	}
	
	/**
	 * Comprueba si un string es palindroma.
	 * @param cadena String a comprobar.
	 * @return Restorna true si es, sino false.
	 */
	private static boolean EsPalindromo(String cadena) {
		boolean esPalindromo = false;
		String cadenaReverse = "";
		cadena = DeleteSpaces(cadena.toLowerCase());
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			cadenaReverse += cadena.charAt(i);
		}
		
		if(cadena.equals(cadenaReverse)) {
			esPalindromo = true;
			
		}
		
		return esPalindromo;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(EsPalindromo("Acaso hubo buhos aca"));
	}
}
