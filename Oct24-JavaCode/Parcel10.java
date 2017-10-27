//: innerclasses/Parcel10.java
// Using "instance initialization" to perform
// construction on an anonymous inner class.
abstract class Destination {
    Destination(int x) {}
    abstract String readLabel();
  }
  public class Parcel10 {
    public Destination
    destination(final String dest, int price) {
      return new Destination(price) {
        private int cost;
        {
          cost = price;
          if(cost > 100)
            System.out.println("Over budget!");
        }
        private String label = dest;
        public String readLabel() { return label; }
      };
    }	
    public static void main(String[] args) {
      Parcel10 p = new Parcel10();
      Destination d = p.destination("UTSA", 101);
    }
  } /* Output:
  Over budget!
  *///:~