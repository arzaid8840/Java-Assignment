import payroll.*;
class Program
{
	public static double tax(Employee e)
	{
		double i = e.income();
		return i > 10000 ? 0.15 *(i - 10000) : 0; 
	}
	public static double bonus(Employee e)
	{
		if(e instanceof SalesPerson s)
			return 0.25*s.getSales();
		return 0.1 * e.income();
	}
	public static void main(String [] args)
	{

		System.out.println("---------------------------My First Employee--------------------------");
		Employee myemp1= new Employee();
		myemp1.setHours(186);
		myemp1.setRate(60);

		System.out.printf("My Employee details%n");
		System.out.printf("Income: %.2f%n", myemp1.income());
		System.out.printf("Tax: %.2f%n", tax(myemp1));
		System.out.printf("Bonus: %.2f%n", bonus(myemp1));
		System.out.printf("To string for My Employee: %s%n",myemp1.toString());
		
		System.out.println("--------------------------My Second Employee--------------------------");

		Employee myemp2= new Employee();
		myemp2.setHours(186);
		myemp2.setRate(60);

		System.out.printf("My Employee details%n");
		System.out.printf("Income: %.2f%n", myemp2.income());
		System.out.printf("Tax: %.2f%n", tax(myemp2));
		System.out.printf("Bonus: %.2f%n", bonus(myemp2));
		System.out.printf("To string for My Employee: %s%n",myemp2.toString());

		System.out.println("------------------------My First Sales Person-------------------------");

		SalesPerson mysp1= new SalesPerson(200, 55, 25000);

		System.out.printf("My SalesPerson details%n");
		System.out.printf("Income: %.2f%n", mysp1.income());
		System.out.printf("Tax: %.2f%n", tax(mysp1));
		System.out.printf("Bonus: %.2f%n", bonus(mysp1));
		System.out.printf("To string for My Sales Person: %s%n",mysp1.toString());

		System.out.println("-----------------------My Second Sales Person-------------------------");

		SalesPerson mysp2= new SalesPerson(190, 65, 20000);

		System.out.printf("My SalesPerson details%n");
		System.out.printf("Income: %.2f%n", mysp2.income());
		System.out.printf("Tax: %.2f%n", tax(mysp2));
		System.out.printf("Bonus: %.2f%n", bonus(mysp2));
		System.out.printf("To string for My Sales Person: %s%n",mysp2.toString());

		System.out.println("---------------------check Identity and Equality----------------------");

		System.out.printf("Identity of myemp1 and myemp2: %b%n", myemp1==myemp2);
		System.out.printf("Identity of mysp1 and mysp2: %b%n", mysp1==mysp2);

		
		System.out.printf("Equality of myemp1 and myemp2: %b%n",(myemp1.hashCode()==myemp2.hashCode()) && myemp1.equals(myemp2));
		System.out.printf("Equality of mysp1 and mysp2: %b%n", (mysp1.hashCode()==mysp2.hashCode()) && mysp1.equals(mysp2));
	}
}
