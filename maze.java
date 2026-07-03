import java.util.Scanner;
public class maze {

    int count = 0;
    int dest_i;
    int dest_j;

    void paths(int i , int j ,int n , int m)
    {
        if(i==n || j==m)
        {
            return;
        }
        if(i==dest_i && j==dest_j)
        {
            ++count;
            return;
        }

        paths(i+1,j,n,m);
        paths(i,j+1,n,m);
    }
    public static void main(String[] args) {
    maze ob = new maze();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns : ");
    int n = sc.nextInt();
    int m = sc.nextInt();

    System.out.println("Enter the destination indices");
    ob.dest_i = sc.nextInt();
    ob.dest_j = sc.nextInt();
    ob.paths(0,0 ,n,m);
    System.out.println("Total paths are : " + ob.count);
    sc.close();
}
}