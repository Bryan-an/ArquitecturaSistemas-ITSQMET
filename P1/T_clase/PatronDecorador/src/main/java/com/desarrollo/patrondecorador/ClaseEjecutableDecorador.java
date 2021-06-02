/*
 * Patrón Decorador
 */
package com.desarrollo.patrondecorador;

/**
 *
 * @author bryan
 */
public class ClaseEjecutableDecorador {

    public static void main(String[] args) {
        Automovil auto = new AutoElectrico(new AutoEstandar("Cerato"));
        //auto = new AutoElectrico(auto);
        auto.encender();
        auto.acelerar();
        auto.frenar();
        auto.apagar();
    }
}
