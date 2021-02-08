/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author FELIX M. MARRUGO
 */
public class Edit {
    public void Edit(JPanel Panelp, JPanel JPanel1, ArrayList<JLabel>label, ArrayList<Nodo>ArregloNodo, String TextLabel, int Indicador){
        label.get(Indicador).setText(TextLabel);
    }
}
