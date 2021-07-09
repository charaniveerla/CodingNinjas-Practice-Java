/*
Code : Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
 */
 import java.util.Scanner;
public class Solution {


	public static void main(String[] args) 
    {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        int n,i=1;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        while(i<=n)
        { 
            int j=1;
            while(j<=n-i)
            {
                System.out.print(' ');
                j=j+1;
            }
            int k=1;
            while(k<=i)
            {
                System.out.print('*');
                k=k+1;
            }
            int dec=i-1;
            while(dec>=1)
            {
                System.out.print('*');
                dec=dec-1;
            }
            System.out.println();
            i=i+1;
        }

		
	}

}
