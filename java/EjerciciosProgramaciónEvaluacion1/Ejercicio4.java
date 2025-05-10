/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosProgramaciónEvaluacion1;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("INGRESE CANTIDAD DE CARACTERES: ");
        int n = scanner.nextInt();
        char[] caracteres = new char[n];
        
        scanner.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.print("CARACTER " + (i + 1) + ": ");
            caracteres[i] = scanner.nextLine().charAt(0);
        }
        
        char[] unicos = new char[n];
        int[] conteos = new int[n];
        int cantidad = 0;

        // Contar frecuencias
        for (int i = 0; i < n; i++) {
            char actual = caracteres[i];
            boolean yaContado = false;

            for (int j = 0; j < cantidad; j++) {
                if (unicos[j] == actual) {
                    conteos[j]++;
                    yaContado = true;
                    break;
                }
            }

            if (!yaContado) {
                unicos[cantidad] = actual;
                conteos[cantidad] = 1;
                cantidad++;
            }
        }

        System.out.println("FRECUENCIA DE CARACTERES:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(unicos[i] + ": " + conteos[i]);
        }
    }
    
}
