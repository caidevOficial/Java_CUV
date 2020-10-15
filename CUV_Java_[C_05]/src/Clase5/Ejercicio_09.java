/**
 * 
 */
package Clase5;

import java.util.Scanner;

/**
 * @author Facu
 *
 */
public class Ejercicio_09 {

	/**
	 * Desarrollar un programa que pida una cantidad de artículos comprados y
	 * el precio unitario de ese artículo. Por cada carga debe preguntar si se
	 * desea seguir ingresando de la forma “¿Desea ingresar otro artículo?
	 * [S/N]”. La carga de datos finaliza cuando se detecta una n o N. La
	 * computadora debe mostrar el monto de la factura
	 */
	public static void IngresoProductos() {
		int totalFactura = 0;
		int contador = 0;
		int cantidadProductos;
		String respuestaContinuar = "s";
		@SuppressWarnings("resource")
		Scanner monto = new Scanner(System.in);
		
		System.out.print("Ingrese Cantidad de productos: ");
		cantidadProductos = monto.nextInt();
		
		while(respuestaContinuar.equals("s") && contador<cantidadProductos) {
			System.out.printf("Restan ingresar [%d] Productos.\n",(cantidadProductos-contador));
			System.out.print((contador+1) + "° articulo: Ingrese Monto: $");
			totalFactura += monto.nextInt();
			contador++;
			
			//si ya ingrese la cantidad maxima de articulos, no sigo preguntando
			if(contador<cantidadProductos) {
				// Valido salida
				System.out.println("Desea ingresar otro producto? [S/N]: ");			
				respuestaContinuar = monto.next();
				// Convierto a minuscula
				respuestaContinuar = respuestaContinuar.toLowerCase();				
			}
		}
		
		System.out.printf("Total Factura: $%d",totalFactura);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IngresoProductos();
	}
}
