/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.q2;

import com.alexander.question2.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
public class TestQ2 {
    
    public TestQ2() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void readingOfNamesAndDisplayOfDuplication() {
        Student q2 = new Student(null, null, null, null);
        q2.stud();
        assertNotSame(q2.dispStud(), q2.duplicateStud());        
    }
    
    @Test(dependsOnMethods = "readingOfNamesAndDisplayOfDuplication")
    public void readingOfNamesAndDeletionOfDuplication() {
        Student q2 = new Student(null, null, null, null);
        q2.stud();
        assertNotSame(q2.duplicateStud(),q2.unduplication());
    }
    
    @Test(dependsOnMethods = "readingOfNamesAndDeletionOfDuplication")
    public void inputAndSearch(){
        Student q2 = new Student(null, null, null, null);
        Set<Student> nonDupList = q2.unduplication();
        Map<String,Student> studentMap = q2.createPhoneBook(q2.studentMap, nonDupList);
        boolean choice = q2.searchStudent(studentMap, "0743219845");
        assertEquals(choice, true);
        
        if (choice){
            q2.displaySearch("0743219845", studentMap);
        }
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