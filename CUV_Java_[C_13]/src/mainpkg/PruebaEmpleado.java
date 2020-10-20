/*
 * Copyright (C) 2020 caidev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package mainpkg;

import entidadesSub.Empleado;

/**
 * @author FacuFalcone
 *
 */
public class PruebaEmpleado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Empleado employee = new Empleado(35055007, "Facu", 65000, 10);
		employee.setAntiguedad(10);
		employee.setNombre("Facundo");
		employee.setSueldoBasico(83000);
		
		System.out.println("Empleado 1: ");
		employee.Mostrar();
		System.out.println("_______________");
		System.out.println("Empleado 2: ");
		Empleado employee2 = new Empleado(22222222, "Caidev", 90000);
		employee2.setAntiguedad(3);
		employee2.Mostrar();
	}
}
