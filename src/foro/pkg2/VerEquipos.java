/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foro.pkg2;
import java.util.List;
import javax.swing.JOptionPane;
import foro.pkg2.Computador;

/**
 *
 * @author Jorge LG
 */

public class VerEquipos {
     private List<Computador> computadores;

    public VerEquipos(List<Computador> computadores) {
        this.computadores = computadores;
}
    public void mostrarEquipos(int tipoComputador) {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipos Registrados:\n\n");

        switch (tipoComputador) {
            case 1: // Computador
                int tipoEquipo = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de Computador que desea ver:\n1. Desktop\n2. Laptop"));
                for (Computador computador : computadores) {
                    if ((tipoEquipo == 1 && computador instanceof Desktop) || (tipoEquipo == 2 && computador instanceof Laptop)) {
                        sb.append("Fabricante: ").append(computador.getFabricante()).append("\n");
                        sb.append("Modelo: ").append(computador.getModelo()).append("\n");
                        sb.append("Microprocesador: ").append(computador.getMicroprocesador()).append("\n\n");
                    }
                }
                break;
            case 2: // Tablet
                for (Computador computador : computadores) {
                    if (computador instanceof Tablet) {
                        sb.append("Fabricante: ").append(computador.getFabricante()).append("\n");
                        sb.append("Modelo: ").append(computador.getModelo()).append("\n");
                        sb.append("Microprocesador: ").append(computador.getMicroprocesador()).append("\n\n");
                    }
                }
                break;

                
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Equipos Registrados", JOptionPane.INFORMATION_MESSAGE);
    }
}


