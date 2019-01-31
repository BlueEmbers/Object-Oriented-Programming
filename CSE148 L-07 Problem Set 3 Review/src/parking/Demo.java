package parking;

public class Demo
{

	public static void main(String[] args) 
	{
		Cop cop = new Cop("John Doe", "123");
	
		
		ParkingMeter pm = new ParkingMeter(50, "SuffolkMeter101");
		ParkingTIcket pt1 = new ParkingTIcket(cop, pm, "101", 0.1);
		
		Cop cop2 = new Cop("Jane Doe", "321");
		pt1.setCop(cop2);
		
		System.out.println(pt1.toString());	

	}

}
