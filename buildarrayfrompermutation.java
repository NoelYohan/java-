/*Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]*/
import java.util.*;
public class buildarrayfrompermutation {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter array limit");
        int n=sc.nextInt();
        int[] a =new int[30];
        System.out.println("Enter "+n+" number of elements");
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[a[i]]+"\t");
        }
    }
}
