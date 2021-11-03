/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocrud;

import java.util.Scanner;

/**
 *
 * @author juanl
 */
public class Principal {
    public static void main(String[] args) {
        
       Integer idProd = 0;
       Integer estadoProducto = 0;
       
       var pedidoDAO = new PedidoDAO();
        
       Scanner sc = new Scanner(System.in);
       boolean salir = false;
       int opcion = 0; //Guardaremos la opcion del usuario
        
       while(!salir){
           System.out.println("1. ¿Quiere la carta de la comida?\n ");
           System.out.println("2. ¿Que es lo que desea pedir?\n");
           System.out.println("3. Marcar como recogido\n");
           System.out.println("4. ¿Desea eliminar algo?\n");
           
           System.out.println("5. Salir");
            
           
       
           System.out.println("Escribe una de las opciones");
           opcion = sc.nextInt();  
       }
       switch(opcion){
               case 1:
                   System.out.println("Has elegido la opcion 1");
                   Integer product_id = sc.nextInt();
                        String estado = "En espera";
                   break;
               case 2:
                   System.out.println("Has elegido la opcion 2");
                   break;
                case 3:
                   System.out.println("Has elegido la opcion 3");
                   break;
                case 4:
                   System.out.println("Has elegido la opcion 3");
                   break;
                case 5:
                salir=true;
                   break;

                default:
                   System.out.println("Solo números entre 1 y 5");
           }
       
    }
    
}
