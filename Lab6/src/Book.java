
public class Book implements Comparable<Book>{
//	public static void sortArray(int[] a) {
//		for (int i = 0; i < a.length; i++) {
//			int least = a[i];
//			int leastIndex = -1;
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[j] < least) {
//					least = a[j];
//					leastIndex = j;
//				}
//			}
//			if (leastIndex == -1) {
//			} else {
//				swap(a, leastIndex, i);
//			}
//		}
//	}
//
	public static void swap(Book[] a, int i, int j) {
		Book temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
//
//	public static void main(String[] args) {
//		int[] i = { 1, 12, 5, 6, 18, 14, 4 };
//		sortArray(i);
//		for (int a : i) {
//			System.out.print(a + ", ");
//		}
//	}
	private static int sortMethod;
	private String title,author,publisher;
	private int price;
	
	public Book(String title, String author, String publisher, int price)
	{
		if(title== null || author == null || publisher == null || price == 0)
		{
			throw new IllegalArgumentException("Arguments Invalid");
		}
		
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	public static void sort(Book[]a)
	{
		for(int i = 0; i < a.length; i++)
		{
			int least = 1;
			for(int j = i+1; j<a.length; j++)
			{
				if(a[j].compareTo(a[least])<1);
				{
					least = j;
				}
			}
			swap(a,i,least);
		}
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(sortMethod == 1)
		{
			if(o.title.compareTo(this.title)<1)
			{
				return 1;
			}
			return 0;
		}
		else
		{
			if(o.author.compareTo(this.author)<1)
			{
				return 1;
			}
			return 0;
		}
		else
		{
			if(o.publisher.compareTo(this.publisher)<1)
			{
				
			}
		}
	}
	
}
