/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foro.pkg2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

/**
 *
 * @author david
 */
public class RegistrarEquipos {
    List<Computador> computadores = new ArrayList<>();
    
    public void registrarEquipo(int tipo) {
        String fabricante = JOptionPane.showInputDialog("Ingrese el fabricante del equipo:");
        while(fabricante.isEmpty()) {
            JOptionPane optionPane = new JOptionPane("Fabricante no válido", JOptionPane.ERROR_MESSAGE);    
            JDialog dialog = optionPane.createDialog("Failure");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            fabricante = JOptionPane.showInputDialog("Ingrese el fabricante del equipo:");
        }
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del equipo:");
        while(modelo.isEmpty()) {
            JOptionPane optionPane = new JOptionPane("Modelo no válido", JOptionPane.ERROR_MESSAGE);    
            JDialog dialog = optionPane.createDialog("Failure");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            modelo = JOptionPane.showInputDialog("Ingrese el modelo del equipo:");
        }
        String microprocesador = JOptionPane.showInputDialog("Ingrese el microprocesador del equipo:");
        while(microprocesador.isEmpty()) {
            JOptionPane optionPane = new JOptionPane("Microprocesador no válido", JOptionPane.ERROR_MESSAGE);    
            JDialog dialog = optionPane.createDialog("Failure");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            microprocesador = JOptionPane.showInputDialog("Ingrese el microprocesador del equipo:");
        }

        switch (tipo) {
            case 1:
                String memoriaDesktopString = JOptionPane.showInputDialog("Ingrese la memoria del equipo:");
                while(memoriaDesktopString.isEmpty() || !isNumeric(memoriaDesktopString)) {
                    JOptionPane optionPane = new JOptionPane("Memoria del Equipo no válido", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    memoriaDesktopString = JOptionPane.showInputDialog("Ingrese la memoria del equipo:");
                }
                int memoriaDesktop = Integer.parseInt(memoriaDesktopString);
                String tarjetaGraficaDesktop = JOptionPane.showInputDialog("Ingrese la tarjeta gráfica del equipo:");
                while(tarjetaGraficaDesktop.isEmpty()) {
                    JOptionPane optionPane = new JOptionPane("Tarjeta gráfica del Equipo no válido", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    tarjetaGraficaDesktop = JOptionPane.showInputDialog("Ingrese la tarjeta gráfica del equipo:");
                }
                String tamanoTorreDesktop = JOptionPane.showInputDialog("Ingrese el tamaño de torre del equipo:");
                while(tamanoTorreDesktop.isEmpty()) {
                    JOptionPane optionPane = new JOptionPane("Tamaño de la torre del Equipo no válido", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    tamanoTorreDesktop = JOptionPane.showInputDialog("Ingrese el tamaño de torre del equipo:");
                }
                String capacidadDiscoDesktopString = JOptionPane.showInputDialog("Ingrese la capacidad de disco duro del equipo:");
                while(capacidadDiscoDesktopString.isEmpty() || !isNumeric(capacidadDiscoDesktopString)) {
                    JOptionPane optionPane = new JOptionPane("Capacidad del disco duro no válido", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    capacidadDiscoDesktopString = JOptionPane.showInputDialog("Ingrese la capacidad de disco duro del equipo:");
                }
                int capacidadDiscoDesktop = Integer.parseInt(capacidadDiscoDesktopString);
                computadores.add(new Desktop(fabricante, modelo, microprocesador, memoriaDesktop, tarjetaGraficaDesktop, tamanoTorreDesktop, capacidadDiscoDesktop));
                break;

            case 2:
                String memoriaLaptopString = JOptionPane.showInputDialog("Ingrese la memoria del equipo:");
                while(memoriaLaptopString.isEmpty() || !isNumeric(memoriaLaptopString)) {
                    JOptionPane optionPane = new JOptionPane("Memoria del Equipo no válido", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    memoriaLaptopString = JOptionPane.showInputDialog("Ingrese la memoria del equipo:");
                }
                int memoriaLaptop = Integer.parseInt(memoriaLaptopString);
                String tamanoPantallaLaptopString = JOptionPane.showInputDialog("Ingrese el tamaño de pantalla del equipo:");
                while(tamanoPantallaLaptopString.isEmpty() || !isNumeric(tamanoPantallaLaptopString)) {
                    JOptionPane optionPane = new JOptionPane("Tamaño de pantalla no válido", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    tamanoPantallaLaptopString = JOptionPane.showInputDialog("Ingrese el tamaño de pantalla del equipo:");
                }
                double tamanoPantallaLaptop = Double.parseDouble(tamanoPantallaLaptopString);
                String capacidadDiscoLaptopString = JOptionPane.showInputDialog("Ingrese la capacidad de disco duro del equipo:");
                while(capacidadDiscoLaptopString.isEmpty() || !isNumeric(capacidadDiscoLaptopString)) {
                    JOptionPane optionPane = new JOptionPane("Capacidad de disco duro no válido", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    capacidadDiscoLaptopString = JOptionPane.showInputDialog("Ingrese la capacidad de disco duro del equipo:");
                }
                int capacidadDiscoLaptop = Integer.parseInt(capacidadDiscoLaptopString);
                computadores.add(new Laptop(fabricante, modelo, microprocesador, memoriaLaptop, tamanoPantallaLaptop, capacidadDiscoLaptop));
                break;

            case 3:
                String tamanoDiagonalPantallaTabletString = JOptionPane.showInputDialog("Ingrese el tamaño diagonal de pantalla del equipo:");
                while(tamanoDiagonalPantallaTabletString.isEmpty() || !isNumeric(tamanoDiagonalPantallaTabletString)) {
                    JOptionPane optionPane = new JOptionPane("Tamaño diagonal de pantalla no válido", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    tamanoDiagonalPantallaTabletString = JOptionPane.showInputDialog("Ingrese el tamaño diagonal de pantalla del equipo:");
                }
                double tamanoDiagonalPantallaTablet = Double.parseDouble(tamanoDiagonalPantallaTabletString);
                String capacitivaResistiva = ""; // True si el usuario selecciona "Capacitiva", false si selecciona "Resistiva"
                int opcionPantalla = JOptionPane.showOptionDialog(null, "Seleccione el tipo de pantalla:", "Tipo de Pantalla", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Capacitiva", "Resistiva"}, "Capacitiva");
                if(opcionPantalla == 0) {
                    capacitivaResistiva = "Capacitiva";
                } else {
                    capacitivaResistiva = "Resistiva";
                }
                String tamanoMemoriaNANDTabletString = JOptionPane.showInputDialog("Ingrese el tamaño de memoria NAND del equipo:");
                while(tamanoMemoriaNANDTabletString.isEmpty()|| !isNumeric(tamanoMemoriaNANDTabletString)) {
                    JOptionPane optionPane = new JOptionPane("Tamaño de memoria NAND no válido", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    tamanoMemoriaNANDTabletString = JOptionPane.showInputDialog("Ingrese el tamaño de memoria NAND del equipo:");
                }
                int tamanoMemoriaNANDTablet = Integer.parseInt(tamanoMemoriaNANDTabletString);
                String sOTablet = JOptionPane.showInputDialog("Ingrese el sistema operativo del equipo:");
                while(sOTablet.isEmpty()) {
                    JOptionPane optionPane = new JOptionPane("Sistema Operativo no válido", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    sOTablet = JOptionPane.showInputDialog("Ingrese el sistema operativo del equipo:");
                }
                computadores.add(new Tablet(fabricante, modelo, microprocesador, tamanoDiagonalPantallaTablet, capacitivaResistiva, tamanoMemoriaNANDTablet, sOTablet));
                break;
            default:
                break;
        }
    }

    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Double.parseDouble(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
    
    public void verEquipos(int tipo) {
        StringBuilder sb = new StringBuilder();
        
        if (tipo == 1) { // Ver Desktops
            sb.append("Desktops registradas:\n");
            
            for (Computador computador : computadores) {
                if (computador instanceof Desktop) {
                    sb.append("Fabricante: ").append(computador.getFabricante()).append("\n");
                    sb.append("Modelo: ").append(computador.getModelo()).append("\n");
                    sb.append("Microprocesador: ").append(computador.getMicroprocesador()).append("\n");
                    sb.append("Memoria: ").append(((Desktop) computador).getMemoria()).append(" GB RAM\n");
                    sb.append("Tarjeta Gráfica: ").append(((Desktop) computador).getTarjetaGrafica()).append("\n");
                    sb.append("Tamaño de Torre: ").append(((Desktop) computador).getTamanoTorre()).append("\n");
                    sb.append("Capacidad de disco duro: ").append(((Desktop) computador).getCapacidadDisco()).append(" GB\n\n");
                }
            }
        } else if (tipo == 2) { // Ver Laptops
            sb.append("Laptops registradas:\n");
            
            for (Computador computador : computadores) {
                if (computador instanceof Laptop) {
                    sb.append("Fabricante: ").append(computador.getFabricante()).append("\n");
                    sb.append("Modelo: ").append(computador.getModelo()).append("\n");
                    sb.append("Microprocesador: ").append(computador.getMicroprocesador()).append("\n");
                    sb.append("Memoria: ").append(((Laptop) computador).getMemoria()).append(" GB RAM\n");
                    sb.append("Tamaño pantalla: ").append(((Laptop) computador).getTamanoPantalla()).append("”\n");
                    sb.append("Capacidad de disco duro: ").append(((Laptop) computador).getCapacidadDisco()).append(" GB\n\n");
                }
            }
        } else if (tipo == 3) { // Ver Tablets
            sb.append("Tablets registradas:\n");
            
            for (Computador computador : computadores) {
                if (computador instanceof Tablet) {
                    sb.append("Fabricante: ").append(computador.getFabricante()).append("\n");
                    sb.append("Modelo: ").append(computador.getModelo()).append("\n");
                    sb.append("Microprocesador: ").append(computador.getMicroprocesador()).append("\n");
                    sb.append("Tamaño diagonal de pantalla: ").append(((Tablet) computador).getTamanoDiagonalPantalla()).append("”\n");
                    sb.append("¿Capacitiva/Resistiva?: ").append(((Tablet) computador).getCapacitivaResistiva()).append("\n");
                    sb.append("Tamaño memoria NAND: ").append(((Tablet) computador).getTamanoMemoriaNAND()).append(" GB\n");
                    sb.append("Sistema Operativo: ").append(((Tablet) computador).getSO()).append("\n\n");
                }
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}