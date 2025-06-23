package Quiz_1;

public class Q12_6643005 {
	public static int[] moveRightElement(int[] list) {
		int[] result = list;
		if (list.length == 0) {
			// do nothing
		} else {
			int len = list.length;
			int []list2 = new int[len];
			
			for (int i = 0 ; i<len-1;i++) {
				list2[i+1] = list[i];
			}
			list2[0] = list[len-1];
			result= list2;
		}
		return result;
	}

	public static void printArray(int[] array){
	for( int i=0; i < array.length; i++)
		System.out.print(array[i]+" ");
       	System.out.println();
    }

	public static void main(String[] args) {
		int[] arr1 = {};
		int[] arr2 = { 6, 3, 5, 7, 9 };
		int[] arr3 = { 12, 10, 11 };
		int[] arr4 = { 12, 5, 10 };
		int[] arr5 = { 10, 5, 7, 16, 22, 44 };
		printArray(moveRightElement(arr1)); //
		printArray(moveRightElement(arr2)); // 9 6 3 5 7
		printArray(moveRightElement(arr3)); // 11 12 10
		printArray(moveRightElement(arr4)); // 10 12 5
		printArray(moveRightElement(arr5)); // 44 10 5 7 16 22
	}

}
