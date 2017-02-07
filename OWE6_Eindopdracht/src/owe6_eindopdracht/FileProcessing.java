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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author jdm
 * Class for processing the chosen file.
 */
public class FileProcessing {
    //Start variable declaration
    private String pathSelectedFile;
    private BufferedReader inFile1;
    private int counterUnique;
    private HashMap interactionShortPhraseMap = new HashMap();
    private String header;
    //End variable declaration
    /**
     *
     * @return String Selected file path
     * Opens a file chooser and returns the path of the chosen file.
     */
    public String FileChooser() {

        JFileChooser fc1 = new JFileChooser();
        int returnValue = fc1.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc1.getSelectedFile();
            pathSelectedFile = selectedFile.getPath();
        }
        return pathSelectedFile;

    }

    /**
     *
     * @param filePath the path of selected path
     * @return Every line of the given file except for the header
     * Processes the file and returns every line except for the header.
     * The header will be saved for later use.
     * Catches FileNotFoundException and IOException.
     * An exception catch will give the user a popup with a notification what went wrong.
     */
    public ArrayList<String> FileRead(String filePath) {

        String regel;
        ArrayList<String> lines = new ArrayList<>();
        try {
            inFile1 = new BufferedReader(new FileReader(filePath));

            while ((regel = inFile1.readLine()) != null) {
                if (regel.contains("#")) {
                    header = regel;
                } else {
                    lines.add(regel);
                }

            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Het Geselecteerde bestand is niet gevonden", "Error Message",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Er heeft zich een input/output error voorgedaan", "Error Message",
                    JOptionPane.ERROR_MESSAGE);

        }

        return lines;
    }

    /**
     *
     * @param interactionShortPhrase 
     * @param geneList
     * Itterates over the original gene list, if a gene contains the given interaction short phrase
     * it will be stored in a Hashmap
     * Creates a HashMap with a counter as key (can be used as index of the original genelist)
     * Gene ID1 of the corresponding gene is used as value. 
     */
    public void OverlapListBuilder(String interactionShortPhrase, ArrayList<Gene> geneList) {
        interactionShortPhraseMap.clear();
        counterUnique = 0;
        int counter = 0;
        for (Gene gene : geneList) {
            if (gene.getInteractionShortPhrase().equals(interactionShortPhrase)) {
                interactionShortPhraseMap.put(counter, gene.getGeneID1());
                counterUnique++;

            }
            counter++;
        }

    }

    /**
     *
     * @param interactionShortPhrase
     */
    public void setOverlapListBuilder(HashMap interactionShortPhrase) {
        this.interactionShortPhraseMap = interactionShortPhrase;
    }

    /**
     *
     * @param counterUnique
     */
    public void setCounterUnique(int counterUnique) {
        this.counterUnique = counterUnique;
    }

    /**
     *
     * @param header
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     *
     * @return
     */
    public String getHeader() {
        return header;
    }

    /**
     *
     * @return
     */
    public int getCounterUnique() {
        return counterUnique;
    }

    /**
     *
     * @return
     */
    public HashMap getOverlapListBuilder() {
        return interactionShortPhraseMap;
    }

}
