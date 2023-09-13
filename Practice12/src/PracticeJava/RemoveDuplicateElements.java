package PracticeJava;

public class RemoveDuplicateElements {
	
	   
	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,5,1,2,3};
		
		sorting(num);
		
		
	}
	
	
	public static void sorting(int[] num)
	{
		int temp,j = 1;
		for(int i=0;i<num.length-1;i++)
		{
			for( j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		System.out.println(num[j]);
		
	}

}
