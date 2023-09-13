package practicePractice;

public class RemoveDuplicateElementsInArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,1,2,9,3};//1,1,2,2,3,3,4,5,9
		int i = 0,k=0;
		int n;
        for(int j=0;j<arr.length-1;j++)
		for( i=0;i<arr.length-1;i++)
		{
			
			if(arr[i]>arr[i+1])
			{
				n=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=n;
			}
		}
        
        System.out.print("sort athe array:");
        for(int k1=0;k1<arr.length;k1++)
        {
        	System.out.print(arr[k1]);
        }

        System.out.println();
        
        System.out.print("remove the array:");
        for(int m=0;m<arr.length-1;m++)
        {
        	if(arr[m]!=arr[m+1])
        	{
        		System.out.print(arr[m]);
        	}
        }
	}

}
