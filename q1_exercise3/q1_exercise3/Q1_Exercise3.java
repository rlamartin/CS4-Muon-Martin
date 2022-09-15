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
public class Q1_Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass Num1 = new MyClass();
        Num1.introduce();
        System.out.println(Num1.occupation);
        System.out.println(Num1.age);
        Song newSong = new Song(); 
        newSong.sing();
        newSong.stopSing();
    }
    
}
