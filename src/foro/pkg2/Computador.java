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
public class Computador {
    

    private String fabricante;
    private String modelo;
    private String microprocesador;
    
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

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @param microprocesador the microprocesador to set
     */
    public void setMicroprocesador(String microprocesador) {
        this.microprocesador = microprocesador;
    }
    

}
