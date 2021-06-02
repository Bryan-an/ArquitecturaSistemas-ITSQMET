/*
 * Patrón Decorador
 */
package com.desarrollo.patrondecorador;

/**
 *
 * @author bryan
 */
public class AutoEstandar implements Automovil {

    private String modelo;

    public AutoEstandar(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void encender() {
        System.out.println("Encender " + modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar " + modelo);
    }

    @Override
    public void frenar() {
        System.out.println("Frenar " + modelo);
    }

    @Override
    public void apagar() {
        System.out.println("Apagar " + modelo);
    }

}
