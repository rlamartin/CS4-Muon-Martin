/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction.to.classes;

/**
 *
 * @author MUON
 */
public class Student {
    String name;
    int id, friendship;
    double grade;
    double money;
    Student bff;
    
    public Student(String name){
        //System.out.println("A new student has enrolled!");
        //upper part used when no String name
        this.name = name; //This is a placeholder. Mark.name, Josh.name. Essentially means that you need name for IntrotoClasses to work
        friendship = 0;
        money = 0;
        grade = 2.00;
        
    }
    
    public void introduce(){
        System.out.printf("Hi my name is %s %n ", name);
    }
    public double getGrade(){
        return grade;
    }
    public void talk(int hours){
        friendship += hours;
    }
}
