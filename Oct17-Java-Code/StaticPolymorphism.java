//: polymorphism/StaticPolymorphism.java
// Static methods are not polymorphic.

class Animal {
    public static String staticGet() {
      return "Base staticGet()";
    }
    public String dynamicGet() {
      return "Base dynamicGet()";
    }
  }
  
  class Rabbit extends Animal {
    public static String staticGet() {
      return "Derived staticGet()";
    }
    public String dynamicGet() {
      return "Derived dynamicGet()";
    }
  }
  
  public class StaticPolymorphism {
    public static void main(String[] args) {
      Animal a = new Rabbit(); // Upcast
      System.out.println(Animal.staticGet()); //Base staticGet()
      System.out.println(Rabbit.staticGet()); //Derived staticGet()
      System.out.println(a.staticGet()); //Base staticGet()
      System.out.println(a.dynamicGet()); //Derived dynamicGet()
    }
  } /* Output:
  Base staticGet()
  Derived dynamicGet()
  *///:~