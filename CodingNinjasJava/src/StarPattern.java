/*
Code : Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4
    
    *
   *** 
  *****
 *******

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

/*
	This is using Python language
	------------------------------
n=int(input())
if(n<=0):
    pass
#you need not do anything if n==0
else:
    """
    Approach followed is:
    1. Firstly, printing spaces from left side
    2. Secondly, printing left half of the triangle with stars
    3. Thirdly, printing right half of the triangle with stars, That's all! 
    """
    #we will be travelling n rows so the range is from 1 to n+1
    for i in range(1,n+1):
        
        # for the 1st n-i positions we have to print spaces so range is from 1 to (n-i)+1
        for j in range(1,(n-i)+1):
            print(" ",end="")
        
        #In the left half of the traingle, if we can observe we need to have i no. of stars to be printed.
        #So the range is from 1 to i+1 i.e., total of i stars are printed on each ith line.
        for j in range(1,i+1):
            print("*",end="")
            
        #Now the right half of the triangle, if we can observe we need to have i-1 no. of stars to be printed.
        #So the range is from 1 to i i.e., total of i-1 stars are printed on each ith line
        for j in range(1,i):
            print("*",end="")
        
        #sending the control back to new line after each ith iteration
        print()
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
