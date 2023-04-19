/*Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.*/

import java.sql.SQLOutput;
import java.util.*;
public class RichestCustomerWealth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a={
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println("person with max wealth has sum of money of "+wealth(a));
    }
    static int wealth(int[][] a){
          int max=Integer.MIN_VALUE;
          int s=0;
        for (int p = 0; p <3 ; p++) {
            s=0;
            for (int m = 0; m < 2; m++) {
               s=s+a[p][m];
                if(s>max)
                   max=s;
            }
            System.out.println((p+1)+"st customer has wealth = "+s);
        }
        return max;
    }
}
