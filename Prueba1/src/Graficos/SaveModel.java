/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author edalr
 */
public class SaveModel {
    public void Save(ArrayList<Nodo> ArregloNodo, int contador, ArrayList<Linea> ArregloLinea){
        
        File dir = new File("Building-Models");
            
        if(!dir.exists()){
            dir.mkdir();
        }
       
        JFileChooser saveAs = new JFileChooser("./" + dir);
        saveAs.setApproveButtonText("Guardar");
        saveAs.showSaveDialog(null);

        File file = new File(saveAs.getSelectedFile() + ".txt");
        try{
             BufferedWriter output = new BufferedWriter(new FileWriter(file));
            for (Nodo nodo : ArregloNodo) {
                output.write("Node;" + nodo.getX + ";" + nodo.getY + ";" + nodo.id + "\n");
            }
            for (Linea linea : ArregloLinea) {
                output.write("Line;" + linea.inicio + ";" + linea.end + "\n");
            }
            //output.write("Counter:" + contador + "\n");
             output.close();
        }catch(Exception e){

        }

   }
} 
