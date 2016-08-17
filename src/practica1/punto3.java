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
 * punto3: Dado el valor del lado de un triángulo equilátero, haga un algoritmo 
 * que calcule su perímetro, su altura y su área.
 */
public class punto3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);//para obtener informacion del teclado
        double a, perimetro, altura, area;
        System.out.println("Digite el lado del triangulo: ");
        a = lector.nextInt();
        
        perimetro = a*3;
        altura = Math.sqrt(a*a -  a/2);
        area = (a*a)/2;
        
        System.out.println("perimetro = "+perimetro+"\naltura = "+altura+"\narea = "+area);
        /*System.out.println("altura = "+altura);
        System.out.println("area = "+area);*/
    }
}
