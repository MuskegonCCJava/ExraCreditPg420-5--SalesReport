import java.lang.reflect.Array;


public class SalonReport
{
	public static Service[] services = new Service[6];
	
	public static void main(String[] args)
	{
		
		
		services[0] = new Service("Cut", 8.0, 15);
		services[1] = new Service("Shampoo", 4.0, 10);
		services[2] = new Service("Manicure", 18.0, 30);
		services[3] = new Service("Style", 48.0, 55);
		services[4] = new Service("Permanent", 18.0, 35);
		services[5] = new Service("Trim", 6.0, 5);
	}
	
	public static void sortDescription()
	{
		Array.sort(services.length);
	}

}
