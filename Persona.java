/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Persona {
           String alias,correo;

    
    public void socilitarDatosPersona(){
//Solicitar datos por teclado
   Scanner sc=new Scanner(System.in);
    System.out.println("*******************************************************");
   System.out.println("");
   System.out.println("        PIEDRA, PAPEL O TIJERA");
   System.out.println("");
   System.out.println("Escriba un alias");
   alias=sc.nextLine();// Se guarda
   System.out.println("");
   System.out.println("Escriba su correo");
   correo=sc.nextLine();
   System.out.println("");
        System.out.println(""); 
        System.out.println("COMIENZA EL JUEGO!");
        System.out.println("");
        System.out.println("JUGADOR");
      Persona obj= new Persona();
       
      obj.mostrarDatosPersona();
    }    
public void mostrarDatosPersona(){
        
       System.out.println("" + alias + "-" +correo );
       
        
     
       
       
       
       
       
       
       
       
       
    
    
    
    
    
    }
    
}
