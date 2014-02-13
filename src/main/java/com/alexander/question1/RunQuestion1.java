package com.alexander.question1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class RunQuestion1 {
     public static void main(String[] args) {
         Question1 q1 = new Question1();
    
         q1.addingAndDeletingOfDup();
         q1.printDupList();
         q1.printNonDupList();
         String fName = q1.uInput();
        /* if(!q1.searchFName(fName)){
             System.out.println("Sorry, but the name " + fName + " was not found in the list.");
         }*/
     }
    
}
