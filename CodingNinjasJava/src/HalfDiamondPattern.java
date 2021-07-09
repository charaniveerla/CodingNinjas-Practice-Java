/*
Half Diamond Pattern
Send Feedback
Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*
*/
import java.util.*;
public class Solution {
	
	public static void main(String[] args) {
		// Write your code here
        int n,k,i,j,g,p,h=1;
        Scanner z=new Scanner(System.in);
        n=z.nextInt();
             if(n==0)
            {
                System.out.println("*");
            }
        
            for(k=1;k<=n+1;k++)
            {
            System.out.print("*");
            p=k-1;
            {
            for(i=1;i<=k-1;i++)
                {
                    System.out.print(i);
                }
            for(i=1;i<k-1;i++)
                {
                    p=p-1;
                    System.out.print(p);
                }
            if(k!=1)    
            System.out.print("*");
            }
            System.out.println();
            }
            {
            for(k=1;k<=n;k++)
            {
                g=n-k;
                System.out.print("*");
                for(i=n;i>=k+1;i--)
                {
                   System.out.print(h);
                   h++;
                }
                h=1;
                for(i=n;i>k+1;i--)
                {
                    g=g-1;
                    System.out.print(g);
                }
                
                if(k!=n)
                System.out.print("*");
                System.out.println();
                
            }
          
            }
	}
}
