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
 * punto7: Una oficina de seguros ha reunido datos concernientes a todos los 
 * accidentes de tránsito ocurridos en el área metropolitana en el último año. 
 * Por cada conductor involucrado en un accidente se toman los siguientes datos:
 * año de nacimiento, sexo (1: Femenino, 2: Masculino), registro del carro 
 * (1: Medellín, 2: Otras ciudades). Hacer un programa en java que muestre:
a) El porcentaje de conductores menores de 25 años
b) El porcentaje de conductores del sexo femenino.
c) El Porcentaje de conductores cuyos carros están registrados fuera de Medellín.
 */
public class punto7 {
    
    int year_birth = 0;
    String sexo = "n";
    String registro = "n/a";
    
    public punto7(){};
    
    public void setyear_birth(int year){
        this.year_birth = year;
    }
    
    public int getyear_birth(){
        return this.year_birth;
    }
    
    public void setsexo(String sex){
        this.sexo = sex;
    }
    
    public String getsexo(){
        return this.sexo;
    }
    
    public void setregistro(String reg){
        this.registro = reg;
    }
    
    public String getregistro(){
        return this.registro;
    }
    
    public static void main(String[] args) {
        //punto7 conductores = new punto7();
        
        Scanner lector = new Scanner (System.in);//para obtener informacion del teclado
        int num_conduc;
        int year;
        int men_25 = 0, por_fem = 0, por_reg = 0;
        
        System.out.println("Conductores en los accidentes en el area metropolitana");
        System.out.println("Ingrese el numero de conductores");
        num_conduc = lector.nextInt();

        punto7[] conductores = new punto7[num_conduc];

        for (int i = 0; i < num_conduc ; i++){
            conductores[i] = new punto7();
            System.out.println("Conductor # "+(i+1));
            System.out.println("Ingrese año de nacimiento");
            year = lector.nextInt();
            conductores[i].setyear_birth(year);
            System.out.println("Ingrese sexo (1: Femenino, 2: Masculino)");
            if (lector.nextInt() == 1)conductores[i].setsexo("Femenino");
            else conductores[i].setsexo("Masculino");
            System.out.println("Ingrese registro del carro(1: Medellín, 2: Otras ciudades)");
            if (lector.nextInt() == 1)conductores[i].setregistro("Medellín");
            else conductores[i].setregistro("Otras ciudades");
        }
        
        for (int i = 0; i < num_conduc ; i++){
            if (2016-conductores[i].getyear_birth()<25){
                men_25++;
            }
            if (conductores[i].getsexo() == "Femenino"){
                por_fem++;
            }
            if (conductores[i].getregistro() == "Otras ciudades"){
                por_reg++;
            }
        }
        
        men_25 = (men_25*100)/num_conduc;
        por_fem = (por_fem*100)/num_conduc;
        por_reg = (por_reg*100)/num_conduc;
        
        System.out.println("porcentaje de conductores menores de 25 años :"+men_25+"%");
        System.out.println("porcentaje de conductores del sexo femenino :"+por_fem+"%");
        System.out.println("Porcentaje de conductores de  carros están registrados fuera de Medellín :"+por_reg+"%");
    }
}


