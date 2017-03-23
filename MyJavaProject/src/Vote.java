import java.util.Scanner;

public class Vote 

{
	int z,DOB,YOB,f;
	String gender;
	
	public void calc()
	 {	
	Scanner S = new Scanner (System.in);
	System.out.println("Enter your Year of birth");
	YOB = S.nextInt();
	if (YOB<=1999&&f==0)
	  {
		System.out.println("Please move to male counter");
	  }
	else if (YOB<=1999&&f==1)
	   {
		System.out.println("Please move to Female counter");
	    }
	else
	{
		System.out.println("You are not eligible for voting");
	}
	 }
	
	public void age()
	{
		Scanner S = new Scanner (System.in);
		System.out.println("Enter your year of birth");
		DOB = S.nextInt();
		if(DOB<=1999)
			{
				System.out.println("You are eligible for voting");
			}
		else
			{
				System.out.println("You are not eligible for voting please vait for" + (2000-DOB) + "Years");
			}
	}	
	
	public void gender()
	{
		Scanner S = new Scanner (System.in);
		System.out.println("Enter your gender");
		gender = S.next();
		if(gender.equalsIgnoreCase("male"))
		{
			System.out.println("You are a Male");
			f=0;
		}
		else if(gender.equalsIgnoreCase("Female"))
				{
			System.out.println("You are a Female");
			f=1;
				}
		else
		{
			System.out.println("Enter a valid value");
		}
	}
	
	public void calculation()
	{
		System.out.println("Please enter your DOB");
		Scanner S = new Scanner (System.in);
		DOB = S.nextInt();
		if(DOB<1999)
		{
			System.out.println("Please enter gender");
			gender = S.next();
			if(gender.equalsIgnoreCase("male"))
					{
				System.out.println("Please proceed to male counter for voting");
					}
			else if(gender.equalsIgnoreCase("female"))
					{
				System.out.println("Please proceed to female counter for voting");
					}
			else
			{
				System.out.println("Please mention correct gender");
			}
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
	}
	
	public static void main(String args[])
	{
		Vote V = new Vote();
		//V.age();
		//V.gender();
		//V.calc();
		V.calculation();
	}

}