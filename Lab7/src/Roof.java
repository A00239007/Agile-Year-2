
public interface Roof {
	int DEFAULT_R_LENGTH = 0;
	int DEFAULT_R_WIDTH = 0;
	int DEFAULT_R_HEIGHT = 0;
	
	void setRLength(int roofL);
	int getLength();
	
	void setRWidth(int roofW);
	int getWidth();
	
	void setRHeight(int roofH);
	int getHeight();
}
