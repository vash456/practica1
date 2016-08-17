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
 * punto6: En la U de A hay una máquina dispensadora que tiene 4 productos 
 * etiquetados con los números 1, 2, 3 y 4, cada uno con un valor de $500, 
 * $800, $300 y $900, respectivamente. Defina un algoritmo que lea el número 
 * de producto que ingresa el usuario y que le muestre su precio.
 */
public class punto6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);//para obtener informacion del teclado
        int producto1 = 500, producto2 = 800, producto3 = 300, producto4 = 900;
        int opcion = 0, error = 0;
        
        while(opcion != 5) {
            System.out.println("Digite el numero del producto para saber el precio");
            System.out.println(" 1) Producto 1");
            System.out.println(" 2) Producto 2");
            System.out.println(" 3) Producto 3");
            System.out.println(" 4) Producto 4");
            System.out.println(" 5) Finalizar programa");
            opcion = lector.nextInt();
            if (opcion >= 1 && opcion <= 5){
                switch (opcion) {
                    case 1:
                        System.out.println("Precio producto 1: "+producto1+"\n");
                        break;
                    case 2:
                        System.out.println("Precio producto 2: "+producto2+"\n");
                        break;
                    case 3:
                        System.out.println("Precio producto 3: "+producto3+"\n");
                        break;
                    case 4:
                        System.out.println("Precio producto 4: "+producto4+"\n");
                        break;
                    default:
                        break;
                }        
            } else System.out.println("Entrada no valida\n");
        }
        
        System.out.println("Programa finalizado");
        
    }
}
