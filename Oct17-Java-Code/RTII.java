//: polymorphism/RTTI.java
// Downcasting & Runtime type information (RTTI).
// {ThrowsException}

class Base {
    public void f() {}
    public void g() {}
  }
  class Derived extends Base {
    public void f() {}
    public void g() {}
    public void u() {}
  }	
  public class RTTI {
    public static void main(String[] args) {
      Base[] x = {new Base(), new Derived()};
      x[0].f();
      x[1].g();
      // Compile time: method not found in Useful:
      //! x[1].u();
      ((Derived)x[1]).u(); // Downcast/RTTI
      ((Derived)x[0]).u(); // Exception thrown
    }
  } ///:~