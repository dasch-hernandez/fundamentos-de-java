//Programa No. 06 Sueldo de un Empleado
//Fecha: 14 de Octubre 2023
//Elaborado por: Eluin Dasch Hernandez Huerta

import java.util.Scanner;

    public class Programa06{

            public static void main(String[] args) {
                
                try (Scanner leer = new Scanner (System.in)) {
                    
                    System.out.print("Ingrese sus horas trabajadas en esta semana: ");
                    int horas = leer.nextInt();

                    int horasExtra, sueldoBase, sueldoExtra, sueldo;

                    if(horas>40){
                        sueldoBase=40*180;
                        horasExtra=horas-40;
                        sueldoExtra=horasExtra*200;
                        sueldo=sueldoBase+sueldoExtra;
                    } else {
                        sueldo=horas*180;
                    }
                

                System.out.println("Su sueldo es de: "+sueldo);

                }

            }
    }