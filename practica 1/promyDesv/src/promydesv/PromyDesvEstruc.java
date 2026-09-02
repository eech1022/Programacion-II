/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacionlineal;
import java.util.Scanner;
import java.math.*;
public class PromyDesvEstruc {
    public static double promedio(Double Array[]){        
        double x=0;
        for (int i=0;i<10;i++){
            double a=Array[i];
            x=x+a;
        }
        return x/10;
    }
    public static double desviancion(Double Array[]){
        double z=promedio(Array);
        double x=0;
        for (int i=0;i<10;i++){
            double a=Math.pow(Array[i]-z, 2);
            x=x+a;
        }
        double k=Math.sqrt(x/9);
        return k;
    }
      
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Double [] S=new Double [10]; 
        for (int i=0;i<10;i++){
            S[i]=sc.nextDouble();
        }
        System.out.println("prom "+promedio(S));
        System.out.println("desvi "+desviancion(S));
        
    }
    
}
