
public class Bicycle {
    public int cadence; public int gear; 
    public int speed;
    public Bicycle(int sc, int ss, int sg) {
          gear = sg;  cadence = sc; speed = ss;
    }
    public void setCadence(int nv) { cadence = nv; }
    public void setGear(int nv) { gear = nv; }
    public void applyBrake(int decrement) 
      { speed -= decrement; }
    public void speedUp(int increment) 
      { speed += increment; }
    
     
    

    public static void main(String[] args) {

        //Bicyle bike = new MountainBike(1, 2, 3, 4);
        MountainBike mybi = new MountainBike(1, 2, 3, 4);
        mybi.applyBrake(2);
        System.out.println("speed:" + mybi.speed );

    }
  
}
