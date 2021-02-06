/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import javax.swing.*;

/**
 *o {

 * @author FELIX M. MARRUGO
 */
public class Nodo {
    int getX = 0; 
    int getY = 0; 
    int id = 0; 
    public void Circulo(Graphics g, int x, int y, int x1, int y1){
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, y1, y1);
        
        
    }
    
    public void Rectangulo(Graphics g, int x, int y, int x1, int x2){
        //g.getColor(Color.BLUE);
        g.fillRect(x, y, x1, x2);
  
    }
    
    public int getGetX() {
        return getX;
    }

    public int getGetY() {
        return getY;
    }

    public void setGetX(int getX) {
        this.getX = getX;
    }

    public void setGetY(int getY) {
        this.getY = getY;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }

    
}