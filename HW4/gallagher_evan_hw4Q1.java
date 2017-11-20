import java.util.*;
import java.util.LinkedList;
import java.util.LinkedList;

public class gallagher_evan_hw4Q1
{
    public static void main(String [] args)
    {
        String [] names = {"Nick", "Susan", "Chet", "Dolly", "Bill"};
        List<String> listName = new ArrayList<String>();

        for (String name : names)
            listName.add(name);

        System.out.println(listName);
        listName.remove("Susan");
        listName.remove("Chet");
        listName.add("Ellie");
        listName.add("Beatrice");
        listName.add("Charles");
        listName.remove("Bill");
        listName.add("Lewis");
        listName.add("Izzy");
        listName.remove("Nick");

        List<String> reverse = new ArrayList<String>();
        int i = -1;
        /*for (String name : listName)
        {
            reverse[j] = name;
            i--;
        }*/

        System.out.println(listName);

    }
}