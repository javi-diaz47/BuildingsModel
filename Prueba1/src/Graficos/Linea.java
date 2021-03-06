package Graficos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author edalr
 */
public class Linea {
    
    int inicio = 0; 
    int end = 0; 
    int id1 = 0; 
    int id2 = 0; 
    int id = 0;
    int Flujo = 0;
    int Lam = 0;
    public int Linea(Graphics g, int x, int y, int x1, int y1, ArrayList<Nodo> ArregloNodo, int r, ArrayList<Linea> ArregloLinea, Linea l, ArrayList<JLabel> ArregloJLabel, JPanel Panelp, int contadorArista){
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
                } 
                if(are_two_nodes[0] > -1 && are_two_nodes[1] > -1){
                    if(are_two_nodes[0] != are_two_nodes[1]) {                     
                        
                        Graphics2D g2 = (Graphics2D) g;
                        g2.setStroke(new BasicStroke(3));
                        g2.draw(new Line2D.Float(x, y, x1, y1));
                        
                        l.setInicio(id1);
                        l.setEnd(id2);
                        l.setId(contadorArista+1);
                        l.setFlujo(0);
                        l.setLam(0);
                        ArregloLinea.add(l);
                        System.out.println("LA WEA ID " + l.id);
                        
                        contadorArista++;
                        
                        Label labelArista = new Label();
                        labelArista.CrearLabelArista(ArregloLinea, ArregloNodo, Panelp);
                        
                        System.out.println("Numero de lienas: " + ArregloLinea.size());
                        
                        //Repintando nodos
                        for(Nodo nodo: ArregloNodo){
                            if(Integer.valueOf(nodo.Cmaximo) >= 100) {
                                nodo.Rectangulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.cyan);
                            }else if(Integer.valueOf(nodo.Cminimo) > 0){ 
                                nodo.Circulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.red);
                            }else{
                                nodo.Circulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.yellow);
                            }
                            //nodo.Circulo(g, nodo.getX, nodo.getY, r, r,Color.yellow);
                             Label labelId = new Label();
                             labelId.CreateId(Panelp, ArregloNodo, nodo.id);

                        }  
                        
                        //REpintando labels
                        Label label = new Label(); 
                        for (int j = 0; j < ArregloJLabel.size(); j++) {
                           int aux = Integer.valueOf(ArregloNodo.get(j).getCminimo());
                           label.CreateLabel(Panelp, ArregloJLabel, aux, ArregloNodo.get(j).getX, ArregloNodo.get(j).getY, "", ArregloNodo); 
                        }
                        
                        // System.out.println("ArregloJLabelArista.size() = " + ArregloJLabelArista.size());
//                         for (JLabel labelA : ArregloJLabelArista) {
//                             Panelp.add(labelA);
//                         }
                        
                    }
                    break;
                } 
            }
        }
        
        return contadorArista;
    }
    
    public void LineaId(Graphics g, int inicio, int end, ArrayList<Nodo> ArregloNodo, int r, ArrayList<Linea>ArregloLinea,JPanel Panelp){
        System.out.println("Creando la arista Uwu");
        System.out.println("");
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        
        WeaNodo: for (Nodo nodo1 : ArregloNodo) {
            
            if(nodo1.id == id1){
                for (Nodo nodo2 : ArregloNodo) {
                    if(nodo2.id == id2){
                        
                        g2.draw(new Line2D.Float(nodo1.getX+21, nodo1.getY+21, nodo2.getX+21, nodo2.getY+21));                 
                        Label labelLinea = new Label();
                        break WeaNodo;
                    }
                    
                }
            }
            
        }
        for(Nodo nodo: ArregloNodo){
            if(Integer.valueOf(nodo.Cmaximo) >= 100) {
                nodo.Rectangulo(g, nodo.getX, nodo.getY, r, r,Color.cyan);
             }else if(Integer.valueOf(nodo.Cminimo) > 0){ 
                nodo.Circulo(g, nodo.getX, nodo.getY, r, r,Color.red);
             }else{
                 nodo.Circulo(g, nodo.getX, nodo.getY, r, r,Color.yellow);
             }
                     
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlujo() {
        return Flujo;
    }

    public void setFlujo(int Flujo) {
        this.Flujo = Flujo;
    }

    public int getLam() {
        return Lam;
    }

    public void setLam(int Lam) {
        this.Lam = Lam;
    }
    
}
