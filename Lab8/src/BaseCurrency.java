public interface BaseCurrency {
	
	void setDoshUSD(double money);
	void setRateUSD(double rate);
	void setDoshEURO(double money);
	void setRateEURO(double rate);
	void setDoshYUAN(double money);
	void setRateYUAN(double rate);
	void setDoshGBP(double money);
	void setRateGBP(double rate);
	
	double getDoshUSD();
	double getRateUSD();
	double getDoshEURO();
	double getRateEURO();
	double getDoshYUAN();
	double getRateYUAN();
	double getDoshGBP();
	double getRateGBP();
}
