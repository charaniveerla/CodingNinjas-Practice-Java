/*
Sum Pattern
Send Feedback
Write a program to print triangle of user defined integers sum.
Input Format :
A single integer, N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6
Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
*/
/*
n=int(input(""))
last="1"
total=1
print(last+"="+str(total))
for i in range(2,n+1):
    last=last+"+{}".format(i)
    total=total+i
    print(last+"="+str(total),end="\n")
*/
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
       int n,j=1,i=1,sum=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    while(n>0)
    {   
    for(j=1;j<=i;j++)
    {
        System.out.print(j);
        if(j!=i)
        {
        System.out.print("+");
        }
       
    }
    sum+=i;
    if((j-1)==i)
    {
    System.out.print("="+sum);
    }
    System.out.println();
    i=i+1;
    n=n-1;
    }
	}
}
