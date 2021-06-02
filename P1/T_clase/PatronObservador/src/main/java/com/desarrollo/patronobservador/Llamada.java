/*
 * Patrón Observador
 */
package com.desarrollo.patronobservador;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Llamada implements Suscriptor {

    private long numero;

    @Override
    public void actualizar(String nombre) {
        pedirTelefono();
        System.out.println("\nRealizando llamada a " + nombre + " con el número de teléfono: " + numero);
    }

    public void pedirTelefono() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nIngrese el número de teléfono del usuario: ");
        numero = sc.nextLong();
    }

}
