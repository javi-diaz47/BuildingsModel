package Graficos;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 *
 * @author edalr
 */
public class SaveModel {
    public void Save(ArrayList<Nodo> ArregloNodo, int contador, ArrayList<Linea> ArregloLinea, ArrayList<JLabel> ArregloJLabel){
        
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
                int colorId = 0;
                if(nodo.getColor() == Color.red){
                   colorId = 3;
                }else if(nodo.getColor() == Color.cyan){
                    colorId = 2;
                }else{
                    colorId = 1;
                }
                output.write("Node;" + nodo.getX + ";" + nodo.getY + ";" + nodo.id + ";" + nodo.Cminimo + ";" + nodo.getCmaximo() + ";" + colorId+ "\n");
            }
            
            for (Linea linea : ArregloLinea) {
                output.write("Line;" + linea.inicio + ";" + linea.end + "\n");
            }
           
             output.close();
        }catch(Exception e){

        }

   }
} 
