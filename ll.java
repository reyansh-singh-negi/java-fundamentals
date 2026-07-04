import java.util.*;


class ll
{
   public static void main(String args[]) {
       LinkedList<String> list = new LinkedList<String>();
       list.add("Hi");
       list.add("I");
       list.addLast("Reyansh");
       list.addFirst("Hello... ");
       list.add(3, "am");
       System.out.println(list);


       System.out.println(list.get(0));
       System.out.println(list.size());   
       list.remove(0);
       list.removeFirst();
       list.removeLast();
      
       System.out.println(list);
   }
}

