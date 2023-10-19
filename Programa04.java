//Programa No. 04  Que numero es mayor y cual menor
//Fecha:15 de Octubre 2023
//Elaborado por: Eluin Dasch Hernandez Huerta

import java.util.Scanner;

    public class Programa04 {
        public static void main(String[] args) {

            try (Scanner number = new Scanner(System.in)) {
                System.out.print("Ingrese el primer número: ");
                double numero1 = number.nextDouble();

                System.out.print("Ingrese el segundo número: ");
                double numero2 = number.nextDouble();

                if (numero1 == numero2) {
                    System.out.println("Ambos números son iguales.");
                } else if (numero1 > numero2) {
                    System.out.println("El primer número es mayor que el segundo.");
                    System.out.println("El segundo número es menor que el primero.");
                } else {
                    System.out.println("El segundo número es mayor que el primero.");
                    System.out.println("El primer número es menor que el segundo.");
                }
            }

        }
    }