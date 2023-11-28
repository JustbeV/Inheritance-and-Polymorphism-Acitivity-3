/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activiy;

/**
 *
 * @author 4
 */
//my 2 subclass
public class Worker {
    
    private int salary;
    private String ability;
    
    public Worker(){
        super();
        this.salary=salary;
    }
    public Worker(double height,double weight,String name,int salary,String ability){
        
    }
    public int getSalary() {
        return salary;
    }

    public String getAbility() {
        return ability;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
    public void displayAll(){
        System.out.println("The salary is: "+salary+"$");
        System.out.println("his ability is: "+ ability);
    }
    
}
