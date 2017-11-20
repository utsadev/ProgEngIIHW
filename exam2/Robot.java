interface Mover {
    
      default String whoAmI() {
    
        return "I am a mover";
    
      }
    
    }
    
    class Flyer {
    
      public String whoAmI() {
    
        return "I am a flyer";
    
      }
    
    }
    
    public class Robot extends Flyer implements Mover {
    
      public static void main(String[] args) {
    
        Robot r = new Robot();
    
        System.out.println(r.whoAmI());
    
      }
    
    }