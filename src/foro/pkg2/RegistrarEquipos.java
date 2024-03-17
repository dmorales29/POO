/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foro.pkg2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class RegistrarEquipos {
    List<Computador> computador = new ArrayList<>();
    
    public void registrarEquipo(int tipo) {
        String fabricante = JOptionPane.showInputDialog("Ingrese el fabricante del equipo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del equipo:");
        String microprocesador = JOptionPane.showInputDialog("Ingrese el microprocesador del equipo:");
        
        switch (tipo) {
            case 1:
                int memoriaDesktop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la memoria del equipo:"));
                String tarjetaGraficaDesktop = JOptionPane.showInputDialog("Ingrese la tarjeta gráfica del equipo:");
                String tamanoTorreDesktop = JOptionPane.showInputDialog("Ingrese el tamaño de torre del equipo:");
                int capacidadDiscoDesktop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de disco duro del equipo:"));
                computador.add(new Desktop(fabricante, modelo, microprocesador, memoriaDesktop, tarjetaGraficaDesktop, tamanoTorreDesktop, capacidadDiscoDesktop));
                break;
                
            case 2:
                int memoriaLaptop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la memoria del equipo:"));
                double tamanoPantallaLaptop = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño de pantalla del equipo:"));
                int capacidadDiscoLaptop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de disco duro del equipo:"));
                computador.add(new Laptop(fabricante, modelo, microprocesador, memoriaLaptop, tamanoPantallaLaptop, capacidadDiscoLaptop));
                break;
                
            case 3:
                double tamanoDiagonalPantallaTablet = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño diagonal de pantalla del equipo:"));
                int opcionPantalla = JOptionPane.showOptionDialog(null, "Seleccione el tipo de pantalla:", "Tipo de Pantalla", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Capacitiva", "Resistiva"}, "Capacitiva");
                boolean capacitivaResistiva = opcionPantalla == 0; // True si el usuario selecciona "Capacitiva", false si selecciona "Resistiva"
                int tamanoMemoriaNANDTablet = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de memoria NAND del equipo:"));
                String sOTablet = JOptionPane.showInputDialog("Ingrese el sistema operativo del equipo:");
                computador.add(new Tablet(fabricante, modelo, microprocesador, tamanoDiagonalPantallaTablet, capacitivaResistiva, tamanoMemoriaNANDTablet, sOTablet));
                break;
            default:
                break;
        }
    }
}
