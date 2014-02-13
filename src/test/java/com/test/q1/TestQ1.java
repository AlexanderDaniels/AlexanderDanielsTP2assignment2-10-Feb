/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.q1;

import com.alexander.question1.Question1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import junit.framework.Assert.*;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alex
 */
public class TestQ1 {
    
    public TestQ1() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void readingOfNamesAndDeletionOfDuplication() {
        Question1 q1 = new Question1();     
        q1.addingAndDeletingOfDup();
        
        Assert.assertNotSame(q1.printDupList(), q1.printNonDupList(), "");
        
       
        
    }
    @Test(dependsOnMethods = "readingOfNamesAndDeletionOfDuplication")
    public void searchAndFind(){
        Question1 q1 = new Question1();    
        List<String> stud;
        stud = new Question1().addingAndDeletingOfDup();
        q1.addingAndDeletingOfDup();
        String fName = q1.uInput();
        boolean a = q1.searchFName(fName, stud);
        
        assertTrue(a);
        
        
        
    }
            
    
    
    
    

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}