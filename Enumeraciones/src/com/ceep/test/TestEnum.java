package com.ceep.test;

import com.ceep.enumeraciones.Continentes;
import com.ceep.enumeraciones.Dias;

public class TestEnum {
    
    public static void main(String[] args) {
        //Dias de la semana
        System.out.println("\n--- DIAS DE LA SEMANA ---");
        System.out.println("Primer dia de la semana " + Dias.Lunes);
        diaSemana(Dias.Domingo);
        
        //Continentes
        System.out.println("\n--- CONTINENTES ---");
        System.out.println("Pais numero 1: " + Continentes.AFRICA);
        System.out.println("Numero de paises de Africa: " + Continentes.AFRICA.getNumPaises());
        System.out.println("Numero de habitantes de Africa: " +Continentes.AFRICA.getNumHabitantes());
    }
    
    public static void diaSemana(Dias dias) {
        switch (dias) {
            case Lunes:
                   System.out.println("Primer dia de la semana " + "--->" + dias);
                break;
                
            case Domingo:
                   System.out.println("Ultimo dia de la semana " + "--->" + dias);
                break;
                
            default:
                throw new AssertionError();
        }
    }
}
