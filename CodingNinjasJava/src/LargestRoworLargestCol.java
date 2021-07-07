import java.util.Scanner;
public class LargestRoworLargestCol
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
	public static int maxRowSum(int input[][],int maxIndex[])
	{
		int rowMax=0;
		for(int i=0;i<input.length;i++)//rows
		{
			int rowSum=0;
			for(int j=0;j<input[0].length;j++)//cols
			{
				rowSum=rowSum+input[i][j];
			}
			if(rowSum>rowMax)
			{
				rowMax=rowSum;
				maxIndex[0]=i;
			}
		}
		return rowMax;
	}
	public static int maxColSum(int input[][],int maxIndex[])
	{
		int colMax=0;
		for(int i=0;i<input[0].length;i++)
		{
			int colSum=0;
			for(int j=0;j<input.length;j++)
			{
				colSum=colSum+input[j][i];
			}
			if(colSum>colMax)
			{
				colMax=colSum;
				maxIndex[1]=i;
			}
		}
		return colMax;
	}
	public static void main(String args[])
	{
		int input[][]=readInput();
		int maxIndex[]=new int[2];//consists maxRowIndex at 0th position and maxColIndex at 1st position
		int finalRowMax=maxRowSum(input,maxIndex);
		int finalColMax=maxColSum(input,maxIndex);
		if(finalRowMax>=finalColMax)
		{
			System.out.println("row "+maxIndex[0]+" "+finalRowMax);
		}
		else if(finalColMax>finalRowMax)
		{
			System.out.println("column "+maxIndex[1]+" "+finalColMax);
		}
	}
}
