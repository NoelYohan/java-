import java.util.*;
class sample{
    static  int find(int[]arr,int m)
    {
        int n=arr.length;
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;

        for(int i=0;i+m-1<n;i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < mindiff)
                mindiff = diff;
        }
        return mindiff;
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m=5;
        System.out.println(find(arr,m));
        }
    }
