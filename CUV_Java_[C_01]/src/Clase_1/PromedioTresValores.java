/*
 * ============================================================================
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 * ============================================================================
 * Author		: FacuFalcone.
 * Type			: Ejercicio 1.
 * SO			: [Linux]
 * Version		: Beta 1.0.0 [Beta v1.0.0]
 * ============================================================================
 */

package Clase_1;

public class PromedioTresValores {

	/**
	 * Escribir un algoritmo que halle el promedio de tres valores A, B, C ingresados.
	 * El mismo debe mostrar los tres valores por separado y luego el valor promedio.
	 */
	public static void PromedioTresNumeros() {
		int numero1 = 16;
		int numero2 = 45;
		int numero3 = 30;
		int suma = 0;
		double promedio;
		
		suma = numero1 + numero2 + numero3;
		promedio = (double)suma/3;
		
		System.out.println("Numero 1: " + numero1);
		System.out.println("Numero 2: " + numero2);
		System.out.println("Numero 3: " + numero3);
		System.out.println("La suma es: " + suma);
		System.out.println("El promedio es: " + promedio);
	}

	public static void main(String[] args) {
		PromedioTresNumeros();
	}
}
