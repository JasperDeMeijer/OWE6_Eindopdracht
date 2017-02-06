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
    
    public int CountUniqueGeneIDs1(ArrayList<Gene> genes){
       
        Set<Integer> uniqueGeneIDs = new HashSet<>();
        for( Gene gene: genes){
            uniqueGeneIDs.add(gene.getGeneID1());
        }
        int amountUniqueGeneIDs = uniqueGeneIDs.size();
        return amountUniqueGeneIDs;
    }
    
    
    public int CountUniqueGeneIDs2(ArrayList<Gene> genes){
       
        Set<Integer> uniqueGeneIDs = new HashSet<>();
        for( Gene gene: genes){
            uniqueGeneIDs.add(gene.getGeneID2());
        }
        int amountUniqueGeneIDs = uniqueGeneIDs.size();
        return amountUniqueGeneIDs;
    }
    
    public int CountUniqueInteractions(ArrayList<Gene> genes){
        
        Set<String> uniqueInteractions = new HashSet<>();
        for( Gene gene: genes){
            uniqueInteractions.add(gene.getInteractionShortPhrase());
        }
        int amountUniqueGeneIDs = uniqueInteractions.size();
        return amountUniqueGeneIDs;
    }
        
    }
    
   

