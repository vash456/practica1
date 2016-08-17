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
 * punto4: Desarrollar un programa que calcule la nota definitiva de un 
 * estudiante en una asignatura, se sabe que durante el semestre académico 
 * se manejan tres notas con sus respectivos porcentajes así: seguimiento 
 * (50%), parcial I (25%) y parcial 2 (25%).
 */
public class punto4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);//para obtener informacion del teclado
        double seg = 0, parcial_1 = 0, parcial_2 = 0, nota;
        int cont = 0, error = 0;
        
        do {
            switch (cont) {
                case 0:
                    System.out.println("Digite la nota de seguimiento: ");
                    seg = lector.nextDouble();
                    if (seg >= 0 && seg <= 5) cont++;
                    else error = 1;
                    break;
                case 1:
                    System.out.println("Digite la nota de parcial 1: ");
                    parcial_1 = lector.nextDouble();
                    if (parcial_1 >= 0 && parcial_1 <= 5) cont++;
                    else error = 1;
                    break;
                case 2:
                    System.out.println("Digite la nota de parcial 2: ");
                    parcial_2= lector.nextDouble();
                    if (parcial_2 >= 0 && parcial_2 <= 5) cont++;
                    else error = 1;
                    break;
            }        
            
            if (error == 1){
                System.out.println("Entrada no valida");
                error = 0;
            }
        }while(cont < 3);
        
        nota = seg*0.5+parcial_1*0.25+parcial_2*0.25;
        System.out.println("Nota seguimiento: "+seg);
        System.out.println("Nota parcial 1: "+parcial_1);
        System.out.println("Nota parcial 2: "+parcial_2);
        System.out.println("Nota definitiva: "+nota);
    }
}
