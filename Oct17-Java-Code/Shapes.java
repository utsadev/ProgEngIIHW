class Shape {
    void draw() {}
    void erase() {}
  }
  class Circle extends Shape {
    void draw() {System.out.println("Draw Circle!");}
    void erase() {System.out.println("Erase Circle!");}
  }
  class Square extends Shape {
    void draw() {System.out.println("Draw Square!");}
    void erase() {System.out.println("Erase Square!");}
  }
  class Triangle extends Shape {
    void draw() {System.out.println("Draw Triangle!");}
    void erase() {System.out.println("Erase Triangle!");}
  }
  public class Shapes {
    public static void main(String[] args) {
      Shape[] sa = {new Circle(), 
        new Square(), new Triangle()};
      for (Shape s : sa) 
        s.draw();
      for (Shape s : sa) 
        s.erase();
    }
  }