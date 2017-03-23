import java.util.Scanner;

public class Greatest {
public static void main(String args[]){
	int a,b,c;
	System.out.println("Enter value");
	Scanner S = new Scanner (System.in);
	a=S.nextInt();
	b=S.nextInt();
	c=S.nextInt();
	
	if(a>=b && a>=c)
	{
		System.out.println(a);
	}
	if(b>a && b>=c)
	{
		System.out.println(b);
	}
	if(c>b && c>a)
	{
		System.out.println(c);
	}
	
}
}
