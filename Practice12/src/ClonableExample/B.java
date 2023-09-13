package ClonableExample;

public class B {
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
	A a1=new A();
	a1.setId(101);
	a1.setName("muztaba ahmad");
	System.out.println(a1.getId()+" "+a1.getName());
	
	
	A b1=(A)a1.clone();
	 
	System.out.println(b1.getId()+" "+a1.getName());

	
	}
}
