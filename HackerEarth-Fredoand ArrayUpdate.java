/*First line of input consists of an integer N denoting the number of elements in the array A. Second line consists of N space separated integers denoting the array elements.

Output Format:

The only line of output consists of the value of x.

Input Constraints: 1<N<100

1<A[i]<100

explanation:

An initial sum of array is 1+2+3+4+5=15 When we update all elements to 4, the sum of array which is greater than 15 . Note that if we had updated the array elements to 3, which is not greater than 15 . So, 4 is the minimum value to which array elements need to be updated.

*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i ++){
            A[i] = scan.nextInt();
            sum += A[i];
        }
        int avg = sum / N;
        int mini = avg + 1;
        System.out.println(mini);
    }
}
