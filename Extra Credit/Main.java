/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lou cris
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WaterTank hometank = new WaterTank();
        hometank.setWaterTank("John", 1000);
        
        WaterStation tap = new WaterStation();
        tap.setWaterStation("Tap", 1.5);
        WaterStation mw = new WaterStation();
        mw.setWaterStation("Manila Water", 8);
        WaterStation Maynilad = new WaterStation();
        Maynilad.setWaterStation("Maynilad", 6.5);
        
        Section c1 = new Section();
        Section c2 = new Section();
        
        Teacher t1 = new Teacher();
        t1.addSection(c1);
        t1.addSection(c2);
        Teacher t2 = new Teacher();
        Teacher t3 = new Teacher();
        
        Assignment a1 = new Assignment();
        a1.setTime(2.0);
        Assignment a2 = new Assignment();
        a2.setTime(5.0);
        Assignment a3 = new Assignment();
        a3.setTime(7.0);
        
        
        Student s1 = new Student();
        s1.setName("Juan");
        Student s2 = new Student();
        s2.setName("Juanito");
        Student s3 = new Student();
        s3.setName("Rintaro");
        
t1.giveAssignment(a1);
t2.giveAssignment(a2);
t3.giveAssignment(a3);
s2.finishAssignment(a1);
System.out.printf("%s remaining work: %.2f%n", s1.getName(), s1.getTimeNeeded());
System.out.printf("%s remaining work: %.2f%n", s2.getName(), s2.getTimeNeeded());
System.out.printf("%s remaining work: %.2f%n", s3.getName(), s3.getTimeNeeded());
    }
    
}
