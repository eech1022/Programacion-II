/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promydesv;
import java.util.Scanner;
import java.math.*;
public class PromyDesv {
    private
            double a,b,c,d,e,f,g,h,i,j,k;
    public
            PromyDesv(){
                a=0;
                b=0;
                c=0;
                d=0;
                e=0;
                f=0;
                g=0;
                h=0;
                i=0;
                j=0;
            }
            PromyDesv(double a,double b,double c,double d,double e,double f,double g,double h,double i,double j){
                this.a=a;
                this.b=b;
                this.c=c;
                this.d=d;
                this.e=e;
                this.f=f;
                this.g=g;
                this.h=h;
                this.i=i;
                this.j=j;
            }
            void leer(){
                Scanner sc=new Scanner(System.in);
                System.out.println("intro 10 datos: ");
                a=sc.nextDouble();
                b=sc.nextFloat();
                c=sc.nextFloat();
                d=sc.nextFloat();
                e=sc.nextFloat();
                f=sc.nextFloat();
                g=sc.nextFloat();
                h=sc.nextFloat();
                i=sc.nextFloat();
                j=sc.nextFloat();
            }
            
            double promedio(){
                double x=(a+b+c+d+e+f+g+h+i+j)/10;                                
                return x;
            }
            double desviacion(){
                double x1=(a-promedio())*(a-promedio());
                double x2=(b-promedio())*(b-promedio());
                double x3=(c-promedio())*(c-promedio());
                double x4=(d-promedio())*(d-promedio());
                double x5=(e-promedio())*(e-promedio());
                double x6=(f-promedio())*(f-promedio());
                double x7=(g-promedio())*(g-promedio());
                double x8=(h-promedio())*(h-promedio());
                double x9=(i-promedio())*(i-promedio());
                double x10=(i-promedio())*(j-promedio());
                double aux=(x1+x2+x3+x4+x5+x6+x7+x8+x9+x10)/10-1;
                double y=Math.sqrt(aux);
                return y;
            }           
}
