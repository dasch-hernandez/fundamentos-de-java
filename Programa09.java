//Programa No. 09 Tienda Levi's
//Fecha: 14 de Octubre 2023
//Elaborado por: Eluin Dasch Hernandez Huerta

    import java.util.Scanner;

    public class Programa09 {

        public static void main(String[] args) {
            
            try (Scanner levis = new Scanner (System.in)) {

                System.out.print("Ingrese el total a pagar: ");
                float pago = levis.nextFloat();

                double descuento=0;

                if(pago>7000){
                    descuento=pago*0.30;
                    System.out.println("Usted recibira un descuento del 30%");
                }else if(pago>5000 && pago<=7000){
                    descuento=pago*0.25;
                    System.out.println("Usted recibira un descuento del 25%");
                }else if(pago>3000 && pago<=5000){
                    descuento=pago*0.20;
                    System.out.println("Usted recibira un descuento del 20%");
                }else if(pago>2000 && pago<=3000){
                    descuento=pago*0.15;
                    System.out.println("Usted recibira un descuento del 15%");
                } else{
                    System.out.println("Usted no podra recibir un descuento");
                }

                double pagoFinal = pago - descuento;

                System.out.println("Usted recibio un descuento de: "+ descuento +"$ ");
                System.out.println("Su total a pagar es de: "+ pagoFinal +"$ ");

            }

        }
        
    }
