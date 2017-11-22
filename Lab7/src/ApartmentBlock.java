
public class ApartmentBlock extends Building implements Units {
	
	private int units;
	
	public ApartmentBlock() {
		// TODO Auto-generated constructor stub
		super();
		units = DEFAULT_UNITS;
	}
	
	public ApartmentBlock(int u,int rN, int wL, int wW, int rL, int rW){
		super(rN,  wL, wW, rL, rW);
		units = u;
	}
	@Override
	public void setUnits(int u) {
		// TODO Auto-generated method stub
		units = u;
	}

	@Override
	public int getUnits() {
		// TODO Auto-generated method stub
		return units;
	}
	
	public String toString()
	{
		return super.toString() + "Units: "+units;
	}

}
