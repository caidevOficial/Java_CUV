/**
 * 
 */
package Ejercicios_C06;

/**
 * @author FacuFalcone
 *
 */
public class Ejercicio_04 {

	/**
	 * 4 - Sustituye todos los espacios de un string por asteriscos.
	 * @param word String con espacios.
	 * @return Retorna el string con asteriscos en vez de espacios.
	 */
	public static String ReplaceSpaces(String word) {
		String wordToReturn = null;
		if(word!=null) {
			wordToReturn = word.replace(" ", "*");
		}
		return wordToReturn;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ReplaceSpaces("Time to play !"));
	}
}
