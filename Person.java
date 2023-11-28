/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activiy;

/**
 *
 * @author 4
 */
//my super class
public class Person {
    
    private double height ;
    private double weight;
    private String name;
    
    public Person(){
        
    }
    public Person(double height,double weight,String name){
        this.height=height;
        this.weight=weight;
        this.name=name;
    }
    //my getter
    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
    
    //my setter
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void displayAll(){
        System.out.println("The height is: "+height+"m");
        System.out.println("The weight is: "+weight+"kg");
        System.out.println("The name is:"+ name);
    }
    
    public final void somethingFinal(){
        
        System.out.println("This is final!");
    }
    
}
