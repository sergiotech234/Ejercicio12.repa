import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [][] matriz = new int[n][n];
// Pedir los valores al usuario
    System.out.println("Ingrese los 9 valores de la matriz 3x3:");
    for (int fila = 0; fila < n; fila++) {
        for (int columna = 0; columna < n; columna++) {
            System.out.print("Elemento [" + fila + "][" + columna + "]: ");
            matriz[fila][columna] = sc.nextInt();
        }
    }
        // Mostrar la matriz en formato tabla
        System.out.println("\nMatriz ingresada:");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }
        // Suma de cada fila (nota dejar las mismas variables)
        System.out.println("\nSuma de cada fila: ");
    for (int fila = 0; fila < n; fila++) {
        int suma = 0;
        for (int columna = 0; columna < n; columna++) {
            suma += matriz[fila][columna];
        }
        System.out.println("Fila "+ fila+ " : "+suma);
    }
        // Suma de cada columna
        System.out.println("\nSuma de cada columna: ");
        for (int fila = 0; fila < n; fila++) {
            int suma = 0;
            for (int columna = 0; columna < n; columna++) {
                suma += matriz[columna][fila];
            }
            System.out.println("columna "+ fila+ " : "+suma);
        }
        // Suma de la diagonal
        int sumaDiagonal = 0;
        for (int fila = 0; fila < n; fila++) {
            sumaDiagonal += matriz[fila][fila];
        }
        System.out.println("\\nSuma de la diagonal principal: " + sumaDiagonal);
    }
}