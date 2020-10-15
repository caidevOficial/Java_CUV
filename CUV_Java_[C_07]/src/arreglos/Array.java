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

package arreglos;

import java.util.Scanner;

/**
 * @author facu
 *
 */
public class Array {

	// carga la matriz de tamanho 'row x column'
	@SuppressWarnings("resource")
	private static void loadMatrix(double[][] matrix, int row, int column) {
		int scoreQuantity;
		double actualScore;
		double sumScore;
		double averageScore;
		Scanner score = new Scanner(System.in);

		for (int rows = 0; rows < (row); rows++) {
			scoreQuantity = 0;
			sumScore = 0;
			for (int columns = 0; columns < (column - 1); columns++) {
				System.out.print((rows + 1) + "° Alumno: Ingrese la " + (columns + 1) + "° Nota: ");
				actualScore = score.nextFloat();
				sumScore += actualScore;
				matrix[rows][columns] = actualScore;
				scoreQuantity++;
				// si cargue notas hasta la anteultima columna, cargo el promedio en la ultima.
				if (scoreQuantity == (column - 1)) {
					averageScore = sumScore / (column - 1);
					matrix[rows][(columns + 1)] = averageScore;
				}
			}
			System.out.println("___________________________________________");
		}
	}

	// Imprime la matriz con sus valores
	private static void showMatrix(double[][] matrix, int row, int column) {
		String patron = "[%5.2f] ";
		System.out.print("           ");
		// Imprimo encabezados.
		for (int columns = 0; columns < (column - 1); columns++) {
			System.out.print(" Nota" + (columns + 1) + "  ");
		}
		System.out.println("Promedio");

		// Imprimo notas y promedios.
		for (int rows = 0; rows < row; rows++) {
			System.out.print("[Alumno " + (rows + 1) + "] ");
			for (int columns = 0; columns < column; columns++) {
				String answer = String.format(patron, matrix[rows][columns]);
				System.out.print(answer);
			}
			System.out.println("\n");
		}
	}

	/**
	 * Diseñar un programa que permita cargar las notas de cada uno de los 5 alumnos
	 * de un curso. Cada alumno tiene 3 notas donde las notas de un alumno
	 * corresponden a una fila de una matriz. Elaborar un algoritmo que calcule e
	 * imprima el promedio de cada alumno.
	 */
	private static void NotasAlumnos() {
		int rows = 5;
		int columns = 4;
		double matrix[][] = new double[rows][columns];
		loadMatrix(matrix, rows, columns);
		showMatrix(matrix, rows, columns);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NotasAlumnos();
	}
}
