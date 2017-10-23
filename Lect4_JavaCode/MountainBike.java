

public class MountainBike extends Bicycle {
    // the subclass adds one field
    public int seatHeight;

    public MountainBike(int sh, int sc,
    int ss, int sg) {
        super(sc, ss, sg);
        seatHeight = sh;
    }
    // the subclass adds one method
    public void setHeight(int nv) 
      { seatHeight = nv; } 
}