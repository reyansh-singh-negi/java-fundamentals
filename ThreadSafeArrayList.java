import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class ThreadSafeArrayList {
    public static void main(String args[])
    {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("Yo");

        for(String item : list)
        {
            System.out.println(item);
            if(item.equals("Hello"))
            {
                list.add(2,"Heya");
            System.out.println("Here we will add the element , but it will not appear just yet... after the loop reference is changed and we will get the modified array list");
        }
    }
        System.out.println(list);
    }   
}
