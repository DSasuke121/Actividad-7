import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese 20 números enteros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < 20; i++) {
            int cuadrado = numeros[i] * numeros[i];
            int cubo = numeros[i] * cuadrado;
            System.out.println("Número: " + numeros[i] + ", Cuadrado: " + cuadrado + ", Cubo: " + cubo);
        }
    }
}