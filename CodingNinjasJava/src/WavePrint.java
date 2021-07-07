import java.util.*;
public class WavePrint
{
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
		wavePrint(arr);
	}
	public static void wavePrint(int mat[][])
    {	        
        int rows = mat.length;
        int cols = 0;
        if(rows!=0)
        {
            cols = mat[0].length;
        }
        for(int i = 0; i<cols; i++)
        {
            if (i%2==0)
            {
            	for(int j = 0; j<rows; j++)
                {
                	System.out.print(mat[j][i] + " ");
            	}
            }
            else
            {
                for(int j=rows-1;j>=0;j--)
                {
                    System.out.print(mat[j][i] + " ");
                }
            }       
        }
	}
}
