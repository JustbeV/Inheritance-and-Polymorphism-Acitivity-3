package src;

public class Main {
     public static void main(String[] args) {
        // Demonstrating inheritance
        Parent parent = new Parent("Parent1");
        ChildA childA = new ChildA("Alice");
        ChildB childB = new ChildB("Bob");

        System.out.println("=== Direct Calls ===");
        parent.showInfo();
        childA.showInfo();
        childB.showInfo();

        System.out.println("\n=== Polymorphism ===");
        Parent p1 = new ChildA("PollyA");
        Parent p2 = new ChildB("PollyB");

        p1.showInfo(); // Calls ChildA's overridden method
        p2.showInfo(); // Calls ChildB's overridden method

        System.out.println("\n=== Child Unique Methods ===");
        childA.uniqueA();
        childB.uniqueB();
    }
}
