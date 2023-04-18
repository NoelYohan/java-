/*Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/
import java.util.*;
public class RunningSumof1dArray {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter array limit");
         int n=sc.nextInt();
         int [] a=new int[10];
         int[] b=new int[10];
         System.out.println("Enter array elements");
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         int s=0;
         b[0]=a[0];
         for(int r=1;r<n;r++)
         {
             s=0;
             for(int c=0;c<=r;c++)
             {
                 s=s+a[c];

             }
             b[r]=s;
         }
         for (int i = 0; i <n ; i++) {
             System.out.println(b[i]);
         }

     }
}

