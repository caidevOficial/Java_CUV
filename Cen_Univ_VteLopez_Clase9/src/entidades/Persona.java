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
 */
public class Persona {

	// Atributos
	private String nombre;
	private String apellido;
	private int edad;
	private int anhoNacimiento;
	
	// Constructores
	public Persona() {
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.anhoNacimiento = 1810;
	}
	/**
	 * @param nombre
	 */
	public Persona(String nombre) {
		this();
		if(nombre!=null) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * @param nombre
	 * @param apellido
	 */
	public Persona(String nombre, String apellido) {
		this(nombre);
		if(apellido!=null) {
			this.apellido = apellido;
		}
	}
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public Persona(String nombre, String apellido, int edad) {
		this(nombre,apellido);
		this.edad = edad;
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param anhoNac
	 */
	public Persona(String nombre, String apellido, int edad, int anhoNac) {
		this(nombre,apellido,edad);
		this.anhoNacimiento = anhoNac;
	}
	
	// Getters & Setters
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		if(nombre!=null) {
			this.nombre = nombre;			
		}
	}
	
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		if(apellido!=null) {
			this.apellido = apellido;			
		}
	}
	
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		if(edad!=0) {
			this.edad = edad;			
		}
	}
}
