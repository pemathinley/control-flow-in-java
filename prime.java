import java.util.*;
public class prime
{
	public static void main(String[] x)
	{
		

		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int flag=0;
		for(int i=2 ; i<=n/2 ; i++)
		{
			if(n%i==0)
				{
					flag=1;
				}			
		}
			if(flag==0)
				{
				 System.out.println("prime");
				}
			else
			{
			 System.out.println("not prime");
			}
	}

}
			
	

 
     
	
     