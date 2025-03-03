/*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500. */
import java.util.Scanner;

public class Tienda_Compu {
    public static void main(String[] args) {
        short numcomp; double costcompt;
        System.out.println("**-bienvenido al sistema de compra de compuchill-**");
        System.out.println("ingrese la cantidad de computadores que comrprará:");
            Scanner sc = new Scanner(System.in);
            numcomp=sc.nextShort();
            if ( numcomp<5) {
                System.out.println("su compra es de: "+ numcomp +" por lo tanto tendra un descuento del 10%");
                costcompt= numcomp*500;
                costcompt=costcompt-((costcompt*10)/100);
            }
            else{
                if (numcomp>5&&numcomp<10){
                    System.out.println("su compra es de: "+ numcomp +" por lo tanto tendra un descuento del 20%");
                    costcompt= numcomp*500;
                    costcompt=costcompt-(costcompt*20/100);
                }
                else{
                    System.out.println("su compra es de: "+ numcomp +" por lo tanto tendra un descuento del 40%");
                    costcompt=numcomp*500;
                    costcompt=costcompt-(costcompt*40/100);
                }
            }
        System.out.println("el costo de sus computadores es de: $"+costcompt);
    }
}
