/*En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra. */
import java.util.Scanner;

public class serviteca {
    public static void main(String[] args) {
        int numllant; double costllant;
        System.out.println("**-bienvenido al sistema de compra de serviteca la butifarra-**");
        boolean seguir=true;
        while (seguir) {
            System.out.println("ingrese la cantidad de llantas que comrprará:");
            Scanner sc = new Scanner(System.in);
            numllant=sc.nextInt();
            sc.nextLine();
            if ( numllant<5) {
                System.out.println("su compra es de: "+ numllant +" por lo tanto tendra un costo de 100 cada una");
                costllant= numllant*100;
            }
            else{
                if (numllant>5&&numllant<=10){
                    System.out.println("su compra es de: "+ numllant +" por lo tanto tendra un costo de 75 cada una");
                    costllant= numllant*75;
                }
                else{
                    System.out.println("su compra es de: "+ numllant +" por lo tanto tendra un costo de 50 cada una");
                    costllant=numllant*50;
                }
            }
        System.out.println("el costo de sus llantas en esta compra es de: $"+costllant);
        boolean contseguir=true;
        while (contseguir) {
            System.out.println("¿desea generar otra compra? (S/N)");
            String rto=sc.nextLine();
            if (rto.toUpperCase().equals("N")) {
                seguir=false;
                contseguir=false;
            } else  {if (rto.toUpperCase().equals("S")) {
                seguir = true;
                contseguir = false;
            } else {
                System.out.println("¡error!, ingrese N o S para continuar con el proceso");
                contseguir=true;
            }
            }
        }
        }
    }
}