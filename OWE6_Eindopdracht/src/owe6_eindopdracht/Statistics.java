/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owe6_eindopdracht;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jdm
 */
public class Statistics {
    
    /**
     *
     * @param genes list of genes
     * @return a int with the amount of unique genes
     * iterates over the ArrayList containing objects "Gene". Every object is 
     * added to a set. determining the size of the set gives the amount of unique genes.
     */
    public int CountUniqueGeneIDs1(ArrayList<Gene> genes){
       
        Set<Integer> uniqueGeneIDs = new HashSet<>();
        for( Gene gene: genes){
            uniqueGeneIDs.add(gene.getGeneID1());
        }
        int amountUniqueGeneIDs = uniqueGeneIDs.size();
        return amountUniqueGeneIDs;
    }
    
    /**
     *
     * @param genes list of genes
     * @return a int with the amount of unique genes
     * iterates over the ArrayList containing objects "Gene". Every object is 
     * added to a set. determining the size of the set gives the amount of unique genes.
     */
    public int CountUniqueGeneIDs2(ArrayList<Gene> genes){
       
        Set<Integer> uniqueGeneIDs = new HashSet<>();
        for( Gene gene: genes){
            uniqueGeneIDs.add(gene.getGeneID2());
        }
        int amountUniqueGeneIDs = uniqueGeneIDs.size();
        return amountUniqueGeneIDs;
    }
    
    
    /**
     *
     * @param genes list of genes
     * @return a int with the amount of unique interactions
     * iterates over the ArrayList containing objects "Gene". Every object is 
     * added to a set. determining the size of the set gives the amount of unique interactions.
     */
    public int CountUniqueInteractions(ArrayList<Gene> genes){
        
        Set<String> uniqueInteractions = new HashSet<>();
        for( Gene gene: genes){
            uniqueInteractions.add(gene.getInteractionShortPhrase());
        }
        int amountUniqueGeneIDs = uniqueInteractions.size();
        return amountUniqueGeneIDs;
    }
        
    }
    
   

