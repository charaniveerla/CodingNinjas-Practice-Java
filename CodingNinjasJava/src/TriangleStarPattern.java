/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****
Note : There are no spaces between the stars (*).
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
*
**
***
****
*****
Sample Input 2:
6
Sample Output 2:
*
**
***
****
*****
******
---------------------
*/
import java.util.*;
public class TriangleStarPattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1; //iterator for rows
        while(i<=n)
        {
            int j=1;
            while(j<=i)//since no of stars to be printed in each line have to be <= corresponding row number
            {
                System.out.print('*');
                j+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
