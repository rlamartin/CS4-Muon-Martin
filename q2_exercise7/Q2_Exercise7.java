/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q2_exercise7;

/**
 *
 * @author lou cris
 */
public class Q2_Exercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Location Akihabara = new Location("Akihabara", "Electronics");
        Trainer Red = new Trainer("Red", Akihabara);
        WaterType Walter = new WaterType("Walter", 15, 20);
        NPC Weedman = new NPC("Weedman", Akihabara, "Let's find Hououin Kyouma");
        
        Red.inspect(Walter);
        Red.inspect(Weedman);
        Red.inspect(Akihabara);
        
    }
    
}
