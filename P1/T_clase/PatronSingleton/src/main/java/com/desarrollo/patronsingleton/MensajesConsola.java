/*
Patrón Singleton
 */
package com.desarrollo.patronsingleton;

/**
 *
 * @author bryan
 */
public class MensajesConsola {
    
    //Atributo static
    private static MensajesConsola mensaje;
    private String valor;
    private int num;
    
    //getters- setters
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    

    //definir constructor
    private MensajesConsola() {

    }

    //método return-static -> que crea la instancia en el caso de que no exista
    public static MensajesConsola getInstance() {
        if (mensaje == null) {
            mensaje = new MensajesConsola();
        }
        return mensaje;
    }

    public void message(String message) {
        System.out.println("Consola: " + message);
    }
}
