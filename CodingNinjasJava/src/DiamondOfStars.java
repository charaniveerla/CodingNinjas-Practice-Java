/*
Code : Diamond of stars
Send Feedback
Print the following pattern for the given number of rows.
Note: N is always odd.
  *
 ***
*****
 ***
  *

Pattern for N = 5

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
  
"""
								    APPROACH FOLLOWED:
   					 			    ------------------
                                    
    1. Split the given pattern into halves (HORIZONTALLY)
    
    Therefore, the resultant 2 patterns we need to build are the following:
    
    (Consider for input=5)
    
    a)	*		  |	b)   ***
       ***		  |	      *
      *****		  |		(lower half)
    (upper half)  |
    
    2. If we can observe the 1st pattern has (n//2)+1 rows and the 2nnd pattern has n//2 rows
    3. First print the top pattern and then go for bottom pattern
    4. Don't confuse by taking left traingle and right traingle in each pattern. 
    5. Go through the code carefully and see the explanation
       you will find the simplest way to print star pattern :)
    
"""
n=int(input())
if(n<=0):
    pass
#if n==0 you need not do anything
else:
    
# PRINTING TOP PATTERN i.e., a)
    
    x=(n//2)+1
    
    # storing (n//2)+1 rows value into some variable say 'x'. Now this x represents no of rows in 1st pattern
    # as there are x rowws in 1st pattern, the range is from 1 to x+1
    for i in range(1,x+1):
        
        # if we can observe there are (x-i) spaces, so the range is from 1 to (x-i)+1
        for j in range(1,(x-i)+1):
            print(" ",end="")
        
        # if we can observe there are (2*i)-1 stars in each ith row, so the range is from 1 to (2*i)
        for j in range(1,(2*i)):
            print("*",end="")
            
        #taking the control to next line 
        print()
        
# PRINTING BOTTOM PATTERN i.e., b)
    y=n//2
    # storing n//2 rows value into some variable say 'y'. Now this 'y' represents no of rows in 2nd pattern
    
    #Think carefully here!
    
    # as we will eliminate 2 stars i.e., one from left end and other from right end
    # to keep track of how many stars we have to print, let us take one counter variable say 'count'
    # now this count will determine how many stars need to be printed in each row
    count=n-2
    
    # as we have y rows in bottom pattern, the range is from 1 to y+1
    for i in range(1,y+1):
        
        # if we can observe there are i spaces in each ith row, so range is from 1 to i+1
        for j in range(1,i+1):
            print(" ",end="")
        
        # printing stars based on the count value
        print("{}".format("*")*count,end="")
        
        # for every row we eleminate 2 stars one from each end, so we decrement counter by 2 after each line
        count-=2
        
        # taking control to next line
        print()  
  
  
  
  
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
