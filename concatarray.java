import java.util.*;
public class concatarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of two arrays");
        int n=sc.nextInt();
        int[] a1=new int[10];
        int[] a2=new int[10];
        int [] s=new int [30];
        System.out.println("Enter two arrays");
        System.out.println("Enter array 1");
        for (int i = 0; i <n ; i++)
        {
            a1[i]=sc.nextInt();
            s[i]=a1[i];
        }
        System.out.println("enter array 2");
        for (int i = 0; i <n ; i++)
        {
            a2[i]=sc.nextInt();
            s[n+i]=a2[i];
        }
        System.out.println("concatenated array = ");
        for (int i = 0; i <(n+n) ; i++) {
            System.out.print(s[i]+" ");
        }

    }
}

