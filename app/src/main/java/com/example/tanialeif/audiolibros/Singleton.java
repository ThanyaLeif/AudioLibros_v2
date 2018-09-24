package com.example.tanialeif.audiolibros;

public class Singleton {
    private static Singleton INSTANCIA = new Singleton();

    private  Singleton() {}

    public static Singleton getINSTANCIA(){
        return INSTANCIA;
    }
}

