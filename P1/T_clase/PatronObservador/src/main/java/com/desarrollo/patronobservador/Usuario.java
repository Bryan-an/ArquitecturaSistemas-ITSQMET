/*
Patrón Publicador
 */
package com.desarrollo.patronobservador;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Usuario implements Publicador {

    //definir colección
    private ArrayList<Suscriptor> observadores = new ArrayList<Suscriptor>();


    public void suscribir(Suscriptor o) {
        observadores.add(o);
    }

    public void anularSuscripcion(Suscriptor o) {
        observadores.remove(o);
    }

    @Override
    public void notificar(String nombre) {
        observadores.forEach(o -> {
            o.actualizar(nombre);
        });
    }

    public void registrarUsuario(String nombre) {
        notificar(nombre);
    }

}
