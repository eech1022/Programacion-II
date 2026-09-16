/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vector_r3;

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
        Vector_R3 A=new Vector_R3(4, 3, 0);
        Vector_R3 B=new Vector_R3(6, 2, 0);
        
        System.out.println("1: "+A.problema(B));
        System.out.println("2: ");
        A.problema(A, B).mostrar();
    }
}
