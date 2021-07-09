/*
Code : Triangle of Numbers
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
         232
       34543
     4567654
   567898765
Sample Input 2:
4
Sample Output 2:
           1
         232
       34543
     4567654
     */
     import java.util.*;
public class Solution {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int space=n-1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=space;j++)
                System.out.print(" ");
             
            for(int j=0; j<i; j++)
                System.out.print(j+i);
            for(int j=1;j<i;j++)
                System.out.print(2*i-1-j);
             
            System.out.println();
            space--;
             
        }
	}
}
