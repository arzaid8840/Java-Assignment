import java.util.Scanner;
class MathMain
{
	public static void main(String [] args)
	{		
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(args[0]);
	
			System.out.println("Enter choice : ");
			System.out.printf("1. Check Even%n2. Check Odd%n3. Check prime%n4. Count Prime%n5. Reverse%n6. Count Digit%n");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1 :
					if(MathUtil.isEven(num) == true)
						System.out.println("Number is even");
					else
						System.out.println("Number is not Even");
					break;
				case 2 :
					if(MathUtil.isOdd(num)== true)
						System.out.println("Number is odd");
					else
						System.out.println("Number is not odd");
					break;
				case 3 :
					if(MathUtil.isPrime(num)==true)
						System.out.println("Number is prime");
					else
						System.out.println("Number is not prime");
					break;
				case 4 :
					System.out.println("Prime numbers between 1 to 100 are : "+MathUtil.countPrime(1, num));
					break;
				case 5 :
					System.out.println("Reverse of given number : "+MathUtil.reverse(num));
					break;
				case 6 :
					System.out.println("Number of digits in given number are : "+MathUtil.digitCount(num));
					break;
				default :
					System.exit(0);

		}
	sc.close();
	}
}
