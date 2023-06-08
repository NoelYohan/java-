
import java.util.*;
public class binarysearch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a={2,4,6,8,10,12};
        System.out.println("Enter target value");
        int target=sc.nextInt();
        int ans= bin(a,target);
        System.out.println("Target found at index "+ans);

    }
    static int bin(int[] a,int target)
    {
       int s=0,e=a.length;
       while(s<=e) {
           int mid = s + (e - s)/2;
           if (a[mid] > target)
               e = mid - 1;
           else if (a[mid] < target)
               s = mid + 1;
           else
               return mid;
       }
        return -1;
    }
}
