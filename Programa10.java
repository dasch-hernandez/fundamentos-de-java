//Programa No. 10 Ordenar de mayor a menor
//Fecha: 14 de Octubre 2023
//Elaborado por: Eluin Dasch Hernandez Huerta

import java.util.Scanner;

   public class Programa10{

      public static void main(String[] args){
      
         int num1, num2, num3;
         
         try (Scanner leer = new Scanner (System.in)) {

        System.out.print("Ingrese su primer numero: ");
        num1=leer.nextInt();
        System.out.print("Ingrese su segundo numero: ");
        num2=leer.nextInt();
        System.out.print("Ingrese su tercer numero: ");
        num3=leer.nextInt();
         
        int mayor, medio, menor;
         
        if(num1>=num2 && num1>=num3){
         mayor = num1;
            if (num2 >= num3){
            medio=num2;
            menor=num3;
            } else {
            medio=num3;
            menor=num2;
            }           
         } else if(num2>=num1 && num2>=num3){
           mayor = num2;
            if (num1>=num3){
            medio=num1;
            menor=num3;
            } else {
            medio=num3;
            menor=num1;
            }
         } else {
           mayor=num3;
            if (num1>=num2){
            medio=num1;
            menor=num2;
            } else {
            medio=num2;
            menor=num1;
            }
         }
         
        System.out.println("Números ordenados de mayor a menor: " + mayor + ", " + medio + ", " + menor);
        }
      }
   }
