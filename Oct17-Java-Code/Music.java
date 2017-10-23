
class Instrument {
    public void play() { System.out.println("Instrument!"); }
  }
  
  class Wind extends Instrument {
    public void play() { System.out.println("Wind!"); }
  }
  
  public class Music {
    public static void tune(Instrument i) {
      i.play();
    }
    public static void main(String[] args) {
      Wind w = new Wind();
      tune(w);
    }
  }