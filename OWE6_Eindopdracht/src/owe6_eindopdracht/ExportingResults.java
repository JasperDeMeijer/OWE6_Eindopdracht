/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owe6_eindopdracht;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jdm
 */
public class ExportingResults {
    private FileWriter file;
    private BufferedWriter buffered;
   
   
    public void ExportGenes(ArrayList <Gene> exportList, String header, String filePath){
        
        try {
            file = new FileWriter(filePath);
            buffered = new BufferedWriter(file);
            ArrayList <Gene> exportListSorted = exportList;
            Collections.sort(exportListSorted);
            buffered.write(header + "\n");
            for (Gene exportGene: exportList){
                String taxID1 = Integer.toString(exportGene.getTaxID1());
                String geneID1 = Integer.toString(exportGene.getTaxID1());
                String productAccessionVersion1 = exportGene.getProductAccessionVersion1();
                String interactionShortPhrase = exportGene.getInteractionShortPhrase();
                String taxID2 = Integer.toString(exportGene.getTaxID2());
                String geneID2 = Integer.toString(exportGene.getGeneID2());
                String productAccessionVersion2 = exportGene.getProductAccessionVersion2();
                String productName2 = exportGene.getProductName2();
                String pubMedID = exportGene.getPubMedID();
                String lastUpdate = exportGene.getLastUpdate();
                String geneRIFText = exportGene.getGeneRIFText();
                buffered.write(taxID1 + "\t" + geneID1 + "\t" + productAccessionVersion1 + "\t" + interactionShortPhrase + "\t" + taxID2 + "\t" + geneID2 +
                               "\t" + productAccessionVersion2 + "\t" + productName2 + "\t" + pubMedID + "\t" +lastUpdate + "\t" + geneRIFText + "\n"  );
                 
            
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Er heeft zich een input/output error voorgedaan", "Error Message",
                        JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (buffered != null){
                    buffered.close();
                }
                if (file != null){
                    file.close();
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Er heeft zich een input/output error voorgedaan", "Error Message",
                        JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
    }
}
