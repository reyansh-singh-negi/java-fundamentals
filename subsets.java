import java.util.*;
public class subsets {

    static void subset(int n , int i , String str)
    {
        if(i>n)
            System.out.println(str);
        else
        {
            subset(n,i+1,str+i);
            subset(n,i+1,str);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of first natural numbers whose subsets is to be calculated: ");
        int n = sc.nextInt();
        subset(n,1,"");
        sc.close();
    }
}
