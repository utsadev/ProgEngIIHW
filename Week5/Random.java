import java.security.SecureRandom;

public class Random
{
    public static void main(String []args)
    {
        SecureRandom rand = new SecureRandom();
        int num = 2*rand.nextInt(3)+2;
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
    }
}