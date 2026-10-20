package juego1;
import java.util.*;
public class juegoAdivinaNumero extends juego{
    private
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
                System.out.println("jugador adivina un numero del 0 al 10");
                Scanner sc=new Scanner(System.in);                
                boolean k=true;
                while(k){
                    int x=sc.nextInt();
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
                        }
                    }   
                }                
            }        
}
