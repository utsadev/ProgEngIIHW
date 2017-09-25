import java.util.Scanner;

public class question3
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in a number.");
        int oddNum = input.nextInt();
        int i = 1;

        if(oddNum<=0)
        {
            System.out.println("Error: you have entered a 0 or negative number"
            + " please try again with a integer greater than 0");
            System.exit(1);
        }

        System.out.println("While loop");
        while(oddNum+1!=i)
        {
            if(i%2==0)
            {   
                i++;
                continue;
            }
                
            else
            {
                System.out.println(i);
                i++;
            }
            
        }
        

        System.out.println("Now same thing but with four loops");

        for(i=0;i!=oddNum+1;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            else
            {
                System.out.println(i);
            }
        }
     
        
        input.close();
    }
}