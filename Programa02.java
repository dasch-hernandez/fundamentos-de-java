//Programa No. 02 Indique que numero es mayor
//Fecha: 15 de OCtubre 2023
//Elaborado por: Eluin Dasch Hernandez Huerta

import java.util.Scanner;

    public class Programa02 {
        
        public static void main(String[] args) {
            
            try (Scanner number = new Scanner (System.in)) {
                System.out.print("Ingrese tres numeros diferentes: ");
                int n1 = number.nextInt();
                int n2 = number.nextInt();
                int n3 = number.nextInt();

                int mayor, pos;

                if(n1>n2 && n1>n3){
                    mayor = n1;
                    pos=1;
                } else if (n2>n1 && n2>n3){
                    mayor = n2;
                    pos=2;
                } else {
                    mayor = n3;
                    pos=3;
                }

                System.out.println("El numero mayor es: "+ mayor + " y se encuentra en la posicion: "+ pos);
            }

        }

    }
