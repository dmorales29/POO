/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foro.pkg2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import foro.pkg2.Computador;

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
                boolean datosValidos = false;

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
    
    public void verEquipos(int tipo) {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipos Registrados:\n\n");

        if (tipo == 1) { // Ver Computadores
            int tipoComputador = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de Computador que desea ver:\n1. Desktops\n2. Laptops"));
            if (tipoComputador == 1) { // Desktops
                sb.append("Desktops Registrados:\n");
                for (Computador computador : computador) {
                    if (computador instanceof Desktop) {
                        sb.append("Fabricante: ").append(computador.getFabricante()).append("\n");
                        sb.append("Modelo: ").append(computador.getModelo()).append("\n");
                        sb.append("Microprocesador: ").append(computador.getMicroprocesador()).append("\n\n");
                    }
                }
            } else if (tipoComputador == 2) { // Laptops
                sb.append("Laptops Registrados:\n");
                for (Computador computador : computador) {
                    if (computador instanceof Laptop) {
                        sb.append("Fabricante: ").append(computador.getFabricante()).append("\n");
                        sb.append("Modelo: ").append(computador.getModelo()).append("\n");
                        sb.append("Microprocesador: ").append(computador.getMicroprocesador()).append("\n\n");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else if (tipo == 2) { // Ver Tablets
            sb.append("Tablets Registrados:\n");
            for (Computador computador : computador) {
                if (computador instanceof Tablet) {
                    sb.append("Fabricante: ").append(computador.getFabricante()).append("\n");
                    sb.append("Modelo: ").append(computador.getModelo()).append("\n");
                    sb.append("Microprocesador: ").append(computador.getMicroprocesador()).append("\n\n");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Equipos Registrados", JOptionPane.INFORMATION_MESSAGE);
    }
}
