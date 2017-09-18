/*
 * To change this license header, choose License Headers in Project Properties.
 * T
o change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Juego {
 Scanner sc= new Scanner(System.in);
   
   
      Random r= new Random();
     int puntajeJuga=0;
    int puntajePc=0;
  
    int puntos;
  
    Persona j= new Persona();
String jugadaLetra;
int tipoJugada;
String tipoJuego; 
        int juego; 


public void jugar(){
       Juego obj=new Juego();   
    Persona obj1=new Persona();
    

        obj1.socilitarDatosPersona();
        

        puntos=1;
        int i=0;
        while(i<3){   
            System.out.println("");
            System.out.println("(RONDA Seleccione su jugada escribiendo un numero-->");
                System.out.println(" 0:Piedra\n" +
"1: Papel\n" +
"2: Tijera");
    tipoJugada=sc.nextInt(); 
 
    if(tipoJugada==0) {
            
                 jugadaLetra = "Piedra";
    }else
        if(tipoJugada==1){
                
            
            jugadaLetra = "Papel";
        }else{     
                           jugadaLetra= "Tijera";
   
   }   
   if (tipoJugada==0 && juego==2){
                    puntajeJuga=puntajeJuga+puntos;
    }else
        if(tipoJugada==1 && juego==0){
                    puntajeJuga=puntajeJuga+puntos;
        }else
            if(tipoJugada==2 && juego==1){  
                    puntajeJuga=puntajeJuga+puntos;
            }else 
                if (tipoJugada==juego){
    }
      if (juego==0 && tipoJugada==2){
                    puntajePc=puntajePc+puntos;
    }else
        if(juego==1 && tipoJugada==0){
                    puntajePc=puntajePc+puntos;
        }else
            if(juego==2 && tipoJugada==1){  
                    puntajePc=puntajePc+puntos;
            }              
    
    System.out.println("=======");
          System.out.println("Jugada persona:"+jugadaLetra);
        System.out.println("");
obj.imprimirJugadaLetra();
  
i++;
        }

        Juego obj12 =new Juego();
        obj12.buscarGanadorFinal();
  
    
    

}
    public void generarJuego(){

        
   juego=r.nextInt(4);
   if (juego==0){             
            tipoJuego="Piedra";
   }else
         if (juego==1 ){             
            tipoJuego="Papel";
         }else{
                 tipoJuego="Tijera";
                    
         }
        System.out.println("Jugada Computador"+tipoJuego);
    }
    
    public void imprimirJugadaLetra(){
   Juego obj =new Juego();
    obj.generarJuego();
    }
    
    
    public void buscarGanadorFinal(){
      
      if (puntajeJuga>puntajePc){
    System.out.println("-----------------GANADOR------------");
    System.out.println("Persona");
    System.out.println("Número de aciertos:"+puntajeJuga);


}else
      if(puntajePc>puntajeJuga){
         
System.out.println("-----------------GANADOR------------");
    System.out.println("GANADOR PC");
    System.out.println("Número de aciertos:"+puntajePc);
      } else
      if(puntajePc==puntajeJuga){
    System.out.println("-----------------EMPATE------------");

    
    }   
     
    }
       }
    
        
