/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mipunto;
import java.math.*;
/**
 *
 * @author Lenovo
 */
public class MiPunto {
    private double x,y;
    
    public
            MiPunto(double a, double b){
                x=a;
                y=b;
            }
            MiPunto(){
                x=0;
                y=0;
            }
            double distancia(double a,double b){
                double d=Math.sqrt(Math.pow(a-x, 2)+Math.pow(b-y, 2));
                return d;
            }
            double distancia(MiPunto A){
                double d=Math.sqrt(Math.pow(A.getX()-x, 2)+Math.pow(A.getY()-y, 2));
                return d;
                
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
            
    
}
