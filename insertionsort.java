import java.util.*;
public class insertionsort {
    public static void main(String[] args) {
        int a[]={5,3,1,4,2};
        insertion(a);
        System.out.println(Arrays.toString(a));
    }
    static void insertion(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for (int j = i+1; j >0 ; j--) {
                if(a[j]<a[j-1])
                    swap(a,j,j-1);
                else
                    break;
            }
        }
    }
    static void swap(int[] a,int f,int l)
    {
        int temp=a[f];
        a[f]=a[l];
        a[l]=temp;
    }

}
