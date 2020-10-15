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
public class Alumno extends Persona {

	private float notaPrimerParcial;
	private float notaSegundoParcial;

	/**
	 * @param dni
	 */
	public Alumno(int dni) {
		super(dni);
	}

	/**
	 * @param dni
	 * @param nombre
	 */
	public Alumno(int dni, String nombre) {
		super(dni, nombre);
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param primerNota
	 */
	public Alumno(int dni, String nombre, float primerNota) {
		super(dni, nombre);
		this.notaPrimerParcial = primerNota;
	}

	/**
	 * @param notaPrimerParcial
	 * @param notaSegundoParcial
	 */
	public Alumno(int dni, String nombre, float primerNota, float segundaNota) {
		this(dni, nombre, primerNota);
		this.notaSegundoParcial = segundaNota;
	}

	/**
	 * @return the notaPrimerParcial
	 */
	public float getNotaPrimerParcial() {
		return notaPrimerParcial;
	}

	/**
	 * @return the notaSegundoParcial
	 */
	public float getNotaSegundoParcial() {
		return notaSegundoParcial;
	}

	/**
	 * @param notaPrimerParcial the notaPrimerParcial to set
	 */
	public void setNotaPrimerParcial(float notaPrimerParcial) {
		this.notaPrimerParcial = notaPrimerParcial;
	}

	/**
	 * @param notaSegundoParcial the notaSegundoParcial to set
	 */
	public void setNotaSegundoParcial(float notaSegundoParcial) {
		this.notaSegundoParcial = notaSegundoParcial;
	}

	public float Promedio() {
		float n1 = this.getNotaPrimerParcial();
		float n2 = this.getNotaSegundoParcial();
		float promedio = ((n1+n2)/2);
		return promedio;
	}

	// Methods
	public void Mostrar() {
		super.Mostrar();
		String mensaje = "Desaprobado";
		if(this.getNotaPrimerParcial()>5 && this.getNotaSegundoParcial()>6) {
			mensaje = String.valueOf(this.Promedio());
		}
		System.out.println("Promedio: " + mensaje);
	}
}
