import java.util.*;
public class PerfectPair
{
	public static void main(String args[] ) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int size[]=new int[t];
        int i=0;
        while(t>0)
        {
            size[i]=sc.nextInt();
            int arr[]=new int[size[i]];
            int pairSum=0;
            for(int j=0;j<arr.length;j++)
            {
                arr[j]=sc.nextInt();
            }
            for(int j=0;j<arr.length-1;j++)
            {
            	for(int k=j+1;k<arr.length;k++)
            	{
            		pairSum=arr[j]+arr[k];
            		if(isSquare(pairSum))
            		{
            			//its a square
            		}
            		else if(isCube(pairSum))
            		{
            			//its a cube
            		}
            	}
            }
        }
    }
	public static int isSquare(pairSum)
	{
		Math.sqrt(pairSum)
    }
    public static int isCube(pairSum)
    {
    	
 