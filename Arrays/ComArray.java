public class ComArray {
		int[] arr3 = {14,7,3,9,2};
		public static void main(String[] args) {
			int[] arr1 = {14,7,3,9,2};
			int[] arr2 = {3,89,5,78,7,3,9,2};
			for (int i=0; i<arr1.length;i++)
			{       
				for (int j=0; j<arr2.length;j++)
					{
				if(arr1[i] == arr2[j])
				{
				
				System.out.println(arr1[i]);
				}
					}
			}
	}
}
