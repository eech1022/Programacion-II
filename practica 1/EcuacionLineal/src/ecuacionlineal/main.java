/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacionlineal;
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        EcuacionLineal A=new EcuacionLineal();
        EcuacionLineal B=new EcuacionLineal();
        EcuacionLineal C=new EcuacionLineal();
        A.leer();
        B.leer();
        C.leer();
        A.solucion();
        B.solucion();
        C.solucion();
    }
}
