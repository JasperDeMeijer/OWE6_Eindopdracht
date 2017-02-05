/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owe6_eindopdracht;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author jdm
 */

public class FileProcessing {
    private String pathSelectedFile;
    private BufferedReader inFile1;
    
    public String FileChooser() {
        

        JFileChooser fc1 = new JFileChooser();
        int returnValue = fc1.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc1.getSelectedFile();
            pathSelectedFile = selectedFile.getPath();
        }
        return pathSelectedFile;

    }
    
    public ArrayList<String> FileRead(String filePath){
          int counter = 0;
        String regel;
        ArrayList<String> lines = new ArrayList<>();
        try {
            inFile1 = new BufferedReader(new FileReader(filePath));
            
            while ((regel = inFile1.readLine()) != null){
                if(counter == 0){
                    String header = regel;
                    counter++;
                } else{
                    lines.add(regel);
                }
                
            }
            
        } catch(FileNotFoundException ex){
            Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex){
            Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return lines;
    }
    
    
    
}
