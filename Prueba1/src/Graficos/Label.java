/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author edalr
 */
public class Label extends JLabel{
    public int x;
    public int y;
    String text;
    
    public void CreateLabel(int x, int y, String text, ArrayList<Nodo>ArregloNodo,  ArrayList<JLabel>ArregloJLabel,JPanel Panelp, int id){
        System.out.println("Estoy en Label");
        this.x = x;
        this.y = y;
        this.text = text;
        int r = 40;
        Panelp.setLayout(null);
        JLabel label = new JLabel("q", SwingConstants.CENTER);
        label.setText(String.valueOf(ArregloNodo.get(id).id));
        Panelp.add(label);
        label.setBackground(Color.yellow);
        //label.setColor(Color.yellow);
        label.setOpaque(true);
        
        /* Aqui hay un error */
        label.setBounds(ArregloNodo.get(id).getX-12, ArregloNodo.get(id).getY-12, 25,25);
        System.out.println("Vamos bien");
        //label.setVerticalAlignment(SwingConstants.CENTER);
        ArregloJLabel.add(label);
        //Panelp.removeAll();
        //repaint();
        Nodo n = new Nodo();
        System.out.println("ArregloNodo.size() en el label = " + ArregloNodo.size());
        for (int i = 0; i <= ArregloNodo.size(); i++) {
            System.out.println("Repintando nodos en Label \n");
            n.Circulo(Panelp.getGraphics(), ArregloNodo.get(i).getX, ArregloNodo.get(i).getX, r, r);            
        }
    }
    
    public void DeleteLabel(JPanel Panelp, ArrayList<JLabel>ArregloJLabel, int IdNodo){
        
        Container parent = ArregloJLabel.get(IdNodo).getParent();
        parent.remove(ArregloJLabel.get(IdNodo));
        parent.validate();
        parent.repaint();
        
        ArregloJLabel.remove(IdNodo);

        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
}
