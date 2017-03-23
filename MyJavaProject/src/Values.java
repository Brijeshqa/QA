import java.util.Scanner;

public class Values {
	
	public static void main(String[] args)
	{
		int x,y;
		String Name;
		System.out.println("Your name is");
		Scanner S = new Scanner (System.in);
		Name=S.next();
		System.out.println("");
		System.out.println("Enter value of x");
		x=S.nextInt();
		System.out.println("");
		System.out.println("Enter value of y");
		y=S.nextInt();
		System.out.println("");
		System.out.print("Your name is " + Name + " and you have entered " + x+ " and " + y);
		
	}

}
