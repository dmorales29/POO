/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foro.pkg2;

/**
 *
 * @author david
 */

class Computador {
    protected String fabricante;
    protected String modelo;
    protected String microprocesador;
    
    public Computador (String fabricante, String modelo, String microprocesador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
    };
    
    public String getFabricante () {
        return fabricante;
    };
    
    public String getModelo () {
        return modelo;
    };
    
    public String getMicroprocesador () {
        return microprocesador;
    };
}

class Desktop extends Computador {
    private final int memoria;
    private final String tarjetaGrafica;
    private final String tamanoTorre;
    private final int capacidadDisco;
    
    public Desktop (String fabricante, String modelo, String microprocesador, int memoria, String tarjetaGrafica, String tamanoTorre, int capacidadDisco) {
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanoTorre = tamanoTorre;
        this.capacidadDisco = capacidadDisco;
    }
};

class Laptop extends Computador {
    private final int memoria;
    private final double tamanoPantalla;
    private final int capacidadDisco;
    
    public Laptop (String fabricante, String modelo, String microprocesador, int memoria, double tamanoPantalla, int capacidadDisco) {
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tamanoPantalla = tamanoPantalla;
        this.capacidadDisco = capacidadDisco;
    };
};

class Tablet extends Computador {
    private final double tamanoDiagonalPantalla;
    private final boolean capacitivaResistiva;
    private final int tamanoMemoriaNAND;
    private final String sO;
    
    public Tablet (String fabricante, String modelo, String microprocesador, double tamanoDiagonalPantalla, boolean capacitivaResistiva, int tamanoMemoriaNAND, String sO) {
        super(fabricante, modelo, microprocesador);
        this.tamanoDiagonalPantalla = tamanoDiagonalPantalla;
        this.capacitivaResistiva = capacitivaResistiva;
        this.tamanoMemoriaNAND = tamanoMemoriaNAND;
        this.sO = sO;
    };
}

public class Main {
    public static void main(String[] args) {
        RegistrarEquipos registroEquipos = new RegistrarEquipos();
        
        // Ejemplo de registro de un equipo Desktop (Tipo 1)
        //registroEquipos.registrarEquipo(1);
        
        // Ejemplo de registro de un equipo Laptop (Tipo 2)
       //registroEquipos.registrarEquipo(2);
        
        // Ejemplo de registro de un equipo Tablet (Tipo 3)
        registroEquipos.registrarEquipo(3);
    }
}
