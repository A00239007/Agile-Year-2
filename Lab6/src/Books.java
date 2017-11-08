public  class Books implements Comparable<Books>{
	private static int sortMethod = 1;
	
	private String title,author,publish;
	private double price;
	
	public Books(String title,String author,String publish,double price)
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
	
	public static int sortMethod()
	{
		return sortMethod;
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
}
