import java.util.*;
public class ColWiseSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows=sc.nextInt();
		System.out.print("Enter no. of cols: ");
		int cols=sc.nextInt();
		int arr[][]=new int [rows][cols];
		for (int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print("Enter "+i+"th row's "+j+"th column number:");
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<cols;i++)
		{
			int sum=0;
			for(int j=0;j<rows;j++)
			{
				sum=sum+arr[j][i];
			}
			System.out.print(sum+" ");
		}
	}
}
