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
    Color color;
    String Cminimo = "0";
    String Cmaximo = "0";
    
    public void Circulo(Graphics g, int x, int y, int x1, int y1, Color color){
        g.setColor(color);
        g.fillOval(x, y, y1, y1);
    }
    
    public void Rectangulo(Graphics g, int x, int y, int x1, int x2, Color color){
        g.setColor(color);
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

    public String getCminimo() {
        return Cminimo;
    }

    public void setCminimo(String Cminimo) {
        this.Cminimo = Cminimo;
    }

    public String getCmaximo() {
        return Cmaximo;
    }

    public void setCmaximo(String Cmaximo) {
        this.Cmaximo = Cmaximo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    
}