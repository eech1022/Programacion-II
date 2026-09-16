/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mipunto;

/**
 *
 * @author Lenovo
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiPunto A=new MiPunto();
        MiPunto B=new MiPunto(10, 30.5);
        System.out.println("distancia xy:"+A.distancia(10, 30.5));
        System.out.println("distancia punto:"+A.distancia(B));
    }
    
}
