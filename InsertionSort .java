
public class InsertionSort {
	
	void Sort(int[] array)
	{
		int n = array.length;
		
		for(int i = 0;i<n;i++)
		{
			int key = array[i];
			int j = i-1;
			
			while(j>=0 && array[j]>key) {
				array[j+1] =array[j];
				j = j-1;
				
			}
			
			array[j+1] =key;
			
			
			
					
		}
	}
	
	static void printArray(int[] array)
	{
		for(int i =0;i<array.length;i++)
		{
			System.out.print(array[i] +" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InsertionSort ob = new InsertionSort();
		
		int[] array = new int[5];
		
		array[0] = 12;
		array[1] = 11;
		array[2] = 13;
		array[3] = 5;
		array[4] = 7;
		
		ob.Sort(array);
		
		ob.printArray(array);
	}

}
