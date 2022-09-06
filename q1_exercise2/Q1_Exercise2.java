/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_exercise2;

import java.util.Scanner;
import java.lang.Math;  

/**
 *
 * @author MUON
 */
public class Q1_Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Welcome to Higher or Lower! Please choose an option\n");
        System.out.println("Start Game\n");
        System.out.println("Change Settings\n");
        System.out.println("End Application\n");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        switch(answer){
        case "Start Game":
            
        break;
        case "Change Settings":
            
        break;
        case "End Application":
            System.out.println("Thank you for playing!");
        break;
    }
        /*String name = "Hououin Kyouma";
        int labMember = 1;
        System.out.println(name + "\n" + "Labmember: 00" + labMember);
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String newname = sc.nextLine();*/
    }

}
