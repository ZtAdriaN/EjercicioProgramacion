/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EjerciciosProgramaciónEvaluacion1;

import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("INGRESE CANTIDAD DE NUMEROS: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("NUMERO " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
            } else {
                sumaImpares += numeros[i];
            }
        }

        int resultado = sumaPares - sumaImpares;
        System.out.println("PARES - IMPARES: " + resultado);
    }
}
