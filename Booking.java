package booking_pnr;
import java.io.IOException;
import java.util.*;
import booking_pnr.PNR;
public class Booking {
	public static void main(String[] args)throws IOException {
		
		Map<String, ArrayList<PNR>> dateMap=new HashMap<String, ArrayList<PNR>>();
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("Book ticket?");
		char c=sc.nextLine().charAt(0);
		while(c=='y' || c=='Y')
		{
			System.out.println("Enter date of booking:");
			
			String date=sc.nextLine(); //key
			
		System.out.println("Enter number of passengers");
		int n=Integer.parseInt(sc.nextLine());
		 PNR pnr=new PNR();
		 pnr.addPassengers(n);
		 System.out.println("Book ticket?");
		c=sc.nextLine().charAt(0);
		if(dateMap.containsKey(date))
		{
			ArrayList<PNR> temp=new ArrayList<PNR>(); 
			temp=dateMap.get(date);
			temp.add(pnr);
			dateMap.put(date, temp);
		}
		else
		{
			ArrayList<PNR> temp=new ArrayList<PNR>(); 
			temp.add(pnr);
			dateMap.put(date,temp);
		}
		
		
		
		/* If date does not exist, first create list then add pnr object to arraylist 
		 * ELSE  otherwise add pnr to existing araylist & add it to map
		  */
		}
		
	
		
		System.out.println("Enter date, admin! ");
		String bleh=new String(sc.nextLine());
		if(dateMap.containsKey(bleh))
		{
			ArrayList<PNR> p=new ArrayList<PNR>(); 
			p=dateMap.get(bleh);
			Iterator<PNR> itr=p.iterator();
			while(itr.hasNext())
			{
				itr.next().print();
			}


		}
		else
		{
			System.out.println("NO RESULTS FOUND!");
		}
		
		sc.close();
	}

}
