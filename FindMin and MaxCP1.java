/*Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
              Maximum element is: 9


Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
              Maximum element is: 35
*/public class sample {
    public static void main(String[] args) {
        int a[]={22, 14, 8, 17, 35, 3};
        int min=a[0];
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min)
                min=a[i];
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("Minimum element is: "+min);
        System.out.println("Maximum element is: "+max);
    }
}
