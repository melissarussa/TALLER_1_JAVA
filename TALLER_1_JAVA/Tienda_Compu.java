import java.util.Scanner;

public class Tienda_Compu {
    public static void main(String[] args) {
        short numcomp; long costocomp;
        
        System.out.println("bienvenido al sistema de compra, ingrese la cantidad de computadores que comrprará:");
        
        Scanner input = new Scanner(System.in);
        numcomp=input.nextShort();

        System.out.println("su compra es de: "+numcomp);

    }
}
