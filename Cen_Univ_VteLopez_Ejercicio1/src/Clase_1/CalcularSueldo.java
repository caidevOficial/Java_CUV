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
 * Type			: Ejercicio 08.
 * SO			: [Linux]
 * Version		: Beta 1.0.0 [Beta v1.0.0]
 * ============================================================================
 */

package Clase_1;

import java.util.Scanner;

public class CalcularSueldo {

	/**
	 * Dadas las horas de trabajo calcular el sueldo de un empleado. Sabiendo
	 * que el valor hora es de $250 y las horas extras se pagan al doble y solo
	 * al mes pueden hacer 15 hs extras.
	 */
	public static void CalcularElSueldo() {
		int valorHora = 250;
		int cantHoras = 0;
		int cantHorasExtras = 0;
		int sueldoFinal = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese cantidad de horas normales trabajadas: ");
		cantHoras = input.nextInt();
		
		System.out.print("Ingrese cantidad de horas extras trabajadas: ");
		cantHorasExtras = input.nextInt();
		
		if(cantHorasExtras<16) {
			sueldoFinal = (cantHoras*valorHora)+(cantHorasExtras*(valorHora*2));
		}else {
			int deudaHoras = cantHorasExtras-15;
			System.out.println("Solo se te pagaran 15hs extras al mes!");
			System.out.println("Te debo " + deudaHoras + " Horas.");
			
			sueldoFinal = (cantHoras*valorHora)+(15*(valorHora*2));
		}
		
		System.out.println("El sueldo final es: $" + sueldoFinal);
	}

	public static void main(String[] args) {
		CalcularElSueldo();
	}
}
