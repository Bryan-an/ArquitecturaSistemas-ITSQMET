/*
Patrón Observador
 */
package com.desarrollo.patronobservador;

/**
 *
 * @author bryan
 */
public interface Suscriptor {

    //constantes
    //métodos abstractos
    //Este método se va a encargar de actualizar cuando el sujeto lo norifique
    //o dispare algún evento
    public void actualizar(String nombre);
}
