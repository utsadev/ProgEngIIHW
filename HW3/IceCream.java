public enum IceCream
{   
    /*creates differenct IceCream Enums named after icecream flavors
    each created a Enumb with a parameter of a number that will be
    stored in a private variable caled size*/
    VANILLA(3), CHOCOLATE(5), STRAWBERRY(1),
    MANGO(2), FUDGE(6), MIXED(100);


    private int size; //private variable that is different for each Enum

    //Stores the paramter given in the Enum to the variable size 
    IceCream(int num) { size = num; } 
    //returns the size of the Enum when called
    int getSize() { return size; }
  

    public static void main(String [] args)
    {
        //goes the all of the Enum and prints the name and the size
        //that is associated with each Enum along with the ordinal it
        //was created with
        for(IceCream d : IceCream.values()) {
            System.out.println(d + ", ordinal: " + d.ordinal() 
              + ", size: " + d.getSize() );
          }
        

    }
}