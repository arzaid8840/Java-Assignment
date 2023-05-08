package payroll;
public class Employee
{
	private int hours;
	private float rate;

	public Employee(int h, float r)
	{
		hours = h;
		rate = r;
	}

	public Employee()
	{
		this(0, 40);
	}

	public int getHours()
	{
		return hours;
	}
	public void setHours(int value)
	{
		hours = value;
	}

	public float getRate()
	{
		return rate;
	}
	public void setRate(float value)
	{
		rate = value;
	}
	public double income()
	{
		double amount = rate * hours;
		int ot = hours - 180;
		if(ot > 0)
			amount += 50* ot;
		return amount;
	}

	public String toString()
	{
		return getHours()+ " and " + getRate();
	}
	public int hashCode()
	{
		return getHours() + (int)getRate();
	}
	public boolean equals(Object other)
	{
		if(other instanceof Employee e)
			return (getHours() == e.getHours()) && (getRate() == e.getRate());
		return false;
	}
}
