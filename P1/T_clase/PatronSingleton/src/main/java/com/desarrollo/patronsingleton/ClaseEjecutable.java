/*
Patrón Singleton
 */
package com.desarrollo.patronsingleton;

/**
 *
 * @author bryan
 */
public class ClaseEjecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Capturar el valor del método return
        MensajesConsola mensaje, mensajePrueba;
        mensaje = MensajesConsola.getInstance();
        mensajePrueba = MensajesConsola.getInstance();

        mensaje.setValor("ITSQMET");
        mensaje.setNum(777);

        System.out.println("Valor: " + mensajePrueba.getValor());
        System.out.println("Num: " + mensajePrueba.getNum());
    }

}
