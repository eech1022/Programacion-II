package juego2;
import java.util.*;
public class juegoAdivinaNumero extends juego{
    protected 
            int numeroAadivinar;
    public
            juegoAdivinaNumero(int a){
                super(a);
            }            
            void juega(){
                int ax=super.getNumeroDevidas();
                reiniciaPartida(ax);
                Random r= new Random();
                int a= r.nextInt(-1, 11);
                while(!validaNumero(a)){
                    a= r.nextInt(-1, 11);
                }                
                System.out.println("jugador adivina un numero del 0 al 10");
                Scanner sc=new Scanner(System.in);   
                boolean k=true;
                while(k){
                    int x=sc.nextInt();
                    if(validaNumero(x)){
                        if (x==a){
                            System.out.println("acertaste");
                            k=false;
                        }else{
                            k=super.quitaVida();
                            if(k){
                                if(x<a){
                                    System.out.println("el numero es menor al que tienes que encontrar");
                                }else{
                                    System.out.println("el numero es mayor al que tienes que encontrar");
                                }
                            }else{
                                System.out.println("no quedan mas vidas . adios..");
                                System.out.println("sol: "+a);
                            }
                        } 
                    }else{
                        System.out.println("ingresa un numero valido");
                    }
                }                
            }
            boolean validaNumero(int a){
                boolean x=false;
                if(0<=a && a<=10){
                    x=true;
                }
                return x;
            }
}
