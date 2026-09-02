/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eculineal;
public class main {
    public static void main(String[] args) {
        EcuLineal A=new EcuLineal();
        EcuLineal B=new EcuLineal();
        A.leer();
        B.leer();
        if(A.tieneSolucion()){
            System.out.println("X: "+A.getx()+", Y= "+A.gety());            
        }else{
            System.out.println("La ecuacion no tiene solucion");
        }
        if(B.tieneSolucion()){
            System.out.println("X: "+B.getx()+", Y= "+B.gety());            
        }else{
            System.out.println("La ecuacion no tiene solucion");
        }
    }
}
