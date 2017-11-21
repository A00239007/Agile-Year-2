
public class House extends Building implements Room{
	private int roomNumber;
    public House() {
		super();
		roomNumber = DEFAULT_ROOMS;
		// TODO Auto-generated constructor stub
	}

	public House(int rN, int wL, int wW, int rL, int rW, int rH) {
		super(wL,  wW,  rL,  rW,  rH);
		roomNumber = rN;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setRoom(int r) {
		// TODO Auto-generated method stub
		roomNumber = r;
	}

	@Override
	public int getRoom() {
		// TODO Auto-generated method stub
		return roomNumber;
	}
	
	public String toString()
    {
        return super.toString()+"\nNumber of Rooms: "+roomNumber;
    }
}
