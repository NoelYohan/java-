/*Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7]*/
public class ShuffletheArray {
    public static void main(String[] args)
    {
        int[] a={2,5,1,3,4,7,8,9};
        int mid=4;
        arrange(a,mid);
    }
    static void arrange(int a[],int ans)
    {
        int[] newArr=new int[2*ans];
        for(int i=0;i<ans;i++){
            newArr[2*i]=a[i];
            newArr[2*i+1]=a[i+ans];
        }
        for (int i = 0; i <newArr.length ; i++) {
            System.out.println(newArr[i]);
        }
    }
}
