package payroll;

public class SalesPerson  extends Employee
{
	private double sales;

	public SalesPerson(int h, float r, double s)
	{
		super(h, r);
		sales = s;
	}	

	public double getSales()
	{
		return sales;
	}
	public void setSales(double value)
	{
		sales = value;
	}

	public double income()
	{
		double amount = super.income();
		if(amount > 20000)
			return amount+=0.05 * sales;
		return amount;
	}
	public String toString()
	{
		return getHours()+ " and "+getRate()+ " and " + getSales();
	}
	public int hashCode()
	{
		return getHours() + (int)getRate() + (int)getSales();
	}
	public boolean equals(Object other)
	{
		if(other instanceof SalesPerson sp)
			return (getHours() == sp.getHours()) && (getRate() == sp.getRate()) && (getSales() == sp.getSales());
		return false;
	}


}
