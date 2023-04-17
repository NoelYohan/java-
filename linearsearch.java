import java.util.*;
public class linearsearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[30];
        System.out.println("enter array limit");
        int n = sc.nextInt();
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int t = sc.nextInt();
        int x = linear(a, t, n);
        if(x==-1)
            System.out.println(t+" Element not found");
        else
            System.out.println(t+" Element found at index "+x);
    }

    static int linear(int[] ar, int tar, int n)
    {
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] == tar) {
                a = 1;
                return i;
            }
        }
            if (a == 0)
                return -1;
          return -1;
    }
}