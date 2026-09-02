/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eculineal;
import java.util.Scanner;
public class EcuLineal {
    private
            float a,b,c,d,e,f;
    public
            EcuLineal(float a,float b,float c,float d,float e,float f){
                this.a=a;
                this.b=b;
                this.c=c;
                this.d=d;
                this.e=e;
                this.f=f;
            }
            EcuLineal(float a,float b,float c,float d,float f){
                this.a=a;
                this.b=b;
                this.c=c;
                this.d=d;
                this.e=4;
                this.f=f;
            }
            EcuLineal(){
                this.a=0;
                this.b=0;
                this.c=0;
                this.d=0;
                this.e=0;
                this.f=0;
            }
            void leer(){
                Scanner sc=new Scanner(System.in);
                System.out.println("ingrese a, b, c, d, e, f:");
                a=sc.nextFloat();
                b=sc.nextFloat();
                c=sc.nextFloat();
                d=sc.nextFloat();
                e=sc.nextFloat();
                f=sc.nextFloat();
            }
            boolean tieneSolucion(){
                boolean r=false;
                if ((a*d-b*c)!=0){
                    r=true;
                }
                return r;
            }
            float getx(){
                float x=0;
                float aux1=(e*d)-(b*f);
                float aux2=(a*d)-(b*c);
                x=aux1/aux2;
                return x;
            }
            float gety(){
                float y=0;
                float aux1=(a*f)-(e*c);
                float aux2=(a*d)-(b*c);
                y=aux1/aux2;
                return y;
            }                
}
