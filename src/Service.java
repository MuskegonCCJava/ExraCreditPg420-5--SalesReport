
public class Service
{
	private String serviceDesc;
	private double price;
	private int time;
	
	public Service(String serviceDesc, double price, int time)
	{
		this.serviceDesc = serviceDesc;
		this.price = price;
		this.time = time;
	}
	
	public String getServiceDesc()
	{
		return serviceDesc;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getTime()
	{
		return time;
	}
}