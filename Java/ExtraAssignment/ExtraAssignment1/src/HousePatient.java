package hospital;

public class HousePatient extends Patient
{
	protected float discount;


	public HousePatient(int patientId, int bedType, int days, float disc)
	{
		super(patientId, bedType, days);
		discount = 10;
	}

	public double getBill()
	{
		double amount = (100-discount) * days * getPricePerDay()/100;
		return amount;
	}
}
