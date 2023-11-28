/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activiy;

/**
 *
 * @author 4
 */
//My 1 subclass
public class Hunter {
    
    private String weapon;
    private int speed;
    
    public Hunter(){
        super();
        this.weapon=weapon;
        this.speed=speed;
    }
    public Hunter(double height,double weight,String name,int weapon,int speed){
        
    }
    public String getWeapon() {
        return weapon;
    }

    public int getSpeed() {
        return speed;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void displayAll(){
        System.out.println("the name of the weapon is: "+weapon);
        System.out.println("His speed if he's going to attack: "+speed+" km");
    }
    
}
