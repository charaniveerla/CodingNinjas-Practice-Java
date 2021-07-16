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
							PYTHON CODE:
							-----------
"""
APPROACH FOLLOWED:
-----------------
1. Basic observation is the complete pattern has to be inside of stars. i.e., top line and bottom line.
2. This top and bottom lines contains only 1 star.
3. Divide the complete pattern into 2 halves (HORIZONTALLY)
4. So there will be n rows in the 1st top pattern and n-1 rows in 2nd bottom pattern
5. Each pattern's nes line starts with a star symbol 
6. After star, the numbers must be printed in ascending order and then in decreasing order, finally a star has to be printed
7. Now follow the code and comments carefully, to get clear picture about how are we doing! :)
"""
n=int(input())
if(n<=0):
    #handling base cases
    print("*\n*")
else:
    
    #top line of the pattern
    print("*")
    
    #in the 1st pattern there are n rows so, the range is from 1 to n+1
    for i in range(1,n+1):
        
        #for every ith row, the ith row has to start with a star
        print("*",end="")
        
        #now we have to print numbers on each ith row till i value, so the range is from 1 to i+1
        for j in range(1,i+1):
            print(j,end="")
        
        #Once the j value crosses ith row value then, decrement j by one and proceed in printing descending order of vslues till you 1
        j=j-1
        
        #printing in descending order
        while(j>0):
            print(j,end="")
            j-=1
        
        # print star symbol at the end of each line
        print("*",end="\n")
        
    # now print bottom pattern
    # there are n-1 rows in the bottom pattern, so the range is from 1 to n
    for i in range(1,n):
        
        #printing star at the starting position of each ith row
        print("*",end="")
        
        #we have to print 1 to (n-i) value in ascending order, so range is from 1 to (n-i)+1
        for j in range(1,(n-i)+1):
            print(j,end="")
        
        #once the j value crosses i, decrement j by one
        j-=1
        
        #print numbers from j in descending order till 1
        while(j>0):
            print(j,end="")
            j-=1
        
        #printing star at the end of each line
        print("*",end="\n")
    
    #bottom line
    print("*")
    

*/
import java.util.*;
public class Solution {
	
	public static void main(String[] args) {
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
