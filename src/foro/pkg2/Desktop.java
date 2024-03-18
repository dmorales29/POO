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

public class Desktop extends Computador {
    private int memoria;
    private String tarjetaGrafica;
    private String tamanoTorre;
    private int capacidadDisco;

    public Desktop (String fabricante, String modelo, String microprocesador, int memoria, String tarjetaGrafica, String tamanoTorre, int capacidadDisco) {
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanoTorre = tamanoTorre;
        this.capacidadDisco = capacidadDisco;
    }

    public int getMemoria () {
        return memoria;
    }

    public String getTarjetaGrafica () {
        return tarjetaGrafica;
    }

    public String getTamanoTorre () {
        return tamanoTorre;
    }

    public int getCapacidadDisco () {
        return capacidadDisco;
    }
}