package parking;

public class ParkingTIcket 
{
	private Cop cop;
	private ParkingMeter parkingMeter;
	private String ticketnumber;
	private double finePerIllegalMinute;

	
	public ParkingTIcket(Cop cop, ParkingMeter parkingMeter, String ticketnumber, double finePerIllegalMinute) 
	{
		super();
		this.cop = cop;
		this.parkingMeter = parkingMeter;
		this.ticketnumber = ticketnumber;
		this.finePerIllegalMinute = finePerIllegalMinute;
	}
	
	public Cop getCop() 
	{
		return new Cop(cop);
	}
	
	public void setCop(Cop cop) 
	{
		this.cop = new Cop(cop);
	}
	
	public ParkingMeter getParkingMeter()
	{
		return parkingMeter;
	}
	
	public void setParkingMeter(ParkingMeter parkingMeter)
	{
		this.parkingMeter = parkingMeter;
	}
	
	public String getTicketnumber() 
	{
		return ticketnumber;
	}
	
	public void setTicketnumber(String ticketnumber) 
	{
		this.ticketnumber = ticketnumber;
	}
	
	public double getFinePerIllegalMinute() 
	{
		return finePerIllegalMinute;
	}
	
	public void setFinePerIllegalMinute(double finePerIllegalMinute) 
	{
		this.finePerIllegalMinute = finePerIllegalMinute;
	}
	
	@Override
	public String toString()
	{
		return cop + ", " + parkingMeter + ", ticketnumber=" + ticketnumber
				+ ", finePerIllegalMinute=" + finePerIllegalMinute + "]";
	}
	
	
	
	
	
	
	

}
