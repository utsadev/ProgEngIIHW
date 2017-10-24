class ChopStick{

    String name;
    private static ChopStick cs1 = new ChopStick("ChopStick1");
    private static ChopStick cs2 = new ChopStick("ChopStick2");
    
    public ChopStick(String name) {this.name = name;}
    public String toString(){return this.name;}
    public static String access1() {return cs1.toString();}
    public static String access2() {return cs2.toString();}

}


public class ChopStickDemo
{   
    /*public String access(){
        return access1();
    }*/


    public static void main(String [] args)
    {   
        //ChopStick myChop = new ChopStick("s");
        //System.out.println(myChop.toString());
        System.out.println(ChopStick.access1());
        System.out.println(ChopStick.access2());
        //System.out.println(ChopStick.access1());
        
    }

    
}