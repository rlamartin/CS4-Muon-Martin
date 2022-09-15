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
public class Song {
    String name;
    boolean sing = false;
    public Song(){
        name = "City of Tears";
    }
    public void sing(){
        System.out.println(name + " is being sung");
        sing = true;
    }
    public void stopSing(){
        System.out.println(name + " has been stopped");
        sing = false;
    }
}
