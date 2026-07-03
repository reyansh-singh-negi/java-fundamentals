public class maze2 {

    int k = 0;

    void paths(int i , int j)
    {
        if(i==3 || j==3)
        {
            return;
        }
        if(i==2 && j==2)
        {
            ++k;
            return;
        }

        paths(i+1,j);
        paths(i,j+1);
    }
    public static void main(String[] args) {
        maze2 ob = new maze2();
    ob.paths(0,0);
    System.out.println("Total paths are : " + ob.k);
}
}