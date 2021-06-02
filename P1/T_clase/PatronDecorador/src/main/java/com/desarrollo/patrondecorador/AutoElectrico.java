/*
 * Patrón Decorador
 */
package com.desarrollo.patrondecorador;

/**
 *
 * @author bryan
 */
public class AutoElectrico extends AutomovilDecorador {

    public AutoElectrico(Automovil auto) {
        super(auto);
    }

    @Override
    public void encender() {
        System.out.println("Iniciando Sistema Operativo");
        hello();
        getAuto().encender();
    }

    @Override
    public void acelerar() {
        System.out.println("Controlando acelerador eléctrico");
        getAuto().acelerar();
    }

    @Override
    public void frenar() {
        System.out.println("Controlando freno electrico");
        getAuto().frenar();
    }

    @Override
    public void apagar() {
        System.out.println("Agando Sistema Operativo");
        getAuto().apagar();
    }

    public void hello() {
        System.out.println("Hello!");
    }

}
