import java.util.*;
import java.lang.*;
public class Power
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int result = (int)Math.pow(x,n);
		System.out.println(result);
    }
}
