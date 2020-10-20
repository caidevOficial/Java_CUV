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

import java.util.Scanner;

/**
 * @author FacuFalcone
 */
public class Carrito {

	static Scanner data = new Scanner(System.in);

	// Atributos
	Libro libro;
	private int cantidadLibros;
	private double subtotal;

	// Constructores
	Carrito() {
		this.libro = null;
		this.setCantidadLibros(0);
		this.setSubtotal(0);
	}

	Carrito(Libro libroComprar) {
		if (libroComprar != null) {
			this.setLibro(libroComprar);
		}
	}

	Carrito(Libro libroComprar, int cantidad) {
		this(libroComprar);
		if (cantidad > 0) {
			this.setCantidadLibros(cantidad);
		}
	}

	Carrito(Libro libroComprar, int cantidad, double subtotal) {
		this(libroComprar, cantidad);
		if (subtotal >= 0) {
			this.setSubtotal(subtotal);
		}
	}

	// Getters
	/**
	 * @return the libro
	 */
	public Libro getLibro() {
		return libro;
	}

	/**
	 * @return the cantidadLibros
	 */
	public int getCantidadLibros() {
		return cantidadLibros;
	}

	/**
	 * @return the subtotal
	 */
	public double getSubtotal() {
		return subtotal;
	}

	// Setters
	/**
	 * @param libro the libro to set
	 */
	public void setLibro(Libro libro) {
		if (libro != null) {
			this.libro = libro;
		}
	}

	/**
	 * @param cantidadLibros the cantidadLibros to set
	 */
	public void setCantidadLibros(int cantidadLibros) {
		if (cantidadLibros >= 0) {
			this.cantidadLibros = cantidadLibros;
		}
	}

	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(double subtotal) {
		if (subtotal >= 0) {
			this.subtotal = subtotal;
		}
	}

	// Methods
	/**
	 * Looks for a free index in the array.
	 * 
	 * @param ArrayLibros array to search the index.
	 * @return return the index or -1 if error.
	 */
	private static int BuscarIndiceLibre(Carrito[] carrito) {
		int freeIndex = -1;
		if (carrito != null) {
			for (int i = 0; i < carrito.length; i++) {
				if (carrito[i] == null) {
					freeIndex = i;
					break;
				}
			}
		}
		return freeIndex;
	}

	/**
	 * Add a book in the array
	 * 
	 * @param libroParaCarrito book to add in the array.
	 * @param ArrayCarrito     Array to save the book.
	 * @return return true if can, else return false.
	 */
	public static boolean AgregarLibroEnCarrito(Libro libroParaCarrito, Carrito[] ArrayCarrito) {
		boolean success = false;
		int index;
		int cantidad = 0;
		do {
			System.out.print("Ingrese cantidad de libros: ");
			cantidad = data.nextInt();
		} while (cantidad < 0);

		if (ArrayCarrito != null && libroParaCarrito != null) {
			index = BuscarIndiceLibre(ArrayCarrito);
			if (index != (-1)) {
				ArrayCarrito[index] = new Carrito(libroParaCarrito, cantidad,
						(libroParaCarrito.getPrecio() * cantidad));
				success = true;
			}
		}

		return success;
	}

	/**
	 * Shows and add a book in the array of carritos.
	 * 
	 * @param ArrayLibros  array of books to show.
	 * @param ArrayCarrito array to save the book.
	 * @return true if can add the book, else returns false.
	 */
	public static boolean AgregarLibroACarrito(Libro[] ArrayLibros, Carrito[] ArrayCarrito) {
		int isbn;
		int index = -1;
		Libro libroAux = null;

		Libro.MostrarLibros(ArrayLibros);
		do {
			System.out.print("Ingrese un ISBN: ");
			isbn = data.nextInt();
			index = Libro.BuscarLibroPorISBN(ArrayLibros, isbn);
		} while (index == -1);

		libroAux = ArrayLibros[index];
		if (AgregarLibroEnCarrito(libroAux, ArrayCarrito)) {
			System.out.println("Libro agregado con exito al carrito!");
			return true;
		}
		return false;
	}

	/**
	 * Obtain the subTotal of every book in the array.
	 * 
	 * @param carrito shopping market to operate.
	 * @return returns the subTotal.
	 */
	public static double CalcularSubTotal(Carrito carrito) {
		return carrito.getSubtotal();
	}

	/**
	 * Obtains the final purchase price and prints it on the screen.
	 * 
	 * @param librosCarrito array of books.
	 */
	public static void CalcularTotal(Carrito[] librosCarrito) {
		double montoTotal = 0;
		for (int i = 0; i < librosCarrito.length; i++) {
			if (librosCarrito[i] != null) {
				montoTotal += CalcularSubTotal(librosCarrito[i]);
			}
		}
		System.out.println("___________________________________________________________");
		System.out.printf("                    " + "                     Total: [$%8.2f]\n", montoTotal);
	}

	/**
	 * Shows an element of the shopping carts.
	 */
	public void MostrarCarrito() {
		this.getLibro().Mostrar();
		System.out.printf("   [%2d]  [$%8.2f]\n", this.cantidadLibros, this.getSubtotal());
	}

	/**
	 * Shows the shopping carts and its prices of the books.
	 * 
	 * @param ArrayCarrito Array to be showed.
	 * @return return true if can show at least 1 book, else false.
	 */
	public static boolean MostrarArrayCarrito(Carrito[] ArrayCarrito) {
		boolean muestraAlMenosUno = false;
		if (ArrayCarrito != null) {
			System.out.println(" __________________________________________________________");
			System.out.println("| ISBN        NOMBRE           PRECIO   CANTIDAD  SUBTOTAL |");
			System.out.println("|__________________________________________________________|");
			for (int i = 0; i < ArrayCarrito.length; i++) {
				if (ArrayCarrito[i] != null) {
					ArrayCarrito[i].MostrarCarrito();
					muestraAlMenosUno = true;
				}
			}
		}
		return muestraAlMenosUno;
	}

	/**
	 * Sets the array in null.
	 * 
	 * @param ArrayCarrito Array to be setted to null.
	 * @return return true if can, else return false.
	 */
	public static boolean VaciarCarrito(Carrito[] ArrayCarrito) {
		boolean carritoVacio = false;
		for (int i = 0; i < ArrayCarrito.length; i++) {
			if (ArrayCarrito[i] != null) {
				ArrayCarrito[i] = null;
				carritoVacio = true;
			}
		}
		return carritoVacio;
	}
}
