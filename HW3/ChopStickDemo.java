class ChopStick{

    //a variable that will store a string value for the object of type ChopStick
    String name; 
    //cs1 and cs2 are objectsof type type ChopStick created and initialized with a given paramter
    private static ChopStick cs1 = new ChopStick("ChopStick1");
    private static ChopStick cs2 = new ChopStick("ChopStick2");
    
    //stores the parameter given to the variable name for the object that it was created
    private ChopStick(String name) {this.name = name;}
    //returns the value of name that is correspsonding the object that is is called from
    public String toString(){return this.name;}
    //calles the toSring function witha specific object variable associated with it
    public static String access1() {return cs1.toString();}
    public static String access2() {return cs2.toString();}

}


public class ChopStickDemo
{   

    public static void main(String [] args)
    {   

        System.out.println(ChopStick.access1()); //prints the name associated with cs1
        System.out.println(ChopStick.access2()); //prints the name associated with cs2

    }

    
}