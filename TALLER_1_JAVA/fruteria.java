/*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
0 - 2                       0%
2.01 - 5                    10%
5.01 - 10                   15%
10.01 en adelante           20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería. */
import java.util.Scanner;

public class fruteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double desc[]={10,15,20};
        double  costo,Fcost,Fcostestesi=0,ciclo=0;
        while (ciclo<2) {
        System.out.println("cuantos kilos de mazana comparara?");
        double peso = sc.nextDouble();
        costo=peso*10000;
        if (peso>=2.01||peso<=5) {
            Fcost=costo-(costo/desc[0]);
        }else{
            if (peso>=5.01||peso<=10) {
                Fcost=costo-(costo*desc[1]);
            }else{
                if (peso>=10.01) {
                    Fcost=costo-(costo*desc[2]);
                }else{
                    Fcost=costo;
                }
            }
        }
        Fcostestesi=Fcost+Fcostestesi;
        System.out.println("hasta ahora debe pagar :"+ Fcostestesi);
        ciclo=ciclo+añadirmas();
    }
    System.out.println("el total de manzanas con su respectivo descuento: "+ Fcostestesi);
    }
    public static int añadirmas(){
        int numxd=0;
        Scanner sc=new Scanner(System.in);
        boolean masmanzanas=true;
        while (masmanzanas) {
            System.out.println("¿desea incluir más manzanas? (S/N)");
            String rto=sc.nextLine();
            if (rto.toUpperCase().equals("N")) {
                masmanzanas = false;
                numxd++;
            } else  {if (rto.toUpperCase().equals("S")) {
                masmanzanas = false;
                numxd++;
            } else {
                System.out.println("¡error!, ingrese N o S para continuar con el proceso");
                masmanzanas = true;
                numxd=numxd+2;
            }
            }
        }
        return numxd;
    }
}