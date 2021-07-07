import java.util.*;
//import java.util.Stack;
public class Cylinders
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int sum1=0,sum2=0,sum3=0;
		Stack<Integer> stk1=new Stack<Integer>();
		Stack<Integer> stk2=new Stack<Integer>();
		Stack<Integer> stk3=new Stack<Integer>();
		for(int i=0;i<n1;i++)
		{
			int j=sc.nextInt();
			stk1.push(j);
			sum1=sum1+j;
		}
		for(int i=0;i<n2;i++)
		{
			int j=sc.nextInt();
			stk2.push(j);
			sum2=sum2+j;
		}
		for(int i=0;i<n3;i++)
		{
			int j=sc.nextInt();
			stk3.push(j);
			sum3=sum3+j;
		}
		while(sum1!=sum2||sum2!=sum3)
		{
			if(sum1>sum2 && sum1>sum3)
			{
				int p=stk1.get(0);
				stk1.removeElementAt(0);
				sum1=sum1-p;
			}
			if(sum2>sum1 && sum2>sum3)
			{
				int p=stk2.get(0);
				stk2.removeElementAt(0);
				sum2=sum2-p;
			}
			if(sum3>sum1 && sum3>sum2)
			{
				int p=stk3.get(0);
				stk3.removeElementAt(0);
				sum3=sum3-p;
			}
		}
		System.out.println(sum1);
	}
}
