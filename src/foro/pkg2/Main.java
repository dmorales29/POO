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

public class Main {
    public static void main(String[] args) {
        RegistrarEquipos registro = new RegistrarEquipos();
        List<Computador> computadores = new ArrayList<>();
        int opcion;
        
        do {
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú\n" +
                    "1. Registrar equipo\n" +
                    "2. Ver equipos\n" +
                    "3. Salir\n" +
                    "Seleccione una opción:"));
            switch (opcion) {
                case 1:
                    int tipoEquipo = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de equipo:\n" +
                            "1. Desktop\n" +
                            "2. Laptop\n" +
                            "3. Tablet"));
                    registro.registrarEquipo(tipoEquipo);
                    break;
                case 2:
                    int tipoVerEquipo = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de equipos a ver:\n" +
                            "1. Computadoras\n" +
                            "2. Tablets\n"));
                    registro.verEquipos(tipoVerEquipo);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, seleccione nuevamente.");
                    break;
            }
        } while (opcion != 3);
    }
}
