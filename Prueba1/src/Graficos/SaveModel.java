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
import javax.swing.JFileChooser;

/**
 *
 * @author edalr
 */
public class SaveModel {
    public void Save(int[]x, int[]y){
        
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
             output.write("Hello World!");
             output.close();
        }catch(Exception e){

        }

   }
} 
