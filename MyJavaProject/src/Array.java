
public class Array {
	public static void main(String agrs[]){
		int[]a={1,2,3};
		
		try
		{
		System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("error");
		}
	}

}
