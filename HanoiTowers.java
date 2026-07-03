import java.util.*;
public class HanoiTowers
{
    void Hanoi(int n , String src , String helper , String dest)
    {
        if(n==1)
        {
            System.out.println("Transferred disc "+n+" from "+src+" to "+dest);
            return;
        }

        Hanoi(n-1,src,dest,helper);
        System.out.println("Transferred disc "+n+" from "+src+" to "+dest);
        Hanoi(n-1,helper,src,dest);
    }

    public static void main(String args[])
    {
        HanoiTowers ob = new HanoiTowers();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number of discs you want in the Tower of Hanoi");
        int n = sc1.nextInt();
        ob.Hanoi(n,"Source","Helper","Destination");
        sc1.close();
    }
}