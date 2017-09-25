import java.util.Scanner;

public class CheckerBoard
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in a number");
        int n = input.nextInt();


        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n;col++)
            {
                if(row%2==0)
                {
                    System.out.print("# ");
                }
                else
                {
                    System.out.print(" #");
                }

                if(col==n-1)
                {
                    System.out.print("\n");
                }
            }
        }
    
    
        input.close();
    }
}