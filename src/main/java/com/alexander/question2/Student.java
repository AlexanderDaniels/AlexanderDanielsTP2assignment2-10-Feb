/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedList;
import java.util.Objects;
/**
 * 
 * @author Alex
 */
public class Student {

    private String firstName;
    private String lastName;
    private String studentNumber;
    private String phoneNumber;
    
    ArrayList<Student> list = new ArrayList<Student>();
    Set<Student> nonDupList = new HashSet<Student>();
    Map<String,Student> studentMap = new HashMap<String,Student>();
    
    public Student(String firstName, String lastName, String studentNumber, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    public ArrayList<Student> stud()
{
    
    list.add( new Student("Alex","Daniels","210100000","0743219845") );
    list.add( new Student("Gino","Stack","210111111","0836894687") );
    list.add( new Student("Duke","Roit","210122222","0213546589") );
    list.add( new Student("Alan","Legendary","210133333","0763218465") );
    list.add( new Student("Jake","Hanky","210144444","0826841257") );
    list.add( new Student("Jack","Tony","210155555","0613549165") );
    list.add( new Student("Iron","man","210166666","0531468987") );
    list.add( new Student("Coll","Moss","210177777","0218649355") );
    list.add( new Student("Kolo","Toure","210188888","0727645381") );
    list.add( new Student("Algo","Cole","210199999","0321159753") );
        return list;
    
}
    
    public ArrayList<Student> dispStud(){
    System.out.println("-----------Printing of the 10 Student objects------------");
    for(Student fName : list){
            System.out.println(fName);
        }
    
    return list;
    }
    
    public List<Student> duplicateStud(){
    System.out.println("-----------Printing of the 20 Student objects(Dulpication)------------");
    
    Student[] studs = new Student[10];
    List<Student> copyList = new LinkedList<Student>(Arrays.asList(studs));
    
    Collections.copy(copyList, list);
    copyList.addAll(list);
    
    for(Student element : copyList){
        System.out.printf("%s ", element);
        System.out.println();
    }
    
    
    for (Student fName : copyList){
            nonDupList.add(fName);            
        }
        return copyList;
         }
    
    public Set<Student> unduplication(){
        System.out.println("-----------Printing of the Student objects(UnDulpication)------------");
        for (Student fName : nonDupList){
            System.out.printf("%s ",fName);    
            System.out.println();
        }      
        return nonDupList;
    }
    
    public Map<String,Student> createPhoneBook(Map<String, Student> studentMap, Set<Student> nonDupList){
        
        for (Student stud : nonDupList){
            studentMap.put(stud.getPhoneNumber(), stud);
        }        
        return studentMap;
    }
    
    public boolean searchStudent(Map<String, Student> studentMap, String a){
        
        boolean choice = false;
        
        if (studentMap.containsKey(a)){
        
            System.out.println("Record found");
            choice = true;
        }
        else{
            
            System.out.println("No Record found");            
        }        
        return choice;
    }  
    
    
        public void displaySearch(String choice, Map<String, Student> studentMap){
        
        if (studentMap.containsKey(choice)){ 
            System.out.println("-----------------User Details-----------------");
            System.out.println("Student found:");
            System.out.println("Student Name:" + studentMap.get(choice).getFirstName());
            System.out.println("Student Last Name:" + studentMap.get(choice).getLastName());
            System.out.println("Student Number:" + studentMap.get(choice).getStudentNumber());
            System.out.println("Student Phone Number:" + studentMap.get(choice).getPhoneNumber());
        }
        else{
            Runtime.getRuntime().exit(0);
        }
        
}
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.firstName);
        hash = 61 * hash + Objects.hashCode(this.lastName);
        hash = 61 * hash + Objects.hashCode(this.studentNumber);
        hash = 61 * hash + Objects.hashCode(this.phoneNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.studentNumber, other.studentNumber)) {
            return false;
        }
        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student: " + "firstName = " + this.firstName + ", lastName = " + this.lastName + ", studentNumber = " + this.studentNumber + ", phoneNumber = " + this.phoneNumber;
    }   
}
