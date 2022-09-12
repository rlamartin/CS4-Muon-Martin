/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction.to.classes;

/**
 *
 * @author MUON
 */
public class IntroductionToClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student mark = new Student("Mark");
        mark.introduce();
        mark.grade = 1.25;
        
        Student josh = new Student("Josh");

        josh.introduce();
        
        mark.bff = josh;
        System.out.println(mark.bff.grade);
        //double g1 = mark.getGrade();
        
        /*josh.name = "josh";
        josh.grade = 1.50;
        josh.money = 5000.00;*/
    }
    
}
