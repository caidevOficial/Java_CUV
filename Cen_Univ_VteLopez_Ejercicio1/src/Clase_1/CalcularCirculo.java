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
 * Type			: Ejercicio 7.
 * SO			: [Linux]
 * Version		: Beta 1.0.0 [Beta v1.0.0]
 * ============================================================================
 */

package Clase_1;

import java.util.Scanner;

public class CalcularCirculo {

	public static double CalcularAreaCirculo(double radio) {
		return (Math.PI*Math.pow(radio, 2));
	}

	public static double CalcularLongitudCirculo(double radio) {
		return (Math.PI*radio*2);
	}

	public static void AreayLongitudCirculo() {
		double radio;
		double longitud;
		double area;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese el radio del circulo: ");
		radio = input.nextDouble();
		area = CalcularAreaCirculo(radio);
		longitud = CalcularLongitudCirculo(radio);
		
		System.out.println("El area es de: " + area);
		System.out.println("La longitud es de: " + longitud);
	}
	
	public static void main(String[] args) {
		AreayLongitudCirculo();
	}
}
