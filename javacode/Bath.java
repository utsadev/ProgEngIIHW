class Soap {
    private String s;
    Soap() { s = "Constructed"; }
    public String toString() { return s; }
  }
  public class Bath {
    private String s1 = "Happy", s2, s3;
    private Soap soap;
    private int i;
    public Bath() {
      s2 = "Joy";
      soap = new Soap();
    }
    { i = 47; } // Instance initialization block
    public String toString() {
        if(s3 == null) // Delayed initialization:
          s3 = "Joy";
        return
          "s1 = " + s1 + "\n" +
          "s2 = " + s2 + "\n" +
          "s3 = " + s3 + "\n" +
          "i = " + i + "\n" + "soap = " + soap;
      }
      public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
      }
    }
     