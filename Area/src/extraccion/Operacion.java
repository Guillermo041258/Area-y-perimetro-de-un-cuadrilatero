/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraccion;

/**
 *
 * @author USER
 */
public class Operacion {
   private float dato1,dato2, resultado_area,res;
  
  //Constructores
   public Operacion(float lado1,float lado2)
   {
     this.dato1 = lado1;
     this.dato2 = lado2;    
    
       
   }
   // Metodos
   
  public float Area(float dato1, float dato2)
  {
 
    resultado_area = dato1*dato2;    
     
    return resultado_area;    
  }

    
 public float Perimetro(float lad,float lad2)
 {
 res =((dato1*2) + (dato2*2));   
     
 return res;    
 }

    public float getResultado_area() {
        return resultado_area;
    }

    public void setResultado_area(float resultado_area) {
        this.resultado_area = resultado_area;
    }

    public float getRes() {
        return res;
    }

    public void setRes(float res) {
        this.res = res;
    }
    
 
 
 
 
    
    
    
}
