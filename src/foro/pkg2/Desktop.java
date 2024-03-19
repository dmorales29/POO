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

    /**
     * @param memoria the memoria to set
     */
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    /**
     * @param tarjetaGrafica the tarjetaGrafica to set
     */
    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    /**
     * @param tamanoTorre the tamanoTorre to set
     */
    public void setTamanoTorre(String tamanoTorre) {
        this.tamanoTorre = tamanoTorre;
    }

    /**
     * @param capacidadDisco the capacidadDisco to set
     */
    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }
}