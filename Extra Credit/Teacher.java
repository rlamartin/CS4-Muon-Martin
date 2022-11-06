
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lou cris
 */
public class Teacher {
    private String name, subject;
    private static ArrayList<Section> Section = new ArrayList();
    
    public void setName(String name){
        this.name = name;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void addSection(Section s){
        Section.add(s);
    }
    public void giveAssignment(Assignment A){
        
    }
    
    public String getname(){
    return name;
}
    public String getsubject(){
    return subject;
}
}
