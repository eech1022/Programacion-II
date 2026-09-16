/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector_r3;
import java.math.*;
/**
 *
 * @author Lenovo
 */
public class Vector_R3 {
    private 
            double x,y,z;
    public
            Vector_R3(){
                x=0;
                y=0;
                z=0;
            }

            Vector_R3(double x, double y, double z) {
                this.x = x;
                this.y = y;
                this.z = z;
            }
            Vector_R3 suma(Vector_R3 A){
                Vector_R3 Au=new Vector_R3();
                Au.setX(x+A.getX());
                Au.setY(y+A.getY());
                Au.setZ(z+A.getZ());
                return Au;
            }
            Vector_R3 mul_esca(double a){
                Vector_R3 Au=new Vector_R3();
                Au.setX(x*a);
                Au.setY(y*a);
                Au.setZ(z*a);
                return Au;
            }
            double longi(){
               double aux= Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
               return aux;
            }
            double longi(int a){
               double aux= Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2);
               return aux;
            }
            Vector_R3 normal(){
                Vector_R3 Au=new Vector_R3();
                Au.setX(x/longi());
                Au.setY(y/longi());
                Au.setZ(z/longi());
                return Au;
            }
            double prod(Vector_R3 A,int a){
                double aux=x*A.getX()+y*A.getY()+z*A.getZ();
                return aux;
            }
            Vector_R3 prod(Vector_R3 A){
                Vector_R3 Au=new Vector_R3();
                Au.setX(y*A.getZ()-z*A.getY());
                Au.setY(z*A.getX()-x*A.getZ());
                Au.setZ(x*A.getY()-y*A.getX());
                return Au;
            }
            void mostrar(){
                System.out.println("x= "+x);
                System.out.println("y= "+y);
                System.out.println("z= "+z);
            }
            String problema(Vector_R3 A){
                String aux="no es rectangulo";
                Vector_R3 Au=new Vector_R3();
                Vector_R3 Au1=new Vector_R3();
                Au=suma(A);
                Au1=mul_esca(-1).suma(A);
                if(Au.longi()==Au1.longi()){
                    aux="es un rectangulo";
                }
                return aux;
            }
            Vector_R3 problema(Vector_R3 A,Vector_R3 B){
                Vector_R3 Au=new Vector_R3();
                double j= A.prod(B,3);
                double k= B.longi(2);
                Au=B.mul_esca(j/k);
                return Au;
            }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
            
}
