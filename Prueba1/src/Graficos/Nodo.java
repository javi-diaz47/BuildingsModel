/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author FELIX M. MARRUGO
 */
public class Nodo {
    public void Circulo(Graphics g, int x, int y, int x1, int y1){
      
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, y1, y1);
    }
    
    public void Rectangulo(Graphics g, int x, int y, int x1, int x2){
        //g.getColor(Color.BLUE);
        g.fillRect(x, y, x1, x2);
    }
    
    public void Linea(Graphics g, int x, int y, int x1, int y2){
        g.drawLine(x, y, x1, y2);
    }
}