/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto.pkgfinal;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Eduardo Garcia
 */
public class RetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
            int PoderHeroe = 2;
            int PoderMago = 2;
        
            int HadaZ = 0;
            int HadaJu = 0;
            int Madera = 0;
            int a,b,c = 0 ;
        
            String Nombre;
            String Ok;
            String Repito = "Salir";
       
        System.out.println("¿Como se llamara tu Heroe?");
            Nombre = s.nextLine();
            
        System.out.println("Presione iniciar para comenzar");
            Ok = s.nextLine();
        
            do{
            Random Mialeatorio = new Random();
            a = Mialeatorio.nextInt(10);
            b = Mialeatorio.nextInt(10);
            c = Mialeatorio.nextInt(2);
            
            System.out.println("Espere su turno");
            HadaZ = HadaZ + a;
            System.out.println("El Mago consiguio "  +  a  +  " Hadas!!");
            
            HadaJu = HadaJu + b;
            System.out.println(Nombre + " Obtuvo  " +  b  +  " Hadas!!");
             
            PoderHeroe = PoderHeroe - c; 
            System.out.println("El ogro termino su turno y recibio " + c + " Golpes " + " Poder de Vida: " + PoderHeroe );

        if(HadaZ >= 10){
            
        
                        System.out.println("El mago a capturado 10 hadas su poder incrementa" );
                        PoderMago = PoderMago + 1;
                        
                        System.out.println("Poder del Mago: " + PoderMago);
                        HadaZ = 0;
    
                    }
        
                    if(HadaJu >= 10){
                        System.out.println("Has conseguido 10 hadas y les conseguiste un hogar");
                        System.out.println("El poder del mago baja y tu poder aumenta");
                        
                        PoderMago = PoderMago - 1;
                        PoderHeroe = PoderHeroe + 1;
                        HadaJu = 0;
                        
                        System.out.println(Nombre +" El poder es de " + PoderHeroe);
                        System.out.println("Poder del mago: " + PoderMago);  
                    }
                    
        System.out.println("¡Escribe buscar para salvar a las hadas!");
            Repito = s.nextLine();
            
            }while( PoderHeroe > 0 && PoderMago > 0 && Repito.equals("Buscar"));
            
            if(PoderHeroe == 0){
                System.out.println("Has perdido el Mago te a vencido");
            }if(PoderMago == 0){
                System.out.println("¡VICTORIA! Lograste derrotar al mago y salvaste a las hadas");

            }
         }
    }
          
    

