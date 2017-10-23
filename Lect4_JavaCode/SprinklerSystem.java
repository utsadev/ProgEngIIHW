package wind;

class WaterSource {
	  private String s;
	  WaterSource() {
	    System.out.println("WaterSource()");
	    s = "Constructed";
	  }
	  public String toString() { return s; }
	}
public class SprinklerSystem {
	  private String valve1, valve2, valve3;
	  private WaterSource source = new WaterSource();
	  public String toString() {
	    return
	      "valve1 = " + valve1 + "\n" +
	      "valve2 = " + valve2 + "\n" +
	      "valve3 = " + valve3 + "\n" +
	      "source = " + source;
	  }
	  public static void main(String[] args) {
	    SprinklerSystem sprinklers = new SprinklerSystem();
	    System.out.println(sprinklers);
	  }
	}
