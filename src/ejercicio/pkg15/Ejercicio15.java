
package ejercicio.pkg15;

import java.util.Scanner;


public class Ejercicio15 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num=0;
        
        do{
            System.out.println("Ingrese un valor");
            num=sc.nextInt();   
        }while(num<=0);
        System.out.println("El valor ingresado es: "+num);
    }
    
}
