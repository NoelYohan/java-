public class sample {
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
