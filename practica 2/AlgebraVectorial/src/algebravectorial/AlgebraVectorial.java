/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algebravectorial;
import java.math.*;
/**
 *
 * @author Lenovo
 */
public class AlgebraVectorial {
    private 
            double x,y,z;
    public
            AlgebraVectorial(){
                x=0;
                y=0;
                z=0;
            }

            AlgebraVectorial(double x, double y, double z) {
                this.x = x;
                this.y = y;
                this.z = z;
            }
            AlgebraVectorial suma(AlgebraVectorial A){
                AlgebraVectorial Au=new AlgebraVectorial();
                Au.setX(x+A.getX());
                Au.setY(y+A.getY());
                Au.setZ(z+A.getZ());
                return Au;
            }
            AlgebraVectorial mul_esca(double a){
                AlgebraVectorial Au=new AlgebraVectorial();
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
            AlgebraVectorial normal(){
                AlgebraVectorial Au=new AlgebraVectorial();
                Au.setX(x/longi());
                Au.setY(y/longi());
                Au.setZ(z/longi());
                return Au;
            }
            double prod(AlgebraVectorial A,int a){
                double aux=x*A.getX()+y*A.getY()+z*A.getZ();
                return aux;
            }
            AlgebraVectorial prod(AlgebraVectorial A){
                AlgebraVectorial Au=new AlgebraVectorial();
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
            void perpendicular(AlgebraVectorial B){
                AlgebraVectorial Au=new AlgebraVectorial();
                AlgebraVectorial Au1=new AlgebraVectorial();
                Au=suma(B);
                Au1=mul_esca(-1).suma(B);
                if(Au.longi()==Au1.longi()){
                    System.out.println("el vector es ortogonal");
                }else{
                    System.out.println("el vector no es ortogonal");
                }
                
                
            }
            void perpendicular(AlgebraVectorial B,int a){
                AlgebraVectorial Au=new AlgebraVectorial();
                AlgebraVectorial Au1=new AlgebraVectorial();                
                Au=mul_esca(-1).suma(B);
                Au1=B.suma(mul_esca(-1));
                if(Au.longi()==Au1.longi()){
                    System.out.println("el vector es mutuamente ortogonal");
                }else{
                    System.out.println("el vector no es mutuamente ortogonal");
                }                                
            }
            void perpendicular(AlgebraVectorial B,String a){
                double aux=prod(B, 0);
                if(aux==0){
                    System.out.println("el vector es ortogonal");
                }else{
                    System.out.println("el vector no es mutuamente ortogonal");
                }                                
            } 
            void perpendicular(AlgebraVectorial B,Boolean a){
                double aux=suma(B).longi(0);
                double a1=longi(0)+B.longi(0);
                if(aux==a1){
                    System.out.println("el vector es ortogonal");
                }else{
                    System.out.println("el vector no es mutuamente ortogonal");
                }                                
            }
            void paralela(AlgebraVectorial A){
                double a1=x/A.getX();
                double a2=y/A.getY();
                double a3=z/A.getZ();
                if(A.getZ()==0){
                    if(z==0){
                        a3=a2;
                    }
                }
                if(a1==a2){
                    if(a2==a3){
                        System.out.println("son paralelas");
                    }else{
                        System.out.println("no son paralelas");
                    } 
                }else{
                    System.out.println("no son paralelas");
                }                
            }
            void paralela(AlgebraVectorial A,int a){
                AlgebraVectorial ax=prod(A);
                if(ax.getX()==0){
                    if(ax.getY()==0){
                        if(ax.getZ()==0){
                            System.out.println("son paralelas");
                        }else{
                            System.out.println("no son paralelas");
                        }
                    }else{
                        System.out.println("no son paralelas");
                    }
                }else{
                    System.out.println("no son paralelas");
                }
            }
            double Componente_de_a_en_b(AlgebraVectorial B){
                double a1=prod(B, 0);
                double a2=B.longi();
                return a1/a2;
            }
            AlgebraVectorial Proyeccion_de_a_en_b(AlgebraVectorial B){
                AlgebraVectorial A=new AlgebraVectorial();
                double a1=Componente_de_a_en_b(B)*(1/B.longi());
                A=B.mul_esca(a1);
                return A;
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
