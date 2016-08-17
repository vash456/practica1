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
 * punto5 :La nota final del curso de Desarrollo de aplicaciones móviles está dividido en 5 partes: Quices
y seguimiento 20%, Prácticas de laboratorio 30%, Exposiciones 10%, Proyecto I 15% y
Proyecto Final el 25%, desarrolle un programa en java que permita calcular la nota final de
un estudiante del curso. Después de calcular la nota final el programa imprimirá lo siguiente
dependiendo de la nota:
a. Si la nota está entre 0 y 1 imprime “Estas en el lugar equivocado”
b. Si la nota está entre 1.1 y 2 imprime “Remal”
c. Si la nota está entre 2.1 y 3 imprime “Es posible recuperarse”
d. Si la nota está entre 3.1 y 4 imprime “Normalito”
e. Si la nota está entre 4.1 y 4.5 imprime “Muy Bien”
f. Si la nota está entre 4.6 y 5 imprime “Excelente estudiante”

 */
public class punto5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);//para obtener informacion del teclado
        double seg = 0, prac_lab = 0, expos = 0, proy = 0, proyfin = 0, nota;
        double auxnota;
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
                    System.out.println("Digite la nota de practicas lab: ");
                    prac_lab = lector.nextDouble();
                    if (prac_lab >= 0 && prac_lab <= 5) cont++;
                    else error = 1;
                    break;
                case 2:
                    System.out.println("Digite la nota de exposiciones: ");
                    expos= lector.nextDouble();
                    if (expos >= 0 && expos <= 5) cont++;
                    else error = 1;
                    break;
                case 3:
                    System.out.println("Digite la nota de proyecto: ");
                    proy= lector.nextDouble();
                    if (proy >= 0 && proy <= 5) cont++;
                    else error = 1;
                    break;
                case 4:
                    System.out.println("Digite la nota de proyecto final: ");
                    proyfin= lector.nextDouble();
                    if (proyfin >= 0 && proyfin <= 5) cont++;
                    else error = 1;
                    break;
            }        
            
            if (error == 1){
                System.out.println("Entrada no valida");
                error = 0;
            }
        }while(cont < 5);
        
        nota = seg*0.2+prac_lab*0.3+expos*0.1+proy*0.15+proyfin*0.25;
        System.out.println("Nota seguimiento: "+seg);
        System.out.println("Nota practicas lab: "+prac_lab);
        System.out.println("Nota exposiciones: "+expos);
        System.out.println("Nota proyecto: "+proy);
        System.out.println("Nota proyecto final: "+proyfin);
        
        //redondeo de decimal
        auxnota = Math.rint(nota*10)/10;//obtener dos cifras de decimal
        auxnota = nota - auxnota;
        nota = Math.rint(nota*10)/10;
        if (auxnota >= 0.05) nota = nota + 0.1;
        
        System.out.println("Nota definitiva: "+nota);
        
        if (nota >= 0 && nota <= 1) 
            System.out.println("Estas en el lugar equivocado");
        else if (nota >= 1.1 && nota <= 2)
            System.out.println("Remal");
        else if (nota >= 2.1 && nota <= 3)
            System.out.println("Es posible recuperarse");
        else if (nota >= 3.1 && nota <= 4)
            System.out.println("Normalito");
        else if (nota >= 4.1 && nota <= 4.5)
            System.out.println("Muy Bien");
        else if (nota >= 4.6 && nota <= 5)
            System.out.println("Excelente Estudiante");
       
    }
}
