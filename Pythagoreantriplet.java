import java.util.*;
import java.lang.*;
public class Pythagoreantriplet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triplets");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        double s= Math.pow(x,2)+Math.pow(y,2);
        double t=Math.pow(z,2);
        if(s==t)
            System.out.println("The given triplet is a Pythagorean triplet");
        else
            System.out.println("the given triplet is not a Pythagorean triplet");


    }
}
