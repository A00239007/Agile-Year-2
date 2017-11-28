
public class Building implements Walls, Roof{
	
	private int wallLength;
	private int wallWidth;
	private int roofLength;
	private int roofHeight;
	private int roofWidth;
	
	public Building()
	{
		wallLength = DEFAULT_W_LENGTH;
		wallWidth = DEFAULT_W_WIDTH;
		roofLength = DEFAULT_R_LENGTH;
		roofWidth = DEFAULT_R_WIDTH;
		roofHeight = DEFAULT_R_HEIGHT;
	}
	
	public Building(int wL, int wW, int rL, int rW, int rH)
	{
		wallLength = wL;
		wallWidth = wW;
		roofLength = rL;
		roofWidth = rW;
		roofHeight = rH;
	}
	
	@Override
	public void setRLength(int roofL) {
		// TODO Auto-generated method stub
		roofLength = roofL;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return roofLength;
	}

	@Override
	public void setRWidth(int roofW) {
		// TODO Auto-generated method stub
		roofWidth = roofW;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return roofWidth;
	}

	@Override
	public void setRHeight(int roofH) {
		// TODO Auto-generated method stub
		roofHeight = roofH;
	}
	
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return roofHeight;
	}

	@Override
	public void setWLength(int wallL) {
		// TODO Auto-generated method stub
		wallLength = wallL;
	}

	@Override
	public int getWLength() {
		// TODO Auto-generated method stub
		return wallLength;
	}

	@Override
	public void setWWidth(int wallW) {
		// TODO Auto-generated method stub
		wallWidth = wallW;
	}

	@Override
	public int getWWidth() {
		// TODO Auto-generated method stub
		return wallWidth;
	}
	
	public String toString()
	{
		return "\nWall Length: "+wallLength+"\nWall Width: "+wallWidth+"\nRoof Height: "+roofHeight+"\nRoof Length: "+roofLength+"\nRoof Width: "+roofWidth;
	}
}
