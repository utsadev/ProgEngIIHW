
class Instrument {
    public void play() { System.out.println("Instrument!"); }
  }
  
  class Wind extends Instrument {
    public void play() { System.out.println("Wind!"); }
  }
  
  class Brass extends Instrument {
    public void play() { System.out.println("Brass!"); }
  }
  public class Music2 {
    //public static void tune(Wind i) {
    public static void tune(Instrument i) {
      i.play();
    }
    //public static void tune(Brass i) {
    //  i.play();
    //}
    public static void main(String[] args) {
      Wind w = new Wind();
      Brass b = new Brass();
      tune(w);
      tune(b);
    }
  }