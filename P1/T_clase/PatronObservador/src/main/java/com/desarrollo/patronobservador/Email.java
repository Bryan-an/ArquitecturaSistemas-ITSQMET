/*
Patrón Observador
 */
package com.desarrollo.patronobservador;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Email implements Suscriptor {

    private String email;

    @Override
    public void actualizar(String nombre) {
        pedirEmail();
        System.out.println("\nEnviando mensaje a " + nombre + " con el correo: " + email);
    }

    public void pedirEmail() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nIngrese el correo electrónico del usuario: ");
        email = sc.next();
    }

}
