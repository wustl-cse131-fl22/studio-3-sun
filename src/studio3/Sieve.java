package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("maximum number?");
		int i = in.nextInt();
		int[] numbers = new int[i-1];
		int n = 0;
		
		for(n = 0;n < numbers.length; n ++)
		{
		numbers[n] = 2 + n;
		//System.out.println(numbers[n]);
		}
		
		
			for(n = 0; n < numbers.length; n++)
			{
				int a = 2;
				int composite = 0;
				for(a = 2;a < numbers.length; a++)
				{
				if(numbers[n] % a == 0)	
				{
				numbers[n] = composite;
				}
				else 
				{
				System.out.println(numbers[n]);
				}
			}
			
		
		}
	
	
	
	}
}
