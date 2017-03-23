import java.util.Scanner;

public class Value {
	public static void main(String args[]){
		int a,f;
		String Name,Gender;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter your Name");
		Name = S.next();
		System.out.println("Enter your Gender");
		Gender = S.next();
		System.out.println("How many times you want to print your name");
		a = S.nextInt();
		if(Gender.equalsIgnoreCase("Male"))
		{
			while(a>0)
			{
			System.out.println("You are a male and your name is" + Name);
			a--;
			}
		}
			else if(Gender.equalsIgnoreCase("Female"))
			{
				while(a>0)
				{
				System.out.println("You are a female and your name is" + Name);
				a--;
				}
			}
			else
			{
				System.out.println("Please enter correct gender");
			}
		
		
	}

}
