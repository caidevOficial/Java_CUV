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
 * Type			: Ejercicio 6.
 * SO			: [Linux]
 * Version		: Beta 1.0.0 [Beta v1.0.0]
 * ============================================================================
 */

package Clase_1;

import java.util.Scanner;

public class BeneficioAnual {

	/***
	 * Calcular los beneficios anuales que se obtiene de las ventas de
	 * manzanas y peras. Sabiendo que el precio por kilo de la manzana es de
	 * $80 y el de la pera $70.
	 */
	public static void BeneficiosAnuales() {
		int manzanaKilo = 80;
		int peraKilo = 70;
		int kilosManzana = 0;
		int kilosPeras = 0;
		int beneficioManzana;
		int beneficioPera;
		
		@SuppressWarnings("resource")
		Scanner cantidad  =new Scanner(System.in);
		System.out.print("Ingrese kilos vendidos de manzana este año: ");
		kilosManzana = cantidad.nextInt();
		beneficioManzana = kilosManzana*manzanaKilo;
		
		System.out.print("Ingrese kilos vendidos de peras este año: ");
		kilosPeras = cantidad.nextInt();
		beneficioPera = kilosPeras*peraKilo;
		
		System.out.println("Las ganancias de manzanas son $" + beneficioManzana + " y de peras $" + beneficioPera);
		System.out.println("Ganancias totales: $" + (beneficioManzana+beneficioPera));
	}

	public static void main(String[] args) {
		BeneficiosAnuales();
	}
}
