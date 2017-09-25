import java.util.Scanner;
public class birthStone
{
    public static void main(String [] args)
    {
       /*Scanner input = new Scanner (System.in);
        System.out.print("Which month were you born \n Type integer as 1~12\n");
        int month = input.nextInt();

        switch(month)
        {
            case 1:
                System.out.printf("Your brith stone is %s", "Garnet");
                break;
            case 2:
                System.out.printf("Your brith stone is %s", "Amethyst");
                break;
            default:
                System.out.printf("I don't know your birthstone");
                
            }

        input.close();*/

       Scanner input = new Scanner (System.in);

       System.out.println("Gibve me a student's numerical/int grade");

        double grade = input.nextInt();

        int studentNo = 0;
        int total = 0;
        while(grade != -1)
       {
           total += grade;
           studentNo++;
           System.out.println("If you want to quit the program type -1\n"
           + "otherwise type a new grade");
           grade = input.nextDouble();
       }

       double ave = total/studentNo;
       System.out.printf("The ave grade of %d students is: %.2f", studentNo, ave );
       
       input.close();
    }
}