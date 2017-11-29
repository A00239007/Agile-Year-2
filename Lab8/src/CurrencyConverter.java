
public class CurrencyConverter implements BaseCurrency{

	private double dosh;
	private double conversionRate;
	
	public CurrencyConverter(double cash,double con) {
		// TODO Auto-generated constructor stub
		dosh = cash;
		conversionRate = con;
	}
	

	
	
	@Override
	public void setDoshUSD(double money) {
		// TODO Auto-generated method stub
		dosh = money;
	}
	@Override
	public void setRateUSD(double rate) {
		// TODO Auto-generated method stub
		conversionRate = rate;
	}
	@Override
	public void setDoshEURO(double money) {
		// TODO Auto-generated method stub
		dosh = money;
	}
	@Override
	public void setRateEURO(double rate) {
		// TODO Auto-generated method stub
		conversionRate = rate;
	}
	@Override
	public void setDoshYUAN(double money) {
		// TODO Auto-generated method stub
		dosh = money;
	}
	@Override
	public void setRateYUAN(double rate) {
		// TODO Auto-generated method stub
		conversionRate = rate;
	}
	@Override
	public void setDoshGBP(double money) {
		// TODO Auto-generated method stub
		dosh = money;
	}
	@Override
	public void setRateGBP(double rate) {
		// TODO Auto-generated method stub
		conversionRate = rate;
	}
	@Override
	public double getDoshUSD() {
		// TODO Auto-generated method stub
		return dosh;
	}
	@Override
	public double getRateUSD() {
		// TODO Auto-generated method stub
		return dosh;
	}
	@Override
	public double getDoshEURO() {
		// TODO Auto-generated method stub
		return dosh;
	}
	@Override
	public double getRateEURO() {
		// TODO Auto-generated method stub
		return dosh;
	}
	@Override
	public double getDoshYUAN() {
		// TODO Auto-generated method stub
		return dosh;
	}
	@Override
	public double getRateYUAN() {
		// TODO Auto-generated method stub
		return dosh;
	}
	@Override
	public double getDoshGBP() {
		// TODO Auto-generated method stub
		return dosh;
	}
	@Override
	public double getRateGBP() {
		// TODO Auto-generated method stub
		return dosh;
	}
	
	public String toString()
	{
		return ""+(dosh * conversionRate); 
	}
	
}
