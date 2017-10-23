class cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { 
        System.out.println("to string!!");
        return s; }
  
    public static void main(String[] args) {
        System.out.println("2122");
        cleanser x = new cleanser();
        x.apply();
        x.scrub();
        System.out.println(x);
   }
  }
  
  public class Detergent extends cleanser {
        public void scrub() {
          append(" Detergent.scrub()");
          super.scrub(); 
        }
        public void foam() { append(" foam()"); }
        public static void main(String[] args) {
          System.out.println("11111");
          Detergent x = new Detergent();
          x.apply();
          x.scrub();
          x.foam();
          System.out.println(x);
          cleanser.main(args);
        }
      } 