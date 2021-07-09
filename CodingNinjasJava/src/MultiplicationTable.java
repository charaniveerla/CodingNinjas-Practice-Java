import java.util.*;
public class MultiplicationTable
{
	public static void main(String[] args)
    {
        int mul=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            mul=n*i;
            System.out.println(mul);
        }
	}
}
