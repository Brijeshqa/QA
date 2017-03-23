import java.util.Scanner;

public class Input {
	
	public static void main(String[] args)
	{
		int x,y;
		String Name;
		System.out.println("Enter a value for x");
		Scanner S = new Scanner(System.in);
		x= S.nextInt();
		System.out.println("Enter a value for y");
		y = S.nextInt();
		System.out.println("ENter your name");
		Name = S.next();
		System.out.println(x);
		System.out.println(y);
		System.out.println(Name);
	}

}
