import java.util.Scanner;

public class heladeria {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String sabores []= {"limon","nuez ","lulo ","fresa","crema"};
    int cant[]=new int [5];
    double ventas[]=new double[5];
    boolean continua=true;
        while(continua){
            boolean contvta=true;
                while(contvta){
                    System.out.println("***sabores***");
                    for (int i=0;i<sabores.length;i++){
                        System.out.println((i+1)+". "+sabores[i]);
                    }
                    int sabor=sc.nextInt();
                    sc.nextLine();
                    switch (sabor) {
                        case 1:
                            int cantFLimon=capturaVenta();
                            cant[0] = cantFLimon+cant[0];
                            contvta=false;
                            break;
                        case 2:
                            int cantFNuez=capturaVenta();
                            cant[1]=cant[1]+cantFNuez;
                            contvta=false;
                            break;
                        case 3:
                            int cantFLulo=capturaVenta();
                            cant[2]=cant[2]+cantFLulo;
                            contvta=false;
                            break;
                        case 4:
                        int cantFFresa=capturaVenta();
                            cant[3]=cant[3]+cantFFresa;
                            contvta=false;
                            break;
                        case 5:
                        int cantFCrema=capturaVenta();
                            cant[4]=cant[4]+cantFCrema;
                            contvta=false;
                            break;
                        default:
                        System.out.println("sabor no identificado error");
                        contvta=true;}
                    boolean contsabor=true;
                    while (contsabor) {
                        System.out.println("¿desea incluir otro sabor? (S/N)");
                        String rto=sc.nextLine();
                        if (rto.toUpperCase().equals("N")) {
                            contvta=false;
                            contsabor=false;
                        } else  {if (rto.toUpperCase().equals("S")) {
                            contvta = true;
                            contsabor = false;
                        } else {
                            System.out.println("¡error!, ingrese N o S para continuar con el proceso");
                            contsabor=true;
                        }
                        }
                    }
                }
            boolean cicloconti=true;
            while (cicloconti) {
                System.out.println("¿desea procesar otra factura? (S/N)");
                String rta=sc.nextLine();
                    if (rta.toUpperCase().equals("N")) {
                        continua = false;
                        cicloconti= false;} 
                    else {
                        if (rta.toUpperCase().equals("S")) {
                        continua = true;
                        cicloconti = false;} 
                    else {
                        System.out.println("¡error!, ingrese N o S para continuar con el proceso");
                        cicloconti=true;}
                }  
                }
            }
            int cost[]={2500,2800,2600,2000,3000};
            System.out.println("SABOR | CANTIDAD | VALOR");
            for (int a=0;a<sabores.length; a++) {
                System.out.println(sabores[a]+" |    "+cant[a]+"    | "+(cant[a]*cost[a]));
            }
        }
          /*metodos adicionales */
    public static int capturaVenta(){
        int cantVenta=0;
        Scanner sc = new Scanner(System.in);
        boolean valido=false;
        while (!valido) {
            System.out.println("ingrese la cantidad de la venta :");
            cantVenta=sc.nextInt();
            sc.nextLine();
            if(cantVenta<=0){
                System.out.println("¡la cantidad de la venta no es validad, intente de nuevo!");
            }else{
                valido=true;
            }
        }
        return cantVenta;
}
}
