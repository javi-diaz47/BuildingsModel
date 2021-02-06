/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.util.ArrayList;

/**
 *
 * @author edalr
 */
public class Weatest {
 
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList();
        
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }
        
        System.out.println("Eliminando el numero 3");
        
        for (int i = 0; i < arr.size(); i++) {
            
            if(arr.get(i) == 3){
                arr.remove(i);
            }
            
            System.out.println("arr.size() = " + arr.size());
            
        }
        
    }
    
}
