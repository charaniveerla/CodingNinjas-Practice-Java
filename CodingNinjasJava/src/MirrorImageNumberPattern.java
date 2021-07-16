/*Code : Mirror Image Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4




The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
3
Sample Output 1:
      1 
    12
  123
Sample Input 2:
4
Sample Output 2:
      1 
    12
  123
1234

CODE IN PYTHON:
-------------
n=int(input())
if(n<=0):
    pass
#if n==0 you need not do anything
else:
    """
    
    Approach followed:
    -------------------
    1. first print spaces and then go for numbers that are to be printed
    
    """
    #as there are n rows the range is from 1 to n+1
    for i in range(1,n+1):
        
        #we have to print spaces first. If we can observe there are n-i spaces. So range is from 1 to (n-i)+1
        for j in range(1,(n-i)+1):
            print(" ",end="")
            
        #now we have to print the numbers. In each ith row we have i numbers to be printed. So the range is from 1 to i+1    
        for j in range(1,i+1):
            print(j,end="")
        
        #taking the control to next line
        print()
        

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
        for(int i=1; i<=n; i++)
        {
            
            for(int j=n;j>i;j--)
            {
                System.out.print(' ');
            }
            for(int k=1;k<=i;k++)
            {
               System.out.print(k); 
            }
            System.out.println();
        }
		
	}

}
