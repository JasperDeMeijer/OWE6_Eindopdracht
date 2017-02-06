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
 */
public class Interactions {
    private HashMap overlapMap;
    
    public Set uniqueInteractions(ArrayList<Gene> Genes){
        HashSet<String> uniqueInteractions = new HashSet<>();
        for( Gene gene: Genes){
            uniqueInteractions.add(gene.getInteractionShortPhrase());
        }
        return uniqueInteractions;
    }
    
    public HashMap CalculatingOverlap(HashMap map1, HashMap map2){
        (map1.values()).retainAll((map2.values()));
        this.overlapMap = map1;
        return map1;
    }

    public HashMap getCalculatingOverlap() {
        return overlapMap;
    }

    public void setCalculatingOverlap(HashMap map1) {
        this.overlapMap = map1;
    }
    
    
}
