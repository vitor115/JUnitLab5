/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Vitor Ravacci - 31817750
 * @author Pedro Joanini - 31852238
 */
public class LabJUnit {
    public boolean valida_data(int data) {
        if(data>=1900 && data<=2020){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean valida_nota(int nota) {
        if(nota>= 0 && nota<=10){
            return true;
        }
        else{
            return false;
        }
    }
    public static String valida_idade(int idade) {
        if (idade>= 18 && idade < 50 ) {
            return "Renovação a cada 10 anos";
        } else if (idade>= 50 && idade < 70) {
            return "Renovação a cada 5 anos";
        } else if (idade >= 70 && idade<=100) {
            return "Renovação a cada 3 anos";
        }
        else if(idade > 100){
            return "Data Inválida";
        }
        else {
            return "Data Inválida";
        }
    }
}
