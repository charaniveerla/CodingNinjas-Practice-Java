import java.util.*;
public class BoundaryAndDiagonalsSum
{
	public static void totalSum(int[][] arr)
    {
        int boundrySum=0,requiredSum=0,diagonal1Sum=0,diagonal2Sum=0;
        if(arr.length==0)
        {
            System.out.println(requiredSum);
        }
        else
        {
	        int M=arr.length;
    		for (int row = 0; row < M; row++)
    		{
        		for (int col = 0; col < M; col++)
        		{
            		if (row == 0 || col == 0 || row == M - 1 || col == M - 1)
            		{
                		boundrySum = boundrySum + arr[row][col];
            		}
        		}
    		}
    		for (int row = 0; row < M; row++)
    		{
        		for (int col = 0; col < M; col++)
        		{
            		if (row == col)
                		diagonal1Sum = diagonal1Sum + arr[row][col];
	            	else if ((row + col) == (M - 1))
    	            	diagonal2Sum = diagonal2Sum + arr[row][col];
        		}
    		}
    		requiredSum = boundrySum + diagonal1Sum + diagonal2Sum - (arr[0][0] + arr[0][M - 1] + arr[M - 1][0] + arr[M - 1][M - 1]);
    		System.out.println(requiredSum);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows=sc.nextInt();
		System.out.print("Enter no. of cols: ");
		int cols=sc.nextInt();
		int arr[][]=new int [rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print("Enter "+i+"th row's "+j+"th column number: ");
				arr[i][j]=sc.nextInt();
			}
		}
		totalSum(arr);
	}
}
/*
import java.util.*;
public class BoundaryAndDiagonalsSum
{
	public static int[][] readInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows=sc.nextInt();
		System.out.print("Enter no. of cols: ");
		int cols=sc.nextInt();
		int arr[][]=new int [rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print("Enter "+i+"th row's "+j+"th column number: ");
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static int BoundarySum(int input[][])
	{
		int hsum=0;//horizontal boundary sum
		int vsum=0;//vertical boundary sum (i.e) col sum
		int rows=input.length;
		int cols=input[0].length;
		for(int i=0;i<rows;i=i+(rows-1))//row boundaries
		{
			for(int j=0;j<cols;j++)
			{
				hsum+=input[i][j];
			}
		}
		for(int i=0;i<rows;i++)//col boundaries
		{
			for(int j=0;j<cols;j=j+(cols-1))
			{
				vsum+=input[i][j];
			}
		}
		System.out.println("H sum:"+hsum);
		System.out.println("V sum:"+vsum);
		return hsum+vsum;
	}
	public static int DiagonalSum(int input[][])
	{
		int d1sum=0;
		int d2sum=0;
		int rows=input.length;
		int cols=input[0].length;
		for(int i=0;i<rows;i++)
		{
			d1sum+=input[i][i];
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=cols-1;j>=0;j=j-1)
			{
				if(i+j==rows-1)
				{
					d2sum+=input[i][j];
				}
			}
		}
		System.out.println("D1 sum:"+d1sum);
		System.out.println("D2 sum:"+d2sum);
		return d1sum+d2sum;
	}
	public static void main(String[] args)
	{
		int input[][]=readInput();
		int BoundarySumCount=BoundarySum(input);
		int DiagonalSumCount=DiagonalSum(input);
		int midIndex=input.length/2;
		int TotalSumCount=BoundarySumCount+DiagonalSumCount;
		System.out.println("Total sum:"+TotalSumCount);
		if(input.length%2==0)
		{	//no middle element exists
			TotalSumCount=TotalSumCount-((input[0][0]+input[0][input.length-1]+input[input.length-1][0]+input[input.length-1][input.length-1])*2);
		}
		else
		{	//middle element exists
			TotalSumCount=TotalSumCount-(((input[0][0]+input[0][input.length-1]+input[input.length-1][0]+input[input.length-1][input.length-1])*2)+input[midIndex][midIndex]);
		}
		System.out.println(TotalSumCount);
	}	
}
*/