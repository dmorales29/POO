/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foro.pkg2;

/**
 *
 * @author Jorge LG
 */

public class Tablet extends Computador {
    private double tamanoDiagonalPantalla;
    private String capacitivaResistiva;
    private int tamanoMemoriaNAND;
    private String sO;
    
    public Tablet (String fabricante, String modelo, String microprocesador, double tamanoDiagonalPantalla, String capacitivaResistiva, int tamanoMemoriaNAND, String sO) {
        super(fabricante, modelo, microprocesador);
        this.tamanoDiagonalPantalla = tamanoDiagonalPantalla;
        this.capacitivaResistiva = capacitivaResistiva;
        this.tamanoMemoriaNAND = tamanoMemoriaNAND;
        this.sO = sO;
    };
}
