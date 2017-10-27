//: innerclasses/TestParcel.java
interface Contents {
    int value();
  }
  interface Destination {
    String readLabel();
  }
  class Parcel4 {
    private class PContents implements Contents {
      private int i = 11;
      public int value() { return i; }
    }
    protected class PDestination implements Destination {
      private String label;
      private PDestination(String whereTo) {
        label = whereTo;
      }
      public String readLabel() { return label; }
    }
    public Destination destination(String s) {
      return new PDestination(s);
    }
    public Contents contents() {
      return new PContents();
    }
  }
  
  public class TestParcel {
    public static void main(String[] args) {
      Parcel4 p = new Parcel4();
      // Illegal -- can't access private class:
      //! Parcel4.PContents pc = p.new PContents();
      Contents c = p.contents();
      Destination d = p.destination("UTSA");
    }
  } ///:~