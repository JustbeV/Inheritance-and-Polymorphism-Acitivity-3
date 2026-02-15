package src;

public class ChildA extends Parent {
    public ChildA(String name) {
        super(name);
    }

    @Override
    public void showInfo() {
        System.out.println("I am ChildA, inherited from Parent. My name is " + name);
    }

    public void uniqueA() {
        System.out.println("ChildA has a unique method!");
    }
}
