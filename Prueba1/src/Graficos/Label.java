/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author FELIX M. MARRUGO
 */
public class Label {
    int id = -1;
    String text;
    public void CreateLabel(JPanel Panelp, ArrayList<JLabel>ArregloJLabel, int id, int x, int y, String text, ArrayList<Nodo> ArregloNodo){
        Panelp.setLayout(null);
        JLabel label = new JLabel("", SwingConstants.CENTER);
        if(text.equals("")){
            label.setText("[0,0]");
        }else{
            
        for (Nodo nodo : ArregloNodo) {
            if(nodo.id == id){
                
                this.text = "["+nodo.Cminimo+"," + nodo.Cmaximo +"]";
                label.setText(this.text);
                break;
            }
            
        }
        
        Panelp.add(label);
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setBounds(x+6, y-20, 50,15);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
       // text = String.valueOf(id);
    }
    
    
}
