public enum IceCream
{
    VANILLA(3), CHOCOLATE(5), STRAWBERRY(1),
    MANGO(2), FUDGE(6), MIXED(100);


    private int size;
    IceCream(int num) { size = num; }
  
    void sizeNum(int num) { size = num; }
    int sizeNum() { return size; }
  

    public static void main(String [] args)
    {


        for(IceCream d : IceCream.values()) {
            System.out.println(d + ", ordinal: " + d.ordinal() 
              + ", size: " + d.sizeNum());
          }
        

    }
}