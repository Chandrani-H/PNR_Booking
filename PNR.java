package booking_pnr;
import java.util.*;
import booking_pnr.Passenger;
public class PNR {
	static int iPNR=0;
	int PNR;
	int noPassengers;
	ArrayList<Passenger> passengerList=new ArrayList<Passenger>();
	
void addPassengers(int n)
{
	PNR=iPNR;
	iPNR++;
	Scanner sc=new Scanner(System.in);
	noPassengers=n;
	System.out.println("Enter passenger details in name  age  gender format:");
	for(int i=0; i<noPassengers; i++)
	{
		String name= sc.nextLine();
		int age=Integer.valueOf(sc.nextLine());
		char sex=sc.nextLine().charAt(0);
		System.out.println(name+age+sex);
		Passenger obj=new Passenger(name, age, sex);
		passengerList.add(obj);
	}
	
	//sc.close();
}

void print()
{

		Iterator<Passenger> itr=passengerList.iterator();

		while(itr.hasNext())
		{
			Passenger pass=itr.next();
			System.out.println("PNR: "+PNR+"\t"+pass.name+"\t"+pass.age+"\t"+pass.gender);
		}

		
}

	
}
