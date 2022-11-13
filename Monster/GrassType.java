/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Monster;

/**
 *
 * @author lou cris
 */
public class GrassType extends Monster {
    private int truemaxHP;
    public GrassType(String n, int m, int base){
        super(n,"grass","water","fire",m, base);
        truemaxHP = maxHP;
    }
    @Override
    public void rest(){
        hp = (int) (hp + (maxHP * 0.5));
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }
    public void special(){
        
        if (maxHP >= (int)(truemaxHP * 2.5)){
            System.out.println(name + " failed his pose and he fell! His Max HP has reached its limit!");
        }
        else { 
            maxHP = (int) (maxHP + (truemaxHP * 0.2));
            System.out.println(name + " did a pose and increased its maximum HP! Its Max HP now is " + maxHP);
        }
    }
}
