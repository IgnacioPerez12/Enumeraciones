package com.ceep.enumeraciones;

public enum Continentes {
    ASIA(46, ""),
    AFRICA(53, "1.2 Billlones"),
    AMERICA(44, ""),
    //ANTARTIDA,
    EUROPA(46, ""),
    OCEANIA(14, "");
    
    private final int numPaises;
    private final String numHabitantes;

    //Constructor
    private Continentes(int numPaises, String numhabitantes) {
        this.numPaises = numPaises;
        this.numHabitantes = numhabitantes;
    }


    //Getter
    public int getNumPaises() {
        return numPaises;
    }

    public String getNumHabitantes() {
        return numHabitantes;
    }
}
