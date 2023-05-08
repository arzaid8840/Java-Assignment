import java.util.Scanner;
import hospital.*;

class Program
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Patient Id: ");
		int id=sc.nextInt();
		System.out.println("Enter the Patient BedType: ");
		int bt=sc.nextInt();
		System.out.println("Enter the Number of days: ");
		int day=sc.nextInt();

		Patient pradnya= new Patient(id, bt, day);
		System.out.printf("Bill of Patient Pradnya: %.2f%n", pradnya.getBill());

		HousePatient AR= new HousePatient(id, bt, day,10);
		System.out.printf("Bill of Patient AR %.2f%n", AR.getBill());

	}
}
