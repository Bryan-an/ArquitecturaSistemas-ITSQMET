/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.patrondecorador;

/**
 *
 * @author bryan
 */
public abstract class AutomovilDecorador implements Automovil {

    private Automovil auto;

    public AutomovilDecorador(Automovil auto) {
        this.auto = auto;
    }

    public Automovil getAuto() {
        return auto;
    }
}
