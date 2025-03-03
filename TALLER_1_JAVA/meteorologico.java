/*El sistema meteorológico local requiere un sistema para capturar la temperatura promedio de cada
día de la semana e imprimir el nombre del día y un mensaje de la percepción de la temperatura
de acuerdo con el valor capturado según la siguiente tabla: */
import java.util.Scanner;
public class meteorologico {
    public static void main(String[] args) {
        String temp[]={"congelante","muy frio","frio","templado","agradable","caliente","muy caliente"};
        String dia[]={"Lunes","Martes","Miercoles","Jueves","viernes","sabado","domingo"};
        for(int i=0; i<dia.length;i++){
            System.out.println(" escriba la temperatura del dia: "+dia[i]);
            Scanner sc= new Scanner(System.in);
            double temperatura=sc.nextInt();
            sc.nextLine();
            if(temperatura<=0){
                System.out.println(dia[i]+" | "+temp[1]);
            }else{
                if (temperatura>=1||temperatura<=10){
                    System.out.println(dia[i]+" | "+temp[2]);
                }else{
                    if (temperatura>=11||temperatura<=20){
                        System.out.println(dia[i]+" | "+temp[3]);
                }else{
                    if (temperatura>=25||temperatura<=29){
                        System.out.println(dia[i]+" | "+temp[4]);
                }else{
                    if (temperatura>=30||temperatura<=35){
                        System.out.println(dia[i]+" | "+temp[5]);
                }else{
                    System.out.println(dia[i]+" | "+temp[6]);
                }
                }
                }
            }
        }
    }
}
}