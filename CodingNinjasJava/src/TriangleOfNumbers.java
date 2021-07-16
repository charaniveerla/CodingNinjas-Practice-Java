/*
Code : Triangle of Numbers
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 4
	   1
          232
         34543
        4567654

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
     
 ## Read input as specified in the question.
## Print output as specified in the question.
n=int(input())
if(n<=0):
    pass
	#if n==0 then you need not do anything
else:
    
    """
    Approach followed:
    ------------------
    1. Split the given patterninto 2 halves. i.e., left side traibgle and right side triangle
    2. In left side triangle we have to first print spaces and then the numbers.
    3. In right side traingle we have to print only the number. That's all.
    """
    
    #as there are n rows in the given pattern, the range starts from 1 to n+1
    for i in range(1,n+1):
        
    # In left side traingle
    	# if we can observe there are n-i spaces so teh range is from 1 ti (n-i)+1
        for j in range(1,(n-i)+1):
            print(" ",end="")
        
        # now we have to print the numbers. If we can observe we have i no.of numbers being prnted starting from ith row number to (2*i)-1.
        #So the range is from 1 to (2*i)
        for j in range(i,(2*i)):
            print(j,end="")
            
	# In the right side traingle
    	# if we can observe there are i-1 numbers in each ith row.
        #here the numbers are in descending order. starting from previous j-1 value till it's ith row value
        # so store the prev j-1 value in some variable
        tmp=j-1
        #so range is from tmp to i-1 as we are printing in Descending order
        for j in range(tmp,i-1,-1):
            print(j,end="")
        
        #sending the control to next line
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
