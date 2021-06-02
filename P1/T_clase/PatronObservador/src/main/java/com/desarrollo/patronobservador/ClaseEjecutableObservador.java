/*
Patrón Publicador
 */
package com.desarrollo.patronobservador;

/**
 *
 * @author bryan
 */
public class ClaseEjecutableObservador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Usuario usuario -> Email email
        //email -> observador
        //usuario -> sujeto(observable)
        Suscriptor email = new Email();
        Suscriptor llamada = new Llamada();
        Usuario usuario = new Usuario();

        usuario.suscribir(email);
        
        //Añadir otro suscriptor
        usuario.suscribir(llamada);
        
        //Cambiar el estado del publicador, provoco un evento,
        //llamo al método notificar(), y este llama al método actualizar()
        //de cada objeto suscriptor.
        usuario.registrarUsuario("Bryan");
        
    }

}
