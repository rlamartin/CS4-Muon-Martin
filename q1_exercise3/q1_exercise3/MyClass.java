/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_exercise3;

/**
 *
 * @author MUON
 */
public class MyClass {
    String name, occupation;
    int age;
    public MyClass(){
        name = "Hououin Kyouma";
        occupation = "Mad Scientist";
        age = 18;   
    }
    public void introduce(){
        System.out.println("It is I, " + name);
    }
}
