/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package username;
import java.io.*;
/**
 *
 * @author USER
 */
public class Username {

    /**
     * @param args the command line arguments
     */
   public String email;
private BufferedReader datos;
   
    
  public void PedirDatos() throws IOException
  {
      
  datos = new BufferedReader(new InputStreamReader(System.in));    
 System.out.println("Escribe tu email para saber si es valido o no");
email = datos.readLine();
 
      
  }
    
}
