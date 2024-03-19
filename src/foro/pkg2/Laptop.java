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
public class Laptop extends Computador {
    private int memoria;
    private double tamanoPantalla;
    private int capacidadDisco;
    
    public Laptop (String fabricante, String modelo, String microprocesador, int memoria, double tamanoPantalla, int capacidadDisco) {
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tamanoPantalla = tamanoPantalla;
        this.capacidadDisco = capacidadDisco;
    }
    
    public int getMemoria () {
        return memoria;
    }
    
    public double getTamanoPantalla () {
        return tamanoPantalla;
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
     * @param tamanoPantalla the tamanoPantalla to set
     */
    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    /**
     * @param capacidadDisco the capacidadDisco to set
     */
    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }
    
    
}
