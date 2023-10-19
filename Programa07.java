//Programa No. 07 Pago de Predial
//Fecha: 14 de Octubre 2023
//Elaborado por: Eluin Dasch Hernandez Huerta

import java.util.Scanner;

    public class Programa07 {

        public static void main(String[] args) {
            
            try (Scanner leer = new Scanner (System.in)) {
                System.out.print("Precio a pagar del predial: ");
                float precioBase = leer.nextFloat();

                System.out.print("Ingrese el numero de hijos: ");
                int hijos = leer.nextInt();

                int descuento;

                if(hijos==1){
                    descuento=100;
                } else if(hijos>1 && hijos<5){
                    descuento=200*hijos;
                } else {
                    descuento=300*hijos;
                }

                float precioFinal=precioBase-descuento;

                System.out.println("Su precio a pagar es de: "+precioBase);
                System.out.println("Usted cuenta con: "+ hijos + " por lo que recibira un descuento de: "+ descuento +"$ ");
                System.out.println("Su total a pagar es de: "+precioFinal);
            }

        }
    
    }
