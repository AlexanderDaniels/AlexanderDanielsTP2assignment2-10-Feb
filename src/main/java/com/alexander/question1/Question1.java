package com.alexander.question1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Alex
 */
public class Question1 {
   
    List<String> dupList = new ArrayList<String>();
    Set<String> nonDupList = new HashSet<String>();
    
    public List<String> addingAndDeletingOfDup()
    {
        dupList.add("Gino");
        dupList.add("Rush");
        dupList.add("Lucky");
        dupList.add("Duke");
        dupList.add("Gino");
        dupList.add("Rush");
        dupList.add("Lucky");
        dupList.add("Duke");      
        return dupList;
                
    }
    
    public List<String> printDupList()
    {
        System.out.println("-----------------Duplicate List-----------------");
        System.out.printf("First names: ");
        
        for (String fName : dupList){
            System.out.printf("%s ",fName);
        }
        
        System.out.println();
        System.out.println("\n");
        return dupList;
    }
    
    public Set<String> printNonDupList()
    {
        System.out.println("-----------------Non Duplicate List-----------------");
        System.out.printf("First names: ");
        
        for (String fName : dupList){
            nonDupList.add(fName);            
        }
        
        for (String fName : nonDupList){
            System.out.printf("%s ",fName);            
        }        
        
        System.out.println();
        System.out.println("\n");
        return nonDupList;
    }
    
    public String uInput()
    {
        System.out.println("-----------------User Input-----------------");
        Scanner input = new Scanner(System.in);
        String nme = "";
        System.out.printf("Please Enter in the name you are looking for: ");
        nme = input.nextLine();
        System.out.println();
        System.out.println("\n");
        return nme;
    }
    
    public boolean searchFName(String fNameFound, List<String> nonDupList)
    {
        System.out.println("-----------------Searching for name in list-----------------");
        for(String fName : nonDupList){
            if(fNameFound.equals(fName)){
                System.out.println(fNameFound +" was found.");
                return true;
            }
        } return false;
        
    }
}