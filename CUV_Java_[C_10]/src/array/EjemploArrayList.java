/**
 * 
 */
package array;

import java.util.ArrayList;

/**
 * @author facu
 *
 */
public class EjemploArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();
		
		nombres.add("Facu");
		nombres.add("Caidev");
		nombres.add("Quenovi");
		nombres.add("Poseidon");
		
		for(int i = 0;i<nombres.size();i++) {
			System.out.println(nombres.get(i));
		}
		
		nombres.remove(2);
		
		// foreach (tambien puede usarse un for comun)
		for (String string : nombres) {
			System.out.println(string);
		}
	}
	
}
