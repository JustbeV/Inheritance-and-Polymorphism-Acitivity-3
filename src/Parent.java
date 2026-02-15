package src;

public class Parent {
    protected String name;

    public Parent(String name) {
        this.name = name;
    }

    // Method to be overridden by children
    public void showInfo() {
        System.out.println("I am a Parent named " + name);
    }
}
