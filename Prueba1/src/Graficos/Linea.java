/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 *
 * @author edalr
 */
public class Linea {
    
    int inicio = 0; 
    int end = 0; 
    int id1 = 0; 
    int id2 = 0; 
    public void Linea(Graphics g, int x, int y, int x1, int y1, ArrayList<Nodo> ArregloNodo, int r, ArrayList<Linea> ArregloLinea, Linea l){
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
                        id1 = ArregloNodo.get(i).id; 
                    }
                    //break;
                } 
                 
                if( (x1 >= ArregloNodo.get(i).getX - r  - 5) && (x1 <= ArregloNodo.get(i).getX + r  - 5) && (y1 >= ArregloNodo.get(i).getY - r  - 5) && (y1 <= ArregloNodo.get(i).getY + r - 5) ){
                    System.out.println("Compa se puede x1...!");
                    
                    if(are_two_nodes[1] == -1){
                        are_two_nodes[1] = i;
                        x1 = ArregloNodo.get(i).getX +20;
                        y1 = ArregloNodo.get(i).getY + 20;
                        id2 = ArregloNodo.get(i).id; 
                    }
                    //break;
                } 
                if(are_two_nodes[0] > -1 && are_two_nodes[1] > -1){
                    if(are_two_nodes[0] != are_two_nodes[1]) {                     
                        
                        Graphics2D g2 = (Graphics2D) g;
                        g2.setStroke(new BasicStroke(3));
                        g2.draw(new Line2D.Float(x, y, x1, y1));
                        
                        l.setInicio(id1);
                        l.setEnd(id2);
                        
                        ArregloLinea.add(l);
                        
                        System.out.println("Id1: " + id1 + " Id2: " + id2);
                        System.out.println("Numero de lienas: " + ArregloLinea.size());
                        
                        for(Nodo nodo: ArregloNodo){
                            nodo.Circulo(g, nodo.getX, nodo.getY, r, r);
                        }  
                    }
                    break;
                } 
            }
        }
    }
    
    public void LineaId(Graphics g, int inicio, int end, ArrayList<Nodo> ArregloNodo, int r){
        System.out.println("Creando la arista Uwu");
        System.out.println("");
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        
        for (Nodo nodo1 : ArregloNodo) {
            
            if(nodo1.id == id1){
                for (Nodo nodo2 : ArregloNodo) {
                    if(nodo2.id == id2){
                        
                        g2.draw(new Line2D.Float(nodo1.getX+21, nodo1.getY+21, nodo2.getX+21, nodo2.getY+21));                 
                        
                    }
                    
                }
            }
            
        }
        
        
        for(Nodo nodo: ArregloNodo){
            nodo.Circulo(g, nodo.getX, nodo.getY, r, r);
        }  
    }
    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    
    
}
