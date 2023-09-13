package prac;

final class Mutable {
	
		
		private final int age;
	    private final String name;
		
	    public Mutable(int age,String name)
	    {
	    	this.age=age;
	    	this.name=name;
	    }
	    public int getAge()
	    {
	    	return age;
	    }
	    
	    public String getName()
	    {
	    return name;
	    }
		public static void main(String args[])
		{
	    
	 Mutable m1=new Mutable(22,"Muztaba Ahmad");
	 
	 System.out.println(m1.age);
	 System.out.println(m1.name);
	 
	
	 
	 Mutable m2=new Mutable(24,"Sonu Ahmad");
	 
	 System.out.println(m1.age);
	 System.out.println(m1.name);
	 
		}
	
}

