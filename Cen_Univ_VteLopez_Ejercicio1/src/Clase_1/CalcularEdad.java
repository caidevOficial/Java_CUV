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
 * Type			: Ejercicio 5.
 * SO			: [Linux]
 * Version		: Beta 1.0.0 [Beta v1.0.0]
 * ============================================================================
 */

package Clase_1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalcularEdad {
	
	/***
	 * Dado una edad, expresarla en días, horas, minutos y segundos.
	 */
	public static void CalcularLaEdad() {
		long cantSegundos = 0;
		long cantMinutos = 0;
		long cantHoras = 0;
		int cantDias = 0;
		int dia;
		int nroMes;
		int anho;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese su dia [numero] de nacimiento: ");
		dia = input.nextInt();
				
		System.out.print("Ingrese su mes [numero] de nacimiento: ");
		nroMes = input.nextInt();
		
		System.out.print("Ingrese su año [numero] de nacimiento: ");
		anho = input.nextInt();
		
		// guardo fecha actual
		LocalDate fechaActual = LocalDate.now();
		// guardo fecha naciemiento
		LocalDate nacimiento = LocalDate.of(anho, nroMes, dia);
		
		// hallo periodo entre nacimiento y fecha actual
        Period rango = Period.between(nacimiento, fechaActual);
        cantDias = ((rango.getYears()*12)+rango.getMonths())*365 + rango.getDays();
        cantHoras = cantDias*24;
        cantMinutos = cantHoras*60;
        cantSegundos = cantMinutos*60;

        System.out.println("Tenes: ");
        System.out.println("Años: " + rango.getYears());
        System.out.println("Meses: " + rango.getMonths());
        System.out.println("Dias: " + rango.getDays());
        System.out.println("Total de Dias: " + cantDias);
        System.out.println("Total Horas: " + cantHoras);
        System.out.println("Total Minutos: " + cantMinutos);
        System.out.println("Total Segundos: " + cantSegundos);
	}
	
	public static void main(String[] args) {
		CalcularLaEdad();
	}
}
