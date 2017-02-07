/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owe6_eindopdracht;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jdm
 * class for defining unique interactions and the overlapping genes between interactions.
 */
public class Interactions {
    private HashMap overlapMap;
    
    /**
     *
     * @param Genes
     * @return A set with unique interactions
     * Iterates over a list with objects "Gene". every interactions is added to a set.
     * returns the set, containing only the unique interactions.
     */
    public Set uniqueInteractions(ArrayList<Gene> Genes){
        HashSet<String> uniqueInteractions = new HashSet<>();
        for( Gene gene: Genes){
            uniqueInteractions.add(gene.getInteractionShortPhrase());
        }
        return uniqueInteractions;
    }
    
    /**
     *
     * @param map1
     * @param map2
     * @return Hashmap containing the overlapping geneID's
     * Uses retainall to remove every gene id that is not in map1 compared to map2
     * returns a Hashmap containing only the geneID's that are present in both hashmaps
     */
    public HashMap CalculatingOverlap(HashMap map1, HashMap map2){
        (map1.values()).retainAll((map2.values()));
        this.overlapMap = map1;
        return map1;
    }

    /**
     *
     * @return
     */
    public HashMap getCalculatingOverlap() {
        return overlapMap;
    }

    /**
     *
     * @param map1
     */
    public void setCalculatingOverlap(HashMap map1) {
        this.overlapMap = map1;
    }
    
    
}
