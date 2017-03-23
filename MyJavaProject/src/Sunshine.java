import java.util.Scanner;

public class Sunshine {
	
	public static void main(String args[]){
		int month;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter your date of birth in MMDD format");
		month = S.nextInt();
			if(month>=0321&&month<=0420)
				{
					System.out.println("Your horoscope is Aquarius");
				}
			else if(month>=0421&&month<=0520)
		         {
					System.out.println("Your horoscope is Pisces");
		         }
		    else if(month>=0521&&month<=0620)
		         {
		        	 System.out.println("Your horoscope is Aries");
		         }
		    else if(month>=0621&&month<=0720)
	         {
	        	 System.out.println("Your horoscope is Cancer");
	         }
		    else if(month>=721&&month<=820)
	         {
	        	 System.out.println("Your horoscope is Leo");
	         }
		    else if(month>=821&&month<=922)
	         {
	        	 System.out.println("Your horoscope is Virgo");
	         }
		    else if(month>=923&&month<=1022)
	         {
	        	 System.out.println("Your horoscope is Libra");
	         }
		    else if(month>=1023&&month<=1122)
	         {
	        	 System.out.println("Your horoscope is Scorpio");
	         }
		    else if(month>=1123&&month<=1220)
	         {
	        	 System.out.println("Your horoscope is Sagittarius");
	         }
		    else if(month>=1221&&month<=119)
	         {
	        	 System.out.println("Your horoscope is Capricon");
	         }
		    else if(month>=0120&&month<=218)
	         {
	        	 System.out.println("Your horoscope is Aquarius");
	         }
		    else if(month>=219&&month<=0320)
	         {
	        	 System.out.println("Your horoscope is Pisces");
	         }
		    else
		    {
		    	System.out.println("Invalid Date");
		    }
		 	}

}
