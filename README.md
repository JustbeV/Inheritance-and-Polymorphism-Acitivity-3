# Inheritance & Polymorphism Example

This Java project demonstrates **inheritance** and **polymorphism** in a simple, beginner-friendly way.

---

## Concepts Demonstrated

- **Inheritance:** `ChildA` and `ChildB` extend `Parent`  
- **Polymorphism:** `Parent` references can hold child objects and call overridden methods  
- **Method overriding:** Each child class provides its own version of `showInfo()`  
- **Child-specific methods:** Demonstrates unique behavior for each child class

---

## class Diagram
        Parent
       + name
       + showInfo()
        /   \
       /     \
   ChildA   ChildB
 + uniqueA  + uniqueB
 + showInfo() override
