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
public class Gene implements Comparable<Gene> {
    //Start of variable declaration
    private static int counter;
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
    
    Gene(int taxID1, int geneID1, String productAccessionVersion1, String productName1, String interactionShortPhrase, 
         int taxID2, int geneID2, String productAccessionVersion2, String productName2, String pubMedID, 
         String lastUpdate, String GeneRIFText){
        this.productName1 = productName1;
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
        counter++;
        
        
        
    }
    
    Gene(){
        
    }
   
    
    /**
     * @param compareID
     * @return 
     * compareTo override to sort the genelist on GeneID1. 
     */
    @Override
    public int compareTo(Gene compareID){
        int compare = compareID.getGeneID1() - this.getGeneID1();
        return compare;
    }
    
    /**
     *
     */
    protected void CounterReset (){
        counter = 0;
    }
    //Start of setters

    /**
     *
     * @param taxID1
     */
    public void setTaxID1(int taxID1) {
        this.taxID1 = taxID1;
    }

    /**
     *
     * @param geneID1
     */
    public void setGeneID1(int geneID1) {
        this.geneID1 = geneID1;
    }

    /**
     *
     * @param productAccessionVersion1
     */
    public void setProductAccessionVersion1(String productAccessionVersion1) {
        this.productAccessionVersion1 = productAccessionVersion1;
    }

    /**
     *
     * @param productName1
     */
    public void setProductName1(String productName1) {
        this.productName1 = productName1;
    }

    /**
     *
     * @param interactionShortPhrase
     */
    public void setInteractionShortPhrase(String interactionShortPhrase) {
        this.interactionShortPhrase = interactionShortPhrase;
    }

    /**
     *
     * @param taxID2
     */
    public void setTaxID2(int taxID2) {
        this.taxID2 = taxID2;
    }

    /**
     *
     * @param geneID2
     */
    public void setGeneID2(int geneID2) {
        this.geneID2 = geneID2;
    }

    /**
     *
     * @param productAccessionVersion2
     */
    public void setProductAccessionVersion2(String productAccessionVersion2) {
        this.productAccessionVersion2 = productAccessionVersion2;
    }

    /**
     *
     * @param productName2
     */
    public void setProductName2(String productName2) {
        this.productName2 = productName2;
    }

    /**
     *
     * @param pubMedID
     */
    public void setPubMedID(String pubMedID) {
        this.pubMedID = pubMedID;
    }

    /**
     *
     * @param lastUpdate
     */
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     *
     * @param geneRIFText
     */
    public void setGeneRIFText(String geneRIFText) {
        this.geneRIFText = geneRIFText;
    }

    /**
     *
     * @param counter
     */
    public static void setCounter(int counter) {
        Gene.counter = counter;
    }
    
    
    //End of setters
    //Start of getters

    /**
     *
     * @return
     */
    public int getTaxID1() {
        return taxID1;
    }

    /**
     *
     * @return
     */
    public int getGeneID1() {
        return geneID1;
    }

    /**
     *
     * @return
     */
    public String getProductAccessionVersion1() {
        return productAccessionVersion1;
    }

    /**
     *
     * @return
     */
    public String getProductName1() {
        return productName1;
    }

    /**
     *
     * @return
     */
    public String getInteractionShortPhrase() {
        return interactionShortPhrase;
    }

    /**
     *
     * @return
     */
    public int getTaxID2() {
        return taxID2;
    }

    /**
     *
     * @return
     */
    public int getGeneID2() {
        return geneID2;
    }

    /**
     *
     * @return
     */
    public String getProductAccessionVersion2() {
        return productAccessionVersion2;
    }

    /**
     *
     * @return
     */
    public String getProductName2() {
        return productName2;
    }

    /**
     *
     * @return
     */
    public String getPubMedID() {
        return pubMedID;
    }

    /**
     *
     * @return
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     *
     * @return
     */
    public String getGeneRIFText() {
        return geneRIFText;
    }

    /**
     *
     * @return
     */
    public static int getCounter() {
        return counter;
    }
    //End of getters
    
}