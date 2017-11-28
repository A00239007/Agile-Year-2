
public class CurrencyConverter implements BaseCurrency{

	private double doshEuro;
	private double conversionRate;
	
	public CurrencyConverter()
	{
		doshEuro = DEFAULT_DOSH;
	}
	
	public CurrencyConverter(double euro, double rate) {
		// TODO Auto-generated constructor stub
		doshEuro = euro;
		conversionRate = rate;
	}
	@Override
	public void setDosh(int money) {
		// TODO Auto-generated method stub
		doshEuro = money; 
	}

	@Override
	public double getDosh() {
		// TODO Auto-generated method stub
		return doshEuro;
	}
	
	public double Conversion()
	{
		return (doshEuro * conversionRate); 
	}
}
