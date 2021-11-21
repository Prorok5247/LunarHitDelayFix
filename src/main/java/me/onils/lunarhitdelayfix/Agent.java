package me.onils.lunarhitdelayfix;

import java.lang.instrument.Instrumentation;

public class Agent {
    public static void premain(String args, Instrumentation inst){
        System.out.println("Injection started");
    }
}
