//Stephen Gordon
public class Main {
	public static void main(String args[]){
		int[] myArray = {5,321,42,532,5324,132,562,631,412,321};
		int[] newArray = {321,32,321,231,43,6654,758,876,768,10};
		System.out.println("Unsorted:");
		print(myArray);
		System.out.println();
		print(newArray);
		System.out.println();
		sort(myArray);
		sort(newArray);
		System.out.println();
		System.out.println("Sorted with manual method");
		print(myArray);
		System.out.println();
		print(newArray);
		//System.out.println();
		//System.out.println("Merged");
		System.out.println();
		merge(myArray, newArray);
		
	}
	
	public static void print(int[] array){
		int count = 0;
		while(count != array.length){
			System.out.print(array[count] + " ");
			count++;
		} //end while
	} //end method
	
	public static int[] sort(int[] array){
		int count = 0;
		int temp;
		boolean swappy = true;
		while(swappy){
			swappy = false;
			count++;
		for(count = 0; count < array.length - 1; count++){
			if(array[count] < array[count+1]){
				temp = array[count];
				array[count] = array[count+1];
				array[count+1] = temp;
				swappy = true;
			} //end if
		} //end for
		} //end while
		return array;
	} //end method
	
	public static int[] merge(int[] first, int[] second){
		int[] result = new int[first.length+second.length];
		int i = 0; //For overall array
		int j = 0; // For second array
		for(i=0;i<first.length;i++){
			result[i] = first[i];
		}//end first for
		while(i < first.length+second.length){
			result[i] = second[j];
			j++;
			i++;
		} //end second while
		System.out.println();
		System.out.println("Merged and Re-Sorted");
		sort(result);
		print(result);
		return result;
	} //end method
}
