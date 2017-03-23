import java.util.Scanner;

public class Prime {
int n;
int flag=0;
	public void takeInput()
	{
		System.out.println("Enter any number you want to know whether prime or not: ");
		Scanner read= new Scanner(System.in);
		n= read.nextInt();
		
	}
	
	void check()
	{
		for(int i=2; i<n;i++)
		{
			if(n%i==0||n==0||n==1)
			{
				System.out.println("Not A Prime Number");
				flag=1;
				break;
			}
		}
			
		
		 if(flag==0)
			{
				System.out.println("Prime Number");
				
			}
			
		
			
		}
	
	
	public static void main(String[] args) {
		Prime p= new Prime();
		p.takeInput();
		p.check();
	}

}
