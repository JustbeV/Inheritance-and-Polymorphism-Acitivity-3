/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activiy;

/**
 *
 * @author 4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person per=new Person(1.7,60,"Sunso");
        Hunter hunt=new Hunter();
        Worker jan=new Worker();
        
        jan.setAbility("Typing fast and active at work");
        jan.setSalary(101);
        
        
        hunt.setWeapon("Samurai");
        hunt.setSpeed(100);
        
        jan.displayAll();
        hunt.displayAll();
        per.displayAll();
           
    }
    
}
