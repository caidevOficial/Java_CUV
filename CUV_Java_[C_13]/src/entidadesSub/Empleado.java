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

package entidadesSub;

import entidades.Persona;

/**
 * @author FacuFalcone
 *
 */
public class Empleado extends Persona{

	// Atributos
	private float sueldoBasico;
	private int antiguedad; // anhos

	/**
	 * Set default values os an employee.
	 */
	public Empleado() {
		this.sueldoBasico = 0;
		this.antiguedad = 0;
	}

	/**
	 * @param dni dni of an employee.
	 */
	public Empleado(int dni) {
		super(dni);
	}
	
	/**
	 * @param dni dni of an employee.
	 * @param nombre name of an employee.
	 */
	public Empleado(int dni, String nombre) {
		super(dni,nombre);
	}
	
	/**
	 * @param dni dni of an employee.
	 * @param nombre name of an employee.
	 * @param sueldo salary of an employee.
	 */
	public Empleado(int dni, String nombre, float sueldo) {
		this(dni,nombre);
		this.sueldoBasico = sueldo;
	}
	
	/**
	 * @param dni dni of an employee.
	 * @param nombre name of an enployee.
	 * @param sueldo salary of an employee.
	 * @param antiguedad years of work.
	 */
	public Empleado(int dni, String nombre,float sueldo, int antiguedad) {
		this(dni,nombre,sueldo);
		this.antiguedad = antiguedad;
	}

	/**
	 * @return the sueldoBasico
	 */
	public float getSueldoBasico() {
		return sueldoBasico;
	}

	/**
	 * @return the antiguedad
	 */
	public int getAntiguedad() {
		return antiguedad;
	}

	/**
	 * @param sueldoBasico the sueldoBasico to set
	 */
	public void setSueldoBasico(float sueldoBasico) {
		if(sueldoBasico>=0) {
			this.sueldoBasico = sueldoBasico;			
		}
	}

	/**
	 * @param antiguedad the antiguedad to set
	 */
	public void setAntiguedad(int antiguedad) {
		if(antiguedad>=0) {
			this.antiguedad = antiguedad;			
		}
	}
	
	/**
	 * @return El sueldo real
	 */
	//@SuppressWarnings("unused")
	private float CalcularSueldo() {
		int antiguedad = this.getAntiguedad();
		float sueldo = this.getSueldoBasico();
		float sueldoReal = sueldo + (sueldo*antiguedad/100);

		return sueldoReal;
	}

	/**
	 *  Prints on screen all the fields of an employee.
	 */
	public void Mostrar() {
		super.Mostrar();
		System.out.println("Sueldo basico: " + this.getSueldoBasico());
		System.out.println("Antiguedad: " + this.getAntiguedad());
		System.out.println("Sueldo: " + this.CalcularSueldo());
	}
}
