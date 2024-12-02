package figuras;

import java.util.Scanner;

public class Trapecio {
     public static void calculateArea() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Calculadora de Área de un Trapecio");
        System.out.print("Ingrese la base mayor: ");
        double baseMayor = scanner.nextDouble();

        System.out.print("Ingrese la base menor: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = scanner.nextDouble();

        // Calcular el área
        double area = ((baseMayor + baseMenor) / 2) * altura;

        // Mostrar el resultado
        System.out.printf("El área del trapecio es: %.2f%n", area);

        // Cerrar el scanner
        scanner.close();
    }
}