//: innerclasses/Parcel11.java
// Nested classes (static inner classes).
interface Destination {
    String readLabel();
  }
  public class Parcel11 {
    protected static class PDestination
    implements Destination {
      private String label;
      private PDestination(String whereTo) {
        label = whereTo;
      }
      public String readLabel() { return label; }	
      // Nested classes can contain other static elements:
      public static void f() {}
      static int x = 10;
      static class AnotherLevel {
        public static void f() {}
        static int x = 10;
      }
    }
    public static Destination destination(String s) {
      return new PDestination(s);
    }
    public static void main(String[] args) {
      Destination d = destination("UTSA");
    }
  } ///:~