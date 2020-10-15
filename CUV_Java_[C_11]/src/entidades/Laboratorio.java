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
 * @author facu
 *
 */
public class Laboratorio {

	private String nombre;
	private String domicilio;
	private String telefono;
	
	/**
	 * 
	 */
	Laboratorio(){
		this.nombre = "";
		this.domicilio = "";
		this.telefono = "";
	}
	
	/**
	 * @param nombre
	 */
	Laboratorio(String nombre){
		this();
		if(nombre!=null) {
			this.nombre = nombre;
		}
	}

	/**
	 * @param nombre
	 * @param domicilio
	 */
	public Laboratorio(String nombre, String domicilio) {
		this(nombre);
		if(domicilio!=null) {
			this.domicilio = domicilio;			
		}
	}

	/**
	 * @param nombre
	 * @param domicilio
	 * @param telefono
	 */
	public Laboratorio(String nombre, String domicilio, String telefono) {
		this(nombre,domicilio);
		if(telefono!=null) {
			this.telefono = telefono;			
		}
	}

		/** GETTERS*/
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the domicilio
	 */
	public String getDomicilio() {
		return domicilio;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

		/* SETTERS */
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		if(nombre!=null) {
			this.nombre = nombre;			
		}
	}

	/**
	 * @param domicilio the domicilio to set
	 */
	public void setDomicilio(String domicilio) {
		if(domicilio!=null) {
			this.domicilio = domicilio;			
		}
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		if(telefono!=null) {
			this.telefono = telefono;
		}
	}
	
	/**
	 * @author FacuFalcone
	 */
	public void Mostrar() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Domicilio: " + getDomicilio());
		System.out.println("Telefono: " + getTelefono());
	}
}
