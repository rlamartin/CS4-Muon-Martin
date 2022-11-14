/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q2_Exercise6;

/**
 *
 * @author lou cris
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FireType Hot = new FireType("HotBoy", 15, 20);
        GrassType Grassie = new GrassType("Grassie",15,18 );
        WaterType Walter = new WaterType("Walter", 15, 20);
        
        
        
        System.out.println("Grassie versus HotBoy");
       /* Monster.battle(Grassie,Hot);
        Hot.resetHealth();
        Grassie.resetHealth();
        
        System.out.println("HotBoy versus Walter");
        Monster.battle(Hot,Walter);
        Hot.resetHealth();
        Walter.resetHealth();*/
        
        System.out.println("Walter versus Grassie");
        Monster.battle(Walter,Grassie);
        
        Grassie.resetHealth();
        Walter.resetHealth();
        
        
    }
    
}
