/*Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]*/
import java.util.*;
public class CreateTargetArrayintheGivenOrder {
    public static void main(String[] args)
    {
        int[] nums={0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int size=nums.length;
        int[] tr=new int[size];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<size;i++) {
            list.add(index[i], nums[i]);
        }
        for(int i=0;i<size;i++) {
            tr[i] = list.get(i);
        }
        for(int i=0;i<size;i++) {
            System.out.println(tr[i]);
        }

    }
}
