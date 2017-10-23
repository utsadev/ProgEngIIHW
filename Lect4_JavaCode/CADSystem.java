//: reusing/CADSystem.java
// Ensuring proper cleanup.

class Shape {
    Shape(int i) { System.out.println("Shape constructor"); }
    void dispose() { System.out.println("Shape dispose"); }
  }
  class Circle extends Shape {
    Circle(int i) {
      super(i);
      System.out.println("Drawing Circle");
    }
    void dispose() {
      System.out.println("Erasing Circle");
      super.dispose();
    }
  }
  class Triangle extends Shape {
    Triangle(int i) {
      super(i);
      System.out.println("Drawing Triangle");
    }
    void dispose() {
      System.out.println("Erasing Triangle");
      super.dispose();
    }
  }
  public class CADSystem extends Shape {
    private Circle c;
    private Triangle[] tris = new Triangle[2];
    public CADSystem(int i) {
      super(i + 1);
      for(int j = 0; j < tris.length; j++)
        tris[j] = new Triangle(j);
      c = new Circle(1);
      System.out.println("Combined constructor");
    }
    public void dispose() {
      System.out.println("CADSystem.dispose()");
      c.dispose();
      for(int i = tris.length - 1; i >= 0; i--)
        tris[i].dispose();
      super.dispose();
    }
    public static void main(String[] args) {
      CADSystem x = new CADSystem(47);
      x.dispose();
    }
  } /* Output:
  Shape constructor
  Shape constructor
  Drawing Line: 0, 0
  Shape constructor
  Drawing Line: 1, 1
  Shape constructor
  Drawing Line: 2, 4
  Shape constructor
  Drawing Circle
  Shape constructor
  Drawing Triangle
  Combined constructor
  CADSystem.dispose()
  Erasing Triangle
  Shape dispose
  Erasing Circle
  Shape dispose
  Erasing Line: 2, 4
  Shape dispose
  Erasing Line: 1, 1
  Shape dispose
  Erasing Line: 0, 0
  Shape dispose
  Shape dispose
  *///:~