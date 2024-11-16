/*Input: arr[] = {1, 4, 3, 2, 6, 5}  
Output: {5, 6, 2, 3, 4, 1}
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.


Input: arr[] = {4, 5, 1, 2} 
Output: {2, 1, 5, 4}
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on
*/public class sample {
    public static void main(String[] args) {
        int a[]={1, 4, 3, 2, 6, 5};
        int[] b = new int[a.length];
        int c=0;
        for(int i=a.length-1;i>=0;i--){
            b[c]=a[i];
            c++;
        }
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");

    }
}
