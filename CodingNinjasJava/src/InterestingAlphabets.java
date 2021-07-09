/*Code : Interesting Alphabets
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
*/
import java.util.*;
public class Solution{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
       //
        int p=(char)(65+(n-1));//ascii of E is 69 i.e. 1st row has 65+(n-1)th char 
        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print((char)p);
            	j+=1;
                p+=1;
            }
            System.out.println();
            i+=1;
            p=(65+(n-i));
        }
    }
}
/*
import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		int i,j,n;
 		Scanner sc = new Scanner(System.in);
 		n=sc.nextInt();
        for(i=n;i>=1;i--)
    	{
        	for(j=i;j<=n;j++)
        	{ 		
    			System.out.print((char)(j+64));
    		} 
    		System.out.println("");
        }
	}
}
*/
