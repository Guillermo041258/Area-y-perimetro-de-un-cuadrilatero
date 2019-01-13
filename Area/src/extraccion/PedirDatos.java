/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraccion;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PedirDatos {
    
  // Pedir Datos del cuadrilatero
    public static void main(String[] args)
    {
     float lado1;
    float lado2;
        Scanner in = new Scanner(System.in);
       System.out.print("Dame el primer lado");
       lado1 =  in.nextFloat();
       
       System.out.print("Dame el segundo lado");
       lado2 = in.nextFloat();
       
       if(lado1 == lado2)
       {
           System.out.print("Es igual tus lados");
       }
       else
       {
       Operacion op = new Operacion(lado1,lado2); 
       op.Area(lado1, lado2);
       op.Perimetro(lado1, lado2);
       
      System.out.println("El area es " + op.getResultado_area());
      System.out.println("El perimetro es " +op.getRes());   
       }
        
    }
    
    
    
}
