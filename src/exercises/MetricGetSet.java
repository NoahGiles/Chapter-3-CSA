package exercises;

public class MetricGetSet 
{
	
	private double cmConvert;
	private double literConvert;
	
	public void setCentimeters(double centimeter)
	{
		cmConvert = centimeter;
	}
	public double getCentimeters()
	{
		return cmConvert;
	}
	public void setLiters(double liter)
	{
		literConvert = liter;
	}
	public double getLiters()
	{
		return literConvert;
	}
}
