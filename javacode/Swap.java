

public class Swap
{
    public static void main(String [] args)
    {
        int []n = {1, 2, 3};
        int i = 1;
        int tmp = n[i - 1];
        n[i - 1] = n[i];
        n[i] = tmp;
        
        
        for(i = 0; i<n.length; i++){
            System.out.println(n[i]);
        }
    
    
    }
}