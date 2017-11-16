public  class Books implements Comparable<Books>{
	private static int sortMethod = 1;
	
	private String title,author,publish;
	private double price;
	
	public Books(String title,String author,String publish,int price)
	{
		if(title == null || author == null || publish == null || price == 0)
		{
			throw new IllegalArgumentException("Arguments Invalid");
		}
		
		this.title = title;
		this.author = author;
		this.publish = publish;
		this.price = price;
	}
	
	public static void swap(Books [] b, int i, int j)
	{
		Books temp = b[i];
		b[i]=b[j];
		b[j] = temp;
	}
	
	public static Books[] sort(Books [] b)
	{
		for(int i = 0; i<b.length-1; i++)
		{
			int index = i;
			for(int j = i+1; j<b.length;j++)
			{
				if(b[j].compareTo(b[index])<1)
				{
					index = j;
				}
			}
			Books temp = b[index];
			b[index] = b[i];
			b[i] = temp;
			//swap(b,i,index);
		}
		return b;
	}
	
	public static void changeSortingMethod(Double i)
	{
		if(i == 1)
		{
			sortMethod = 1;
		}
		else if(i == 2)
		{
			sortMethod = 2;
		}
		else if(i == 3)
		{
			sortMethod = 3;
		}
		else if(i == 4)
		{
			sortMethod = 4;
		}
	}
	
	public String toString()
	{
		if(sortMethod == 1)
		{
			return "\nTitle: "+title+"\nAuthor: "+author+"\nPublisher: "+publish+"\nPrice: "+price+"\n";
		}
		else if(sortMethod == 2)
		{
			return "\nAuthor: "+ author+"\nTitle: "+title+"\nPublisher: "+publish+"\nPrice: "+price+"\n";
		}
		else if(sortMethod == 3)
		{
			return "\nPublisher: "+ publish+"\nTitle: "+title+"\nAuthor: "+author+"\nPrice: "+price+"\n";
		}
		else
		{
			return "\nPrice: "+ price+"\nTitle: "+title+"\nAuthor: "+author+"\nPublisher: "+publish+"\n";
		}
	}
	@Override
	public int compareTo(Books o) {
		if(sortMethod == 1)
		{
			if(o.title.compareTo(this.title)<1)
			{
				return 1;
			}
			return 0;
		}
		
		if(sortMethod == 2)
		{
			if(o.author.compareTo(this.author)<1)
			{
				return 1;
			}
			return 0;
		}
		
		if(sortMethod == 3)
		{
			if(o.publish.compareTo(this.publish)<1)
			{
				return 1;
			}
			return 0;
		}
		else
		{
			if(o.price < this.price)
			{
				return 1;
			}
			return 0;
		}
	}
	
	public static void main(String [] args)
	{
		Books [] b = new Books[5];
		b[0] = new Books("Book about Bob","Arther","Jeffery",12);
		b[1] = new Books("Another book about Bob","Amy","Arren",2);
		b[2] = new Books("Bill Bang Fei","Bill","Sir Peanut",3);
		b[3] = new Books("Cups the Second","Sausage","Blyat",10);
		b[4] = new Books("Bullyets by Dad","Beats","Dad",20);
		double change = new Double(args[0]);
		changeSortingMethod(change);
		b = sort(b);
		if(sortMethod == 1)
		{
			System.out.println("Ordered By Title");
		}
		else if(sortMethod == 2)
		{
			System.out.println("Ordered By Author");
		}
		else if(sortMethod == 3)
		{
			System.out.println("Ordered By Publisher");
		}
		else
		{
			System.out.println("Ordered By Price");
		}
		
		for(Books p : b)
		{
			System.out.println(p);
		}
	}
}
