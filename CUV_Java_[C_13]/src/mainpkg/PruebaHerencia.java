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

import entidades.Persona;
import entidadesSub.Alumno;

/**
 * @author FacuFalcone
 *
 */
public class PruebaHerencia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Hardcodeo
		Alumno student = new Alumno(35055007, "Facu", 9, 10);
		Persona person1 = new Persona(35055007, "Caidev");
		System.out.println("Persona:");
		person1.Mostrar();
		System.out.println("_____________");
		
		System.out.println("Alumno:");
		student.Mostrar();
		
	}
}
