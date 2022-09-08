/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_exercise1;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author MUON
 */
public class Q1_Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isFinished = false;

        while(!isFinished){
        System.out.println("Welcome to Higher or Lower! Please choose an option\n");
        System.out.println("Start Game\n");
        System.out.println("Change Settings\n");
        System.out.println("End Application\n");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        switch(answer){
        case "Start Game":
            System.out.println("Input test: ");
            String test = sc.nextLine();
            if(test.equals("1")){
                System.out.println("We need to cook Jesse");
            }
        break;
        case "Change Settings":
            System.out.println("Input the lower limit of the number");
            String lower = sc.nextLine();
            System.out.println("Input the upper limit of the number");
            String upper = sc.nextLine();
            System.out.println("How many guesses are allowed?");
            String guess = sc.nextLine();

        break;
        case "End Application":
            System.out.println("Thank you for playing!");
            isFinished = true;
        break;
    }
        }
        /*String name = "Hououin Kyouma";
        int labMember = 1;
        System.out.println(name + "\n" + "Labmember: 00" + labMember);
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String newname = sc.nextLine();*/
    }

}
