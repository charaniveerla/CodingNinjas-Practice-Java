/*
Code : Inverted Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
55555 
4444
333
22
1
Sample Input 2:
6
Sample Output 2:
666666
55555 
4444
333
22
1

CODE IN PYTHON:
--------------

n=int(input())
if(n==0):
    pass
# if n==0 you need not do anything
else:
    
    """
    Approach followed:
    ------------------
    1. If we can observe there are n rows, so we put the range to iterate the rows from 1 to n+1
    2. Now On each row the value that is being printed is nothing but (n-i)+1
    3. This value is being printed for (n-i)+1 times
    """
    for i in range(1,n+1):
        print("{}".format((n-i)+1)*((n-i)+1))
	
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
            
            for(int j=n;j>=i;j--)
            {
                System.out.print(n+1-i);
            }
            
            System.out.println();
        }
		
	}

}
