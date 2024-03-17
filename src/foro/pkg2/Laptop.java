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
    };
};    

