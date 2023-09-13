package practice_constructer;

public class Constructor {
	
    int id;
	String name;
	
	Constructor(int id,String name)
	{
	  this.id=id;
	  this.name=name;
	}
	public static void main(String[] args) {
		
		Constructor c1=new Constructor(101,"muztaba");
		System.out.println(c1.id);
		System.out.println(c1.name);
		
	}
	
	
	
	
	

}
