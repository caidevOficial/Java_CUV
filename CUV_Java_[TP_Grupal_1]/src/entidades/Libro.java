/*
 * Copyright (C) 2020 FacuFalcone
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
public class Libro {

	// Atributos
	protected int isbn;
	protected String nombre;
	protected double precio;
	
	// Constructores
	
	/**
	 * Set default values of the book.
	 */
	public Libro() {
		this.setIsbn(0);
		this.setNombre("");
		this.setPrecio(0);
	}
	
	/**
	 * @param isbn Unic number of identificacion of the book.
	 */
	public Libro(int isbn) {
		if(isbn>0) {
			this.setIsbn(isbn);
		}
	}
	
	/**
	 * @param isbn Unic number of identificacion of the book.
	 * @param nombre name of the book.
	 */
	public Libro(int isbn, String nombre) {
		this(isbn);
		if(nombre!=null) {
			this.setNombre(nombre);
		}
	}
	
	/**
	 * @param isbn Unic number of identificacion of the book.
	 * @param nombre name of the book.
	 * @param precio price of the book.
	 */
	public Libro(int isbn, String nombre, double precio) {
		this(isbn, nombre);
		if(precio>=0) {
			this.setPrecio(precio);
		}
	}

	// Getters
	/**
	 * @return the isbn
	 */
	public int getIsbn() {
		return isbn;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	// Setters
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(int isbn) {
		if(isbn>=0) {
			this.isbn = isbn;			
		}
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
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		if(precio>=0) {
			this.precio = precio;			
		}
	}
	
	// Methods
	/**
	 * Search the index of the book by it's isbn.
	 * @param ArrayLibros Array to search for.
	 * @param isbn Number of the book.
	 * @return Return the index of the book or -1 if error.
	 */
	public static int BuscarLibroPorISBN(Libro []ArrayLibros, int isbn) {
		int index = -1;
		for (int i = 0; i < ArrayLibros.length; i++) {
			if(ArrayLibros[i]!=null && ArrayLibros[i].getIsbn() == isbn) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	/**
	 * Prints the info of the book.
	 */
	public void Mostrar() {
		System.out.printf(" [%3d] [%-17s] [$%8.2f]",this.getIsbn(), this.getNombre(), this.getPrecio());
	}
	
	/**
	 * Prints on screen all the books in the array.
	 * @param libros Array to be inspected.
	 */
	public static void MostrarLibros(Libro []libros) {
		if(libros!=null) {
			System.out.println("  ISBN        NOMBRE           PRECIO");
			System.out.println("_______________________________________");
			for (int i = 0; i < libros.length; i++) {
				if(libros[i]!=null) {
					libros[i].Mostrar();
					System.out.println("");					
				}
			}
			System.out.println("______________________________________\n\n");
		}else {
			System.out.println("No hay libros para mostrar");
		}
	}
}
