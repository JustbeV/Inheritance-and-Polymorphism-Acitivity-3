package src;

public class ChildB extends Parent {
    public ChildB(String name) {
        super(name);
    }

    @Override
    public void showInfo() {
        System.out.println("I am ChildB, inherited from Parent. My name is " + name);
    }

    public void uniqueB() {
        System.out.println("ChildB has a unique method!");
    }
    
}
