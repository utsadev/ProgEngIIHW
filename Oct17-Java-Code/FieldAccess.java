//: polymorphism/FieldAccess.java
// Direct field access is determined at compile time.

class Base {
    public int field = 0;
    public int getField() { return field; }
  }
  
  class Derived extends Base {
    public int field = 1;
    public int getField() { return field; }
    public int getSuperField() { return super.field; }
  }
  
  public class FieldAccess {
    public static void main(String[] args) {
      Base b = new Derived();
      System.out.println(b.field); //0
      System.out.println(b.getField()); //1
      Derived d = new Derived();
      System.out.println(d.field); //1
      System.out.println(d.getField()); //1
      System.out.println(d.getSuperField()); //0
    }
  } /* Output:
  sup.field = 0, sup.getField() = 1
  sub.field = 1, sub.getField() = 1, sub.getSuperField() = 0
  *///:~