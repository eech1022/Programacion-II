/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cronometro;
import java.time.LocalTime;
public class Cronometro {
    private LocalTime inicia;
    private LocalTime finaliza;
    public
            Cronometro(){
                inicia=LocalTime.now();
                finaliza=LocalTime.now();
            }
            Cronometro(int a,int b,int c,int d,int e,int f){
                inicia=LocalTime.of(a, b, c);
                finaliza=LocalTime.of(d, e, f);
            }
            void mostrar(){
                System.out.println("inicio:"+inicia);
                System.out.println("fin:"+finaliza);
            }
            void inicia(){
                inicia=LocalTime.now();                
            }
            void detener(){
                finaliza=LocalTime.now();
            }
            void lapsoDeTiempo(){
                int a=inicia.getNano();
                int a1=inicia.getSecond();
                int a2=inicia.getMinute();
                int a3=inicia.getHour();
                int am=horAMil(a3)+segAMil(a1)+minAMil(a2)+nanAMil(a);
                
                int b=finaliza.getNano();
                int b1=finaliza.getSecond();
                int b2=finaliza.getMinute();
                int b3=finaliza.getHour();
                int bm=horAMil(b3)+segAMil(b1)+minAMil(b2)+nanAMil(b);
                
                int c=(bm-am);
                System.out.println("lapso de tiempo en milisegundos: "+(c));
            }
            int horAMil(int a){
                int x=0;
                x=a*1000;
                x=x*3600;                
                return x;
            }
            int minAMil(int a){
                int x=0;
                x=a*1000;
                x=x*60;                
                return x;
            }
            int segAMil(int a){
                int x=0;
                x=a*1000;                
                return x;
            }
            int nanAMil(int a){
                int x=0;
                x=a/1000000;                
                return x;
            }                
}
