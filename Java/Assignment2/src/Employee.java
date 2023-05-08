package payroll;

public class Employee
{
	private int hours;
	private float rate;

	public Employee(int h, float r)
	{
		hours=h;
		rate=r;
	}
	public Employee()
	{
		this(0, 40);
	}

	public void setHours(int hr)
	{
		hours=hr;
	}
	public int getHours()
	{
		return hours;
	}

	public void setRate(float ra)
	{
		rate=ra;
	}
	public float getRate()
	{
		return rate;
	}
	public double income()
	{
		double amount= rate*hours;
		int ot=hours-180;
		if(ot>0)
			return amount+(50*ot);
		return amount;
	}

}
