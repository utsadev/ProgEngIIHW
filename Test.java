import java.util.Scanner;
public class Test 
{
    public static void main(String [] args)
    {
        int [] myArray = {1,2,3,4};
        int [][] myArray2d = {
                            {1,2,3,4},
                            {5,6,7,8} 
                            };

        System.out.print("Hello \n");
        System.out.println("Print Line");
        System.out.printf("Hello there %d", 5);
        System.out.printf("pi = %.1f", 3.14);
        System.out.println("");
        

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine(); // type name and press enter
        System.out.println("Welcome " +  name + " to Java World!");

        for(int i=0;i<myArray.length;i++)
        {
            System.out.println(myArray[i]);
        }

        System.out.println("---------------------------");
        for(int i=0;i<myArray2d.length;i++)
        {
            for(int j=0;j<myArray2d[i].length;j++)
            {
                System.out.println(myArray2d[i][j]);
            }
        }

        input.close();
        
    }

}