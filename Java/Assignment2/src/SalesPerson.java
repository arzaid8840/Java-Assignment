package payroll;
public class SalesPerson extends Employee
{
	private float sales;

	public SalesPerson(int h, float r, float s)
	{
		super(h, r);
		sales=s;
	}

	public void setSales(float ss)
	{
		sales=ss;
	}
	public float getSales()
	{
		return sales;
	}

	public double income()
	{
		double amount=super.income();
		if(sales>20000)
			return amount+(0.05*sales);
		return amount;
	}
}
