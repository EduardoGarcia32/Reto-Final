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

           
            }
         }
          
    

