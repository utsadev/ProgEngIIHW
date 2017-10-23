//: reusing/FinalData.java
// The effect of final on fields.
import java.util.*;

class Value {
  int i;
  public Value(int i) { this.i = i; }
}

public class FinalData {
  private static Random rand = new Random(47);
  private String id;
  public FinalData(String id) { this.id = id; }
  // Can be compile-time constants:
  private final int fOne = 9;
  private static final int F_TWO = 99;
  private final int fThree = rand.nextInt(20); //15,18,13,12,...
  static final int F_FOUR = rand.nextInt(20);
  public String toString() {
    return id + ": " + "fThree = " + fThree + ", F_FOUR = " + F_FOUR;
  }

  private Value v1 = new Value(11);
  private final Value v2 = new Value(22);
  private static final Value VAL_3 = new Value(33);
  private final int[] a = { 1, 2, 3 };

  public static void main(String[] args) {
    FinalData fd1 = new FinalData("fd1");
    //! fd1.fOne++; // Error: can't change value
    FinalData fd2 = new FinalData("fd2");
    System.out.println(fd1);
    System.out.println(fd2);

    fd1.v1 = new Value(9); // OK -- not final
    //! fd1.v2 = new Value(0); // Error: Can't
    fd1.v2.i++; // Object isn't constant!
    //! fd1.VAL_3 = new Value(1); // change reference
    //! fd1.a = new int[3];
    for(int i = 0; i < fd1.a.length; i++)
      fd1.a[i]++; // Object isn't constant!
  }
} /* Output:
fd1: i4 = 15, INT_5 = 18
Creating new FinalData
fd1: i4 = 15, INT_5 = 18
fd2: i4 = 13, INT_5 = 18
*///:~