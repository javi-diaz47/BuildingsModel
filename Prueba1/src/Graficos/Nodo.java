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
public class Nodo{
    int getX = 0; 
    int getY = 0; 
    public void Circulo(Graphics g, int x, int y, int x1, int y1){
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, y1, y1);
    }
    
    public void Rectangulo(Graphics g, int x, int y, int x1, int x2){
        //g.getColor(Color.BLUE);
        g.fillRect(x, y, x1, x2);
  
    }
    
    public void Linea(Graphics g, int x, int y, int x1, int y1, ArrayList<Nodo> ArregloNodo, int r){
        //g.drawLine(x, y, x1, y2);
        //r = 100;
        int[] are_two_nodes = new int[2];
        are_two_nodes[0] = -1;
        are_two_nodes[1] = -1;
        if(ArregloNodo.size() >= 2){
            for (int i = 0; i < ArregloNodo.size(); i++) {
                //System.out.println("Hey, aca estamos");
                
                if( (x >= ArregloNodo.get(i).getX - r  - 5) && (x <= ArregloNodo.get(i).getX + r  - 5) && (y >= ArregloNodo.get(i).getY - r  - 5) && (y <= ArregloNodo.get(i).getY + r - 5) ){
                    System.out.println("Compa se puede x...!");
                    
                    if(are_two_nodes[0] == -1){
                        are_two_nodes[0] = i;
                        x = ArregloNodo.get(i).getX+20;
                        y = ArregloNodo.get(i).getY + 20;
                    }
                    //break;
                } 
                 
                if( (x1 >= ArregloNodo.get(i).getX - r  - 5) && (x1 <= ArregloNodo.get(i).getX + r  - 5) && (y1 >= ArregloNodo.get(i).getY - r  - 5) && (y1 <= ArregloNodo.get(i).getY + r - 5) ){
                    System.out.println("Compa se puede x1...!");
                    
                    if(are_two_nodes[1] == -1){
                        are_two_nodes[1] = i;
                        x1 = ArregloNodo.get(i).getX +20;
                        y1 = ArregloNodo.get(i).getY + 20;
                    }
                    //break;
                } 
                if(are_two_nodes[0] > -1 && are_two_nodes[1] > -1){
                    if(are_two_nodes[0] != are_two_nodes[1]) {
                        
//                        if(x == x1 && y<y1){
//                            //System.out.println("y: " + y+ " y1: " + y1 + "\n" );
//                            y += 21;
//                            y1 -= 21; 
//                        } else if(x==x1 && y>y1){
//                            y1 += 21;
//                            y -= 21;
//                        } else if(x < x1 && y < y1){
//                            //System.out.println("y: este" + y+ " y1: " + y1 + "\n" );
//                            y += 15;
//                            y1 -= 15;
//                            x += 15;
//                            x1 -= 15;
//                        }else if(x>x1 && y < y1){
//                           
//                            y += 15;
//                            y1 -= 15;
//                            x -= 15;
//                            x1 += 15;
//                        } else if(x < x1 && y > y1){
//                            
//                            y -= 15;
//                            y1 += 15;
//                            x += 15;
//                            x1 -= 15;
//                        }else if(x > x1 && y > y1){
//                            System.out.println("y: este" + y+ " y1: " + y1 + "\n" );
//                            y -= 15;
//                            y1 += 15;
//                            x -= 15;
//                            x1 += 15;
//                        }
//                            
                        
                        Graphics2D g2 = (Graphics2D) g;
                        g2.setStroke(new BasicStroke(3));
                        g2.draw(new Line2D.Float(x, y, x1, y1));
                        
                        //Modifique esta wea
                        for(Nodo nodo: ArregloNodo){
                            nodo.Circulo(g, nodo.getX, nodo.getY, r, r);
                        }
                        
                    }
                    break;
                }
                
            }
            
            
        }
        
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
    
    
    
}