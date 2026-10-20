package juego2;
public class juegoAdivinaImpar extends juegoAdivinaNumero{
    public
            juegoAdivinaImpar(int a){
                super(a);
            }
            @Override
            boolean validaNumero(int a){
                boolean x=false;
                if(0<=a && a<=10 && a%2!=0){
                    x=true;
                }
                return x;
            }
}