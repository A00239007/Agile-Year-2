import java.util.Scanner;
public class MyArray {
	public static void main(String [] args){
		MyArray w = new MyArray();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word");
		char [] word = w.createArray(in.next());
		System.out.println("Enter a letter for the first word");
		String find = in.next();
		w.findIndex(word, find);
		System.out.print("Enter a second word");
		char[][] secondWord = w.createArray2(in.next());
		System.out.println("Enter a letter for the second word");
		String find2 = in.next();
		w.findIndex2(secondWord,find2);
		w.createCrossword2();
	}
	
	public char[] createArray(String word){
		char [] c = word.toCharArray();
		return c;
	}
	
	public char[][] createArray2(String word){
		char[][] ca = new char[20][20];
		ca[1] = word.toCharArray();
		return ca;
	}
	
	public void findIndex(char [] c, String find){
		char findIndex = find.charAt(0);
		for(int i = 0; i < c.length; i++)
		{
			if(findIndex == c[i])
			{
				System.out.println("The index of this letter is: "+i);
			}
		}
	}
	
	public void findIndex2(char [][] c, String find){
		char findIndex = find.charAt(0);
		for(int i = 0; i< c[1].length; i++)
		{
			if(findIndex == c[1][i])
			{
				System.out.println("The index of this letter is: "+i);
			}
		}
	}
	
	public void createCrossword2(){
		char[][]ca = new char[4][4];
		ca[1] = "ROAD".toCharArray();
		char[][]cha = new char[4][4];
		cha[1]= "T LL".toCharArray();
		for(int i = 0; i < ca.length; i++)
		{
			for(int j = 0; j < cha.length; j++)
			{
				System.out.print(ca[i][j]);
				System.out.print(cha[j][i]);
			}
			System.out.println();
		}
	}
}
