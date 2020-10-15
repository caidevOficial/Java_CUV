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

package entidades;

/**
 * @author FacuFalcone
 *
 */
public class Persona {

	// Atributos
	protected int dni;
	protected String nombre;
	
	// Constructores
	/**
	 * Default values of the class.
	 */
	public Persona() {
		this.dni = 11111111;
		this.nombre = "";
	}
	
	/**
	 * @param dni
	 */
	public Persona(int dni) {
		this();
		this.dni = dni;
	}
	
	/**
	 * @param dni
	 * @param nombre
	 */
	public Persona(int dni, String nombre) {
		this(dni);
		if(nombre!=null) {
			this.nombre = nombre;			
		}
	}

	// Getters
	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	// Setters
	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		if(nombre!=null) {
			this.nombre = nombre;			
		}
	}
	
	// Methods
	public void Mostrar() {
		int dni = this.getDni();
		String nombre = this.getNombre();
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
	}
}
