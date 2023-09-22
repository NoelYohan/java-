import java.util.*;
public class selectionsort {
    public static void main(String[] args)
    {
        int a[]={5,7,2,4,9,};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    static void sort(int[] a)
    {
        for (int i = 0; i <a.length ; i++) {
               int last=a.length-i-1;
               int max = findmax(a,0,last);
               swap(a,max,last);

        }
    }
    static int findmax(int[] a,int f, int l)
    {
        int max=f;
        for (int i = f; i <l ; i++) {
            if(a[max]<a[i])
                max=i;
        }
        return max;
    }
    static void swap(int[] a,int f,int l)
    {
        int temp=a[f];
        a[f]=a[l];
        a[l]=temp;
    }
}
