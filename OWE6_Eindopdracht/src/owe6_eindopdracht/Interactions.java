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
    private int uniqueMap1Size;
    private int uniqueMap2Size;
    
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
     * To compensate for the difference in retaining over the maps, both maps are retained.
     * The amount of unique geneId's per Hashmap = (the original map x) - (corresponding retainall)
     * 
     */
    public HashMap CalculatingOverlap(HashMap map1, HashMap map2){
        HashMap tempo = map1;
        
        (map1.values()).retainAll((map2.values()));
        (map2.values()).retainAll((tempo.values()));
        this.uniqueMap1Size = map1.size();
        this.uniqueMap2Size = map2.size();
        if(uniqueMap1Size >= uniqueMap2Size){
            this.overlapMap = map1;
        }else{
            this.overlapMap = map2;
        }
        return overlapMap;
        
        
    }
    
    
    
    public int getUniqueMap1Size(){
        return uniqueMap1Size;
    }
    
    public int getUniqueMap2Size(){
        return uniqueMap2Size;
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
