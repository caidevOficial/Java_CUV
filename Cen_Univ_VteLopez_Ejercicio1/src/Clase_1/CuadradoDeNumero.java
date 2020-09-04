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
 * Type			: Ejercicio 2.
 * SO			: [Linux]
 * Version		: Beta 1.0.0 [Beta v1.0.0]
 * ============================================================================
 */

package Clase_1;

import java.util.Scanner;

public class CuadradoDeNumero {

	/***
	 * Escribir un algoritmo que lea un número y escriba su cuadrado.
	 */
	public static void CuadradoDelNumero() {
		double numero;
		double cuadradoDeNumero = 0;
		
		System.out.print("Ingrese un numero: ");
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		numero = teclado.nextDouble();
		cuadradoDeNumero = Math.pow(numero, 2);
		
		System.out.println("El cuadrado de " + numero + " es: " + cuadradoDeNumero);
	}

	public static void main(String[] args) {
		CuadradoDelNumero();
	}
}
