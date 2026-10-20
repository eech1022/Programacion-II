package juego2;
public class Juego2 {
    public static void main(String[] args) {
        juegoAdivinaNumero A=new juegoAdivinaNumero(3);
        System.out.println("juego adivina un numero");
        A.juega();
        juegoAdivinaPar B=new juegoAdivinaPar(3);
        System.out.println("juego adivina un numero par");
        B.juega();
        juegoAdivinaImpar C=new juegoAdivinaImpar(3);
        System.out.println("juego adivina un numero impar");
        C.juega();
    }
}
