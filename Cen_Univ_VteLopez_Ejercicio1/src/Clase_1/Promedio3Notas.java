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
 * Type			: Ejercicio 3.
 * SO			: [Linux]
 * Version		: Beta 1.0.0 [Beta v1.0.0]
 * ============================================================================
 */

package Clase_1;

import java.util.Scanner;

public class Promedio3Notas {

	/***
	 * Dadas 3 notas mostrar el promedio.
	 */
	public static void PromedioTresNotas() {
		int sumaNotas = 0;
		double promedioNotas = 0;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 1;i<4;i++) {
			System.out.print("Ingrese la " + i + "° Nota: ");
			sumaNotas += teclado.nextInt();
		}
		promedioNotas = (double)sumaNotas/3;
		System.out.println("El promedio es: " + promedioNotas);
	}

	public static void main(String[] args) {
		PromedioTresNotas();
	}
}
