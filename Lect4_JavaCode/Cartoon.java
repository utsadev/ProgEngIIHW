class Art {
    Art() { System.out.println("Art!"); }
  }
  class Drawing extends Art {
    Drawing() { System.out.println("Drawing!"); }
  }
  public class Cartoon extends Drawing {
    public Cartoon() { 
      System.out.println("Cartoon!"); 
    }
    public static void main(String[] args) {
      Cartoon newCartoon = new Cartoon();
      System.out.println();
    }
  }