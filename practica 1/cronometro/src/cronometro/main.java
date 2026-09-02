/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cronometro;

import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class main {
    public static void main(String[] args){
        Cronometro A=new Cronometro(13,20,35,13,22,15);
        int[] S=new int[100000];
        
        for(int i=0;i<S.length;i++){
            
            Random random = new Random();
            int numeroAleatorio = random.nextInt(100000) + 1;
            S[i]= numeroAleatorio ;
        }
        SelectionSort ss = new SelectionSort();
        A.inicia();
        ss.selectionSort(S);
        A.detener();
        A.mostrar();
        A.lapsoDeTiempo();
        
    }
    
}
    
    

