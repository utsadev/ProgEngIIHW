import java.util.Scanner;

public class hotelABC
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int kingPrice = 100;
        int fullPrice = 80;
        double total = 0;
        

        System.out.println("How many nights will you be staying"
         + "here at Hotel ABC");
        int nights = input.nextInt();

        System.out.println("How many King Size Rooms would you like?");
        int roomsK = input.nextInt();

        System.out.println("How many Double Full-size Rooms would you like?");
        int roomsF = input.nextInt();


        if(nights>3 && (roomsK+roomsF)>3)
        {
            total = .85*(nights*roomsK*kingPrice + nights*roomsF*fullPrice);
        }
        else if(nights>3||(roomsK+roomsF)>3)
        {
            total = .9*(nights*roomsK*kingPrice + nights*roomsF*fullPrice);
        }
        else
        {
            total = (nights*roomsK*kingPrice + nights*roomsF*fullPrice);
        }

        System.out.printf("Your total will be: %.2f", total);

       

        input.close();
    }
}