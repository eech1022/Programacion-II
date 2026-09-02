/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacionlineal;
import java.math.*;
import java.util.Scanner;
public class EcuacionLineal {
    private
            float a,b,c;
    public
            EcuacionLineal(float a,float b,float c){
                this.a=a;
                this.b=b;
                this.c=c;
            }
            EcuacionLineal(){
                this.a=0;
                this.b=0;
                this.c=0;
            }
            void leer(){
                Scanner sc=new Scanner(System.in);
                System.out.println("ingrese a,b,c: ");
                a=sc.nextFloat();
                b=sc.nextFloat();
                c=sc.nextFloat();
            }
            void solucion(){
                if(getDiscriminante()>0){
                    System.out.println("La ecucion tiene 2 raices "+raiz1()+" y "+raiz2());
                }
                if(getDiscriminante()==0){
                    System.out.println("La ecucion tiene una raiz "+raiz1());
                }
                if(getDiscriminante()<0){
                    System.out.println("La ecucion no tiene raices reales");
                }
            }
            double getDiscriminante(){
                double x=(b*b)-4*(a*c);                                
                return x;
            }
            float raiz1(){
            double x=Math.sqrt(getDiscriminante());
            float x1=-b+convertir(x);
            float x2=2*a;
            float r=x1/x2;
            
            return r;
            }
            float raiz2(){
            double x=Math.sqrt(getDiscriminante());
            float x1=-b-convertir(x);
            float x2=2*a;
            float r=x1/x2;
            
            return r;
            }
            float convertir(double a){
                return (float) a;
            }
            
            
    
    
}
