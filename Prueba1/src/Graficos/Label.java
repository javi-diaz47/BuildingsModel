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
        label.setBounds(x-5, y-20, 50,15);
        }
    }
    public void CreateId(JPanel Panelp, ArrayList<Nodo> ArregloNodo, int id){
        Panelp.setLayout(null);
        JLabel label = new JLabel("", SwingConstants.CENTER);
        
        label.setText(String.valueOf(id));
  
        Panelp.add(label);
        
         for (Nodo nodo : ArregloNodo) {
                if(nodo.id == id){
                    label.setBackground(nodo.color);
                    label.setOpaque(true);
                    label.setBounds(nodo.getX+4, nodo.getY+12, 30,15);
                    break;
                }
         }
    }
            
    public void LabelArista(ArrayList<Linea>ArregloLinea,ArrayList<Nodo> ArregloNodo, JPanel Panelp){
        text = "";
        int x = 0;
        int y = 0;
        
        for (Linea linea : ArregloLinea) {
            JLabel label = new JLabel("", SwingConstants.CENTER);
            this.text = "["+ linea.getInicio() + "," + linea.getEnd() + "," + linea.getId() +"]";
            label.setText(this.text);

            lililinea: for (Nodo nodoInicio : ArregloNodo) {
                if(nodoInicio.id == linea.getInicio()){
                    for (Nodo nodoFinal : ArregloNodo) {
                        if(nodoFinal.id == linea.getEnd()){
                            x = (nodoInicio.getX + nodoFinal.getX)/2;
                            y = (nodoInicio.getY + nodoFinal.getY)/2;
                            break lililinea;
                        }
                    }//Halla Nodo final
                }
            }//Halla Nodo Inicio
            label.setBounds(x, y, 50,15);
            label.setBackground(Color.white);
            label.setOpaque(true);
            
            Panelp.add(label);
            
        }
        
    }    
    
    
     public void CrearLabelArista(ArrayList<Linea>ArregloLinea,ArrayList<Nodo> ArregloNodo, JPanel Panelp){
        text = "";
        int x = 0;
        int y = 0;
        
        ArrayList<JLabel> ArregloJLabelArista = new ArrayList();
        JLabel label = new JLabel("", SwingConstants.CENTER);
       
        for (Linea linea : ArregloLinea) {
            this.text = "["+ linea.getInicio() + "," + linea.getEnd() + "," + linea.getId() +"]";
            label.setText(this.text);
            lililinea: for (Nodo nodoInicio : ArregloNodo) {
                if(nodoInicio.id == linea.getInicio()){
                    for (Nodo nodoFinal : ArregloNodo) {
                        if(nodoFinal.id == linea.getEnd()){
                            x = (nodoInicio.getX + nodoFinal.getX)/2;
                            y = (nodoInicio.getY + nodoFinal.getY)/2;
                            break lililinea;
                        }
                    }//Halla Nodo final
                }
            }//Halla Nodo Inicio
            label.setBounds(x, y, 50,15);
            label.setBackground(Color.white);
            label.setOpaque(true);
            ArregloJLabelArista.add(label);
            Panelp.add(label);
        }
        
    }     
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    
}
