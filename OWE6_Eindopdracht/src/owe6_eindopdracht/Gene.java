/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owe6_eindopdracht;

/**
 *
 * @author jdm
 */
public class Gene {
    //Start of variable declaration
    private int taxID1;
    private int geneID1;
    private String productAccessionVersion1;
    private String productName1;
    private String interactionShortPhrase;
    private int taxID2;
    private int geneID2;
    private String productAccessionVersion2;
    private String productName2;
    private String pubMedID;
    private String lastUpdate;
    private String geneRIFText;
    //End of variable declaration
    
    Gene(int taxID1, int geneID1, String productAccessionVersion1, String interactionShortPhrase,
         int taxID2, int geneID2, String productAccessionVersion2, String productName2, String pubMedID, 
         String lastUpdate, String GeneRIFText){
        this.taxID1 = taxID1;
        this.geneID1 = geneID1;
        this.productAccessionVersion1 = productAccessionVersion1;
        this.interactionShortPhrase = interactionShortPhrase;
        this.taxID2 = taxID2;
        this.geneID2 = geneID2;
        this.productAccessionVersion2 = productAccessionVersion2;
        this.productName2 = productName2;
        this.pubMedID = pubMedID;
        this.lastUpdate = lastUpdate;
        this.geneRIFText = GeneRIFText;
        
        
    }
    Gene(int taxID1){
        this.taxID1 = taxID1;
    }

    
    
    //Start of setters
    public void setTaxID1(int taxID1) {
        this.taxID1 = taxID1;
    }

    public void setGeneID1(int geneID1) {
        this.geneID1 = geneID1;
    }

    public void setProductAccessionVersion1(String productAccessionVersion1) {
        this.productAccessionVersion1 = productAccessionVersion1;
    }

    public void setProductName1(String productName1) {
        this.productName1 = productName1;
    }

    public void setInteractionShortPhrase(String interactionShortPhrase) {
        this.interactionShortPhrase = interactionShortPhrase;
    }

    public void setTaxID2(int taxID2) {
        this.taxID2 = taxID2;
    }

    public void setGeneID2(int geneID2) {
        this.geneID2 = geneID2;
    }

    public void setProductAccessionVersion2(String productAccessionVersion2) {
        this.productAccessionVersion2 = productAccessionVersion2;
    }

    public void setProductName2(String productName2) {
        this.productName2 = productName2;
    }

    public void setPubMedID(String pubMedID) {
        this.pubMedID = pubMedID;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setGeneRIFText(String geneRIFText) {
        this.geneRIFText = geneRIFText;
    }
    //End of setters
    //Start of getters
    public int getTaxID1() {
        return taxID1;
    }

    public int getGeneID1() {
        return geneID1;
    }

    public String getProductAccessionVersion1() {
        return productAccessionVersion1;
    }

    public String getProductName1() {
        return productName1;
    }

    public String getInteractionShortPhrase() {
        return interactionShortPhrase;
    }

    public int getTaxID2() {
        return taxID2;
    }

    public int getGeneID2() {
        return geneID2;
    }

    public String getProductAccessionVersion2() {
        return productAccessionVersion2;
    }

    public String getProductName2() {
        return productName2;
    }

    public String getPubMedID() {
        return pubMedID;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public String getGeneRIFText() {
        return geneRIFText;
    }
    //End of getters
    
}