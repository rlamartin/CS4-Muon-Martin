/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2_exercise7;

/**
 *
 * @author lou cris
 */
public class FireType extends Monster {
    public FireType(String n, int m, int base){
        
        super(n,"fire","grass","water",m, base);
        atk = (int) Math.floor(base * 1.3); 
        def = (int) Math.floor(base * .7); 
        
        
    }//end of constructor
    
    @Override
    public void special(){
        
        if (hp > hp*0.1){
            hp = (int) (maxHP - Math.floor(hp*0.10));
            atk += 2;
            System.out.println(name + " did a pose and increased its defense at the cost of its HP!");
        }
        else{
            System.out.println(name + " failed to do a pose! His HP cannot go any lower");
        }
    }
}
