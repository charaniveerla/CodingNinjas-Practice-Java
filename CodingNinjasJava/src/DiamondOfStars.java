/*
Code : Diamond of stars
Send Feedback
Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5



The dots represent spaces.



Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *
  
  */
  import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        //int n,k,i,j,g,p,h=1;
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int top=n/2+1,bottom=(n/2);
        
            for(int i=1;i<=top;i++)
            {
                for(int j=1;j<=top-i;j++)
                {
                    System.out.print(" ");
                }
                
                for(int j=1;j<=2*i-1;j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
        	for(int i=top-1;i>=0;i--)
            {
                for(int j=1;j<=top-i;j++)
                {
                    System.out.print(" ");
                }
                
                for(int j=1;j<=2*i-1;j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
	}
}
