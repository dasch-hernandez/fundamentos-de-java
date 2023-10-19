//Programa No. 05 Hora
//Fecha: 15 de Octubre 2023
//Elaborado por: Eluin Dasch Hernandez Huerta

import java.util.Scanner;

    public class Programa05 {
        public static void main(String[] args) {

            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Ingrese la hora (en horas): ");
                int horas = scanner.nextInt();

                System.out.print("Ingrese los minutos: ");
                int minutos = scanner.nextInt();

                System.out.print("Ingrese los segundos: ");
                int segundos = scanner.nextInt();

                segundos++;

                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                    if (minutos == 60) {
                        minutos = 0;
                        horas++;
                        if (horas == 24) {
                            horas = 0;
                        }
                    }
                }

                System.out.println("La hora aumentada en un segundo es: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
            }

        }
    }