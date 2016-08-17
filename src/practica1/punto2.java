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
 * punto: Escriba un algoritmo que permita calcular la hipotenusa de un 
 * triángulo rectángulo utilizando el teorema de Pitágoras.
 */
public class punto2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);//para obtener informacion del teclado
        double a, b, h;
        System.out.println("Digite el lado a: ");
        a = lector.nextInt();
        System.out.println("Digite el lado b: ");
        b = lector.nextInt();
        
        h = Math.sqrt(Math.pow(a, 2)+  b*b);
        System.out.println("hipotenusa: "+h);
    }
}
