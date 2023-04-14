import java.util.Scanner;
public class armstrong {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,r,c;
        int s=0;
        System.out.println("Enter any number");
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s=s+(r*r*r);
        }
        if(s==c)
            System.out.println(c+" is an Armstrong number");
        else
            System.out.println(c+" is not an Armstrong number");
    }
}
