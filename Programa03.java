//Programa No. 03 Deporte dependiendo de la temperatura
//Fecha: 15 de Octubre 2023
//Elaborado por: Eluin Dasch Hernandez Huerta

import java.util.Scanner;
    
    public class Programa03 {
        
        public static void main(String[] args) {
            
            try (Scanner dep = new Scanner (System.in)) {

                System.out.print("Ingrese la temperatura en grados Farenheit: ");
                double temperatura = dep.nextDouble();
                
                if(temperatura>85){
                   System.out.println("Su deporte a practicar es Natacion");
                   } else if(temperatura>70 && temperatura<=85){
                   System.out.println("Su deporte a practicar es Tenis");
                   } else if(temperatura>32 && temperatura<=70){
                   System.out.println("Su deporte a practicar es Golf");
                   } else if(temperatura>10 && temperatura<=32){
                   System.out.println("Su deporte a practicar es Esqui");
                   } else {
                   System.out.println("Su deporte a practicar es Marcha");
                   }
            }

        }

    }
