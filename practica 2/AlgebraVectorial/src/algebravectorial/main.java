/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algebravectorial;

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
        AlgebraVectorial A=new AlgebraVectorial(1, 2, 0);
        AlgebraVectorial B=new AlgebraVectorial(2, 4, 0);
        A.perpendicular(B);
        B.perpendicular(A, 0);
        A.perpendicular(B, "");
        A.perpendicular(B, Boolean.TRUE);
        A.paralela(B);
        A.paralela(B, 0);
        A.Proyeccion_de_a_en_b(B).mostrar();
        System.out.println("com: "+A.Componente_de_a_en_b(B));
        
    }
}
