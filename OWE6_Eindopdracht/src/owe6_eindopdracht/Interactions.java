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
public class Interactions {
    
    public Set uniqueInteractions(ArrayList<Gene> Genes){
        HashSet<String> uniqueInteractions = new HashSet<>();
        for( Gene gene: Genes){
            uniqueInteractions.add(gene.getInteractionShortPhrase());
        }
        return uniqueInteractions;
    }
}
