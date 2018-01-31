/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.Lista;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Aplicacion {
    public static void main(String[] args) 
 {
     Scanner leer=new Scanner(System.in);
     Lista arreglo = new Lista();
    
   arreglo.agregarInicio(17);
   arreglo.agregarFin(4);
   arreglo.agregarFin(1);
   arreglo.agregarFin(6);
   arreglo.agregarFin(8);
    
   System.out.println("\nLista Ingresada ");
   arreglo.imprimir();
    
   System.out.println("\nIngrese el numero de referencia de inicio para insertar el nuevo valor: ");
   int numero;
   numero=leer.nextInt();
    
   arreglo.insertarValorAbsoluto(numero);
    
   System.out.println("\nLista Ingresada modificada ");
   arreglo.imprimir();
 
 }
 
}
    

