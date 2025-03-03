/*Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
cualquiera por la compra de su aparato. El IVA es del 19%. */
import java.util.Scanner;

public class proveedormusic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double productocost,finalcost=0;
        System.out.println("** bienvenido al sistema de nuesra tienda**");
        boolean contproducto=true;
        while (contproducto) {
        System.out.println("ingrese el precio de su producto:");
        productocost=sc.nextDouble();
        sc.nextLine();
        if (productocost>500) {
            productocost=productocost-(productocost*0.1);
        }
        boolean pregciclo=true;
        while (pregciclo) {
        System.out.println("¿su producto es de la marca 'NOSY'?(S/N)");
            String nosyres=sc.nextLine();
            if (nosyres.toUpperCase().equals("N")) {
                pregciclo=false;
            }
            else{ if(nosyres.toUpperCase().equals("S")){
                productocost=productocost-(productocost*0.05);
                pregciclo=false; 
            }
            else{pregciclo=true;}
            } 
        }
        productocost=productocost+(productocost*0.19);

        boolean contciclo=true;
        while (contciclo) {
            System.out.println("¿desea agregar otro procducto?(S/N)");
            String sinociclo=sc.nextLine();
            if (sinociclo.toUpperCase().equals("N")) {
                contciclo=false;
                contproducto=false;
            }
            else{ if(sinociclo.toUpperCase().equals("S")){
                contciclo=false;
                contproducto=true;
            }
            else{contciclo=true;}
            } 
        }
        finalcost=productocost+finalcost;
    }
    System.out.println("coste final de su compra: "+finalcost);
}
}