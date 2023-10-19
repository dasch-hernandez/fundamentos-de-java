//Programa No. 08 Camisas con Descuento
//Fecha: 14 de Octubre 2023
//Elaborado por: Eluin Dasch Hernandez Huerta

import java.util.Scanner;

    public class Programa08 {
        public static void main(String[] args) {
            
            try (Scanner tienda = new Scanner (System.in)) {

                    System.out.print("Ingrese el total a pagar: ");
                    float pago = tienda.nextInt();

                    System.out.print("Ingrese el total de camisas compradas: ");
                    int camisas = tienda.nextInt();

                    double descuento;

                    if(camisas>=3){
                        descuento=pago*0.20;
                        System.out.println("Se le hara un descuento del 20%");
                    } else {
                        descuento=pago*0.10;
                        System.out.println("Se le hara un descuento del 10%");
                    }

                    double pagoFinal = pago - descuento;

                    System.out.println("Su descuento sera de: "+ descuento +"$ ");
                    System.out.println("Su total a pagar sera de: "+ pagoFinal + "$ ");

                }

        }
    }
