/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foro.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */

public class Main {
    public static void main(String[] args) {
        RegistrarEquipos registro = new RegistrarEquipos();
        int opcion = 0;
        
        do {
            String input = JOptionPane.showInputDialog("Menú\n" +
                "1. Registrar equipo\n" +
                "2. Ver equipos\n" +
                "3. Salir\n" +
                "Seleccione una opción:");
        
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            }

            try {
                opcion = Integer.parseInt(input);

                switch (opcion) {
                    case 1:
                        String tipoEquipoInput = JOptionPane.showInputDialog("Seleccione el tipo de equipo:\n" +
                                "1. Desktops\n" +
                                "2. Laptops\n" +
                                "3. Tablets");
                        if (tipoEquipoInput != null) {
                            int tipoEquipo = Integer.parseInt(tipoEquipoInput);
                            registro.registrarEquipo(tipoEquipo);
                        } else {
                            JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                            return;
                        }
                        break;
                    case 2:
                        boolean verEquipos = true;
                        while (verEquipos) {
                            String tipoVerEquipoInput = JOptionPane.showInputDialog("Seleccione el tipo de equipos a ver:\n" +
                                "1. Desktops\n" +
                                "2. Laptops\n" +
                                "3. Tablets\n");

                            if (tipoVerEquipoInput != null && !tipoVerEquipoInput.trim().isEmpty()) {
                                try {
                                    int tipoVerEquipo = Integer.parseInt(tipoVerEquipoInput);
                                    if (tipoVerEquipo >= 1 && tipoVerEquipo <= 3) {
                                        registro.verEquipos(tipoVerEquipo);
                                        verEquipos = false; // Salir del bucle interno
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Opción inválida, seleccione nuevamente.");
                                    }
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
                                }
                            } else if (tipoVerEquipoInput != null && tipoVerEquipoInput.trim().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "No ha ingresado ninguna opción.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                                return;
                            }
                        }
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "2Saliendo del programa...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "3Opción inválida, seleccione nuevamente.");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "4Entrada inválida, por favor ingrese un número válido.");
            }            
        } while (opcion != 3);
    }
}
