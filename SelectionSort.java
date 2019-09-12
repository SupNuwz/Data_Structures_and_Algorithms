public class SelectionSort {

	public void sort(int[] array)
	{
		int  n = array.length;

		for(int i = 0; i<n-1;i++)
		{
			int min_idx = i;
			for(int j = i +1;j<n;j++)
			{
				if(array[j]<array[min_idx])
				{	min_idx = j;
									}


			}

			int temp;

			temp = array[i];
			array[i] = array[min_idx];
			array[min_idx] = temp;
		}
	}

	public void printarry(int[] array) {

		System.out.println("sorted array");
		for (int i = 0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SelectionSort ob = new SelectionSort();

		int[] array = new int[5];
		array[0] = 64;
		array[1] = 25;
		array[2] = 12;
		array[3] = 22;
		array[4] = 11;

		ob.sort(array);

		ob.printarry(array);



	}
}