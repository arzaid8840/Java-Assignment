class MathUtil
{
	public static boolean isEven(int num)
	{
		if(num % 2 == 0)
			return true;
		return false;
	}
	public static boolean isOdd(int num)
	{
		if(num % 2 !=0)
			return true;
		return false;
	}
	public static boolean isPrime(int num)
	{
		if(num==1)
			return false;
		else if(num == 2)
			return true;
		else{
		for(int i = 2; i <= num/2; ++i)
		{
			if (num % i == 0)
				return false;
		}
		return true;
		}
	}
	public static int countPrime(int lower, int upper)
	{
		int count=0;
		for(int i=lower; i<=upper; ++i)
		{
			if(isPrime(i))
				count++;
		}
		return count;
	}
	public static int reverse(int num)
	{
		int rev = 0;
		while(num != 0)
		{
			rev =rev*10 + num % 10;
			num /= 10;
		}
		return rev;
	}
	public static int digitCount(int num)
	{
		int count = 0;
		while(num != 0)
		{
			num /= 10;
			count++;
		}
		return count;
	}
}
