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
    }
    
    public double getTamanoDiagonalPantalla () {
        return tamanoDiagonalPantalla;
    }
    
    public String getCapacitivaResistiva () {
        return capacitivaResistiva;
    }
    
    public int getTamanoMemoriaNAND () {
        return tamanoMemoriaNAND;
    }
    
    public String getSO () {
        return sO;
    }

    /**
     * @param tamanoDiagonalPantalla the tamanoDiagonalPantalla to set
     */
    public void setTamanoDiagonalPantalla(double tamanoDiagonalPantalla) {
        this.tamanoDiagonalPantalla = tamanoDiagonalPantalla;
    }

    /**
     * @param capacitivaResistiva the capacitivaResistiva to set
     */
    public void setCapacitivaResistiva(String capacitivaResistiva) {
        this.capacitivaResistiva = capacitivaResistiva;
    }

    /**
     * @param tamanoMemoriaNAND the tamanoMemoriaNAND to set
     */
    public void setTamanoMemoriaNAND(int tamanoMemoriaNAND) {
        this.tamanoMemoriaNAND = tamanoMemoriaNAND;
    }

    /**
     * @param sO the sO to set
     */
    public void setsO(String sO) {
        this.sO = sO;
    }
    
    
}
