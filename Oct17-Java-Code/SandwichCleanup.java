//: polymorphism/Sandwich.java
// Order of constructor calls.

class Bread {
    Bread() { System.out.println("Bread()"); }
    void dispose() {System.out.println("dispose Bread!");}
  }
  class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
    void dispose() {System.out.println("dispose Lettuce!");}
  }
  
  class Meal {
    Meal() { System.out.println("Meal()"); }
    void dispose() {System.out.println("dispose Meal!");}
  }
  class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
    void dispose() {
      System.out.println("dispose Lunch!");
      super.dispose();
    }
  }
  public class SandwichCleanup extends Lunch {
    private Bread b = new Bread();
    private Lettuce l = new Lettuce();
    public SandwichCleanup() { System.out.println("Sandwich()"); }
    void dispose() {
      System.out.println("dispose Sandwich!");
      b.dispose();
      l.dispose();
      super.dispose();
    }
    public static void main(String[] args) {
      SandwichCleanup s = new SandwichCleanup();
      s.dispose();
    }
  } /* Output:
  Meal()
  Lunch()
  Bread()
  Cheese()
  Lettuce()
  Sandwich()
  *///:~