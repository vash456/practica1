/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author DARLIN
 * punto1: Desarrolle un algoritmo que permita calcular el volumen y el área de 
 * un cubo
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);//para obtener informacion del teclado
        int lado, area, volumen;
        System.out.println("Digite el lado: ");
        lado = lector.nextInt();
        System.out.println("El lado digitado es: "+lado);
        area = lado*lado;
        System.out.println("El area es: "+area);
        /*perimetro = lado*4;
        System.out.println("El perimetro es: "+perimetro);*/
        volumen = lado*lado*lado;
        System.out.println("El volumen es: "+volumen);
    }
    
}
