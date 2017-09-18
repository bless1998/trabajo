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
    

        obj1.socilitarDatosPersona();// Invoco solicitar datos para mostrar inicio
        

        puntos=1;
        int i=0;
        while(i<3){  // Iniciliazo un mientras para que me pregunte 3 veces 
            System.out.println("");
            System.out.println("(RONDA Seleccione su jugada escribiendo un numero-->");
                System.out.println(" 0:Piedra\n" +
"1: Papel\n" +
"2: Tijera");
    tipoJugada=sc.nextInt(); 
 
    if(tipoJugada==0) {// Defino nombre a los numeros
            
                 jugadaLetra = "Piedra";
    }else
        if(tipoJugada==1){
                
            
            jugadaLetra = "Papel";
        }else{     
                           jugadaLetra= "Tijera";
   
   }   
   // Para sumar el puntaje
   //NO ME SIRVIO NO FUI CAPAZ TENIA UNA IDEA
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
    // Mostrar por pantalla las jugadas
    System.out.println("=======");
          System.out.println("Jugada persona:"+jugadaLetra);
        System.out.println("");
obj.imprimirJugadaLetra();
  
i++;
        }
// Mostrar por pantalla ganador final
        
Juego obj4= new Juego();
obj4.buscarGanadorFinal();
       
  
    
    

}
    public void generarJuego(){

       // Generar juego de la maquina 
   juego=r.nextInt(4);
   if (juego==0){  // Dar nombre al numero            
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
   // Muestra por pantalla jugada maquina
        Juego obj =new Juego();
    obj.generarJuego();
    }
    
    
    public void buscarGanadorFinal(){
      // Imprime y busca el ganador final no me sirvio tenia una idea
      if (puntajeJuga>puntajePc){
          System.out.println("");
          System.out.println("-----------------GANADOR------------");
    System.out.println("Persona");
    System.out.println("Número de aciertos:"+puntajeJuga);


}else{
    
          System.out.println("");
System.out.println("-----------------GANADOR------------");
    System.out.println("GANADOR PC");
    System.out.println("Número de aciertos:"+puntajePc);
      } 
    
    }   
     
    }
       
    
        
