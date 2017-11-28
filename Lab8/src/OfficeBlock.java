
public class OfficeBlock extends Building implements Cubicles {
	private int cubicles;
	
	public OfficeBlock() {
		// TODO Auto-generated constructor stub
		super();
		cubicles = DEFAULT_CUBICLES;
	}
	
	public OfficeBlock(int c, int rN, int wL, int wW, int rL, int rW)
	{
		super(rN, wL, wW, rL, rW);
		cubicles = c;
	}
	
	@Override
	public void setCubicles(int c) {
		// TODO Auto-generated method stub
		cubicles = c;
	}

	@Override
	public int getCubicles() {
		// TODO Auto-generated method stub
		return cubicles;
	}
	
	public String toString()
	{
		return super.toString() + "Cubicles: "+cubicles;
	}

}
