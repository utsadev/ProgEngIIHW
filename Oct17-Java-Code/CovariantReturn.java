//: polymorphism/Sandwich.java
// Order of constructor calls.

class Bread {
    Bread() { System.out.println("Bread()"); }
  }
  class Cheese {
    Cheese() { System.out.println("Cheese()"); }
  }
  class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
  }
  
  class Meal {
    Meal() { System.out.println("Meal()"); }
  }
  class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
  }
  public class Sandwich extends Lunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich() { System.out.println("Sandwich()"); }
    public static void main(String[] args) {
      new Sandwich();
    }
  } /* Output:
  Meal()
  Lunch()
  Bread()
  Cheese()
  Lettuce()
  Sandwich()
  *///:~