package hospital;

public class Patient
{
	protected int patientId;
	protected int bedType;
	protected int days;

	public Patient(int id, int type, int days)
	{
		this.patientId = id;
		this.bedType = type;
		this.days = days;
	}

	public int getId()
	{
		return patientId;
	}
	public void setId(int id)
	{
		patientId = id;
	}

	public double getPricePerDay()
	{
		if(bedType==1)
			return 500;
		else if(bedType==2)
			return 350;
		else if(bedType==3)
			return 200;
		else
			return 250;
	}

	public double getBill()
	{
		double amount = days* getPricePerDay();
		return amount;
	}
}

