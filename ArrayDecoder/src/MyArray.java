import java.util.Scanner;
public class MyArray {
	public void main(String [] args){
		MyArray w = new MyArray();
		char [] word = w.createArray();
	}
	
	public char[] createArray(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word");
		char [] c = in.next().toCharArray();
		return c;
	}
	
	public int findIndex(char [] c, int find){
		
	}
}
