import java.util.Scanner;

public class numbers
{

    public static int addition(int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }

    public static int subtract(int num1, int num2)
    {
        int sub = num1 - num2;

        return sub;
    }

    public static int division(int num1, int num2)
    {
        int div = num1/num2;

        return div;
    }

    public static int multiplication(int num1, int num2)
    {
        int mult = num1 * num2;

        return mult;
    }

    public static void main(String [] args)
    {
        int num1 = 0;
        int num2 = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a single number");
        num1 = input.nextInt();
        System.out.println("Please enter another number");
        num2 = input.nextInt();

        System.out.printf("%d plus %d = %d \n", num1, num2, addition(num1, num2));
        System.out.printf("%d subtract %d = %d \n", num1, num2, subtract(num1, num2));
        System.out.printf("%d divided by %d = %d \n", num1, num2, division(num1, num2));
        System.out.printf("%d multiplied %d = %d \n", num1, num2, multiplication(num1, num2));


        input.close();
    }
}