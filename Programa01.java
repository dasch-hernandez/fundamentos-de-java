//Programa No. 01 Descuento a trabajador
//Fecha: 15 de Octubre 2023
//Elaborado por: Eluin Dasch Hernandez Huerta

import java.util.Scanner;

    public class Programa01 {

        public static void main(String[] args) {
            
            try (Scanner mat = new Scanner (System.in)) {
                System.out.println("Ingrese cuanto le pagan por hora: ");
                float pagohora = mat.nextFloat();

                System.out.print("Ingrese sus horas trabajadas en esta semana: ");
                int horas = mat.nextInt();

                double sueldo = pagohora*horas;
                double descuento=0, sueldoFinal;

                if(sueldo>3000){
                    descuento = sueldo*0.12;
                    sueldoFinal=sueldo-descuento;
                    System.out.println("Su sueldo es de: "+ sueldo + "$ pero se le descontara: "+ descuento + "$ ");
                    System.out.println("Su paga de esta semana es de: "+ sueldoFinal +"$ ");
                } else{
                    System.out.println("Su paga de esta semana es de: "+ sueldo +"$ ");
                }
            }

        }

    }
