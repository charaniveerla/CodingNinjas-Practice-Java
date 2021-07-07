import java.util.*;
public class SpiralPrint
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
		spiralPrint(arr);
	}
	public static void spiralPrint(int[][] arr)
    {
        if(arr.length==0)
        {
            System.out.println();
        }
        else
        { 
			int row=arr.length;
			int col=arr[0].length;
			int count=0;
			int rs=0,re=row-1,cs=0,ce=col-1;
            //rs=> row start, re=> row end, cs=>col start, ce=>col end
			while(count<row*col)
            {
				for(int i=cs;i<=ce;i++)
                {
					System.out.print(arr[rs][i]+" ");
					count++;
				}
				rs++;
				for(int i=rs;i<=re;i++)
                {
					System.out.print(arr[i][ce]+" ");
					count++;
				}
				ce--;
				for(int i=ce;i>=cs;i--)
                {
					System.out.print(arr[re][i]+" ");
					count++;
				}
				re--;
				for(int i=re;i>=rs;i--)
                {
					System.out.print(arr[i][cs]+" ");
					count++;
				}
				cs++;
			}
        }
	}
}