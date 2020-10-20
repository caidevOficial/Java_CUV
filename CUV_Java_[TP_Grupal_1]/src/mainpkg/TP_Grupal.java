/**
 * 
 */
package mainpkg;

import java.util.Scanner;

import entidades.Carrito;
import entidades.Libro;


/**
 * @author FacuFalcone
 *
 */
public class TP_Grupal {
	
	private static final int EXIT_STATUS = 0;
	static Scanner opc = new Scanner(System.in);
	static Libro librosVenta[] = new Libro[10];
	static Carrito carritoDeCompras[] = new Carrito[50];
	
	/**
	 * Prints the main menu.
	 * @return The selected option.
	 */
	@SuppressWarnings("resource")
	private static int Menu() {
		
		int opcion;
		System.out.println("##### Libreria Shazam! #####");
		System.out.println("[1] - Listar Libros.");
		System.out.println("[2] - Agregar a Carrito.");
		System.out.println("[3] - Listar Carrito.");
		System.out.println("[4] - Vaciar Carrito.");
		System.out.println("[5] - Salir.");	
		System.out.print("Su Opcion: ");
		opcion = opc.nextInt();
	
		return opcion;
	}
	
	/**
	 * Main method of the CRUD.
	 * @param ArrayLibros Array of books to be showed.
	 * @param ArrayCarrito Array of shopping carts.
	 * @return
	 */
	public static int Libreria(Libro []ArrayLibros, Carrito []ArrayCarrito) {
		int respuesta = 1;
		
		do {
			switch(Menu()){
			case 1: // Ver Libros
				Libro.MostrarLibros(ArrayLibros);
				break;
			case 2: // Agregar a carrito
				Carrito.AgregarLibroACarrito(ArrayLibros,ArrayCarrito);
				break;
			case 3: // Listar Carrito y Totales
				if(Carrito.MostrarArrayCarrito(ArrayCarrito)) {
					Carrito.CalcularTotal(ArrayCarrito);
				}else {
					System.out.println(" #### Carrito Vacio, nada para mostrar ####\n\n");
				}			
				break;
			case 4: // Vaciar Carrito
				if(Carrito.VaciarCarrito(ArrayCarrito)) {
					System.out.println("\n #### Carrito Vaciado con exito!#### \n\n");
				}
				break;
			case 5: // Salir
				do {
					System.out.print("Confirma Salir? 0 - SI | 1 - NO: ");
					respuesta = opc.nextInt();
				}while(respuesta!=1 && respuesta!=0);
				break;
			default:
				System.out.println("Opcion incorrecta! Escoja entre [1-5].\n\n");
				break;
			}
		}while(respuesta==1);
		System.out.println("Gracias, vuelvas prontos!");
		return EXIT_STATUS;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* Hardcodeo */
		librosVenta[0] = new Libro(2502, "Lord of the rings", 500);
		librosVenta[1] = new Libro(2503, "Batman & Superman", 600);
		librosVenta[2] = new Libro(2504, "The Hobbit", 700);
		librosVenta[3] = new Libro(2505, "Dracula", 150);
		librosVenta[4] = new Libro(2506, "Harry Potter", 200);
		librosVenta[5] = new Libro(2507, "The Shinning", 450);
		
		
		Libreria(librosVenta,carritoDeCompras);
	}
}
