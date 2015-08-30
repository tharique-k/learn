package g4g;

import java.util.Scanner;

public class IndependentFunctions {
	
	public static void main (String [] args){
		
		int [] ar = inputArray();
		rotateArray2(ar,4);
		System.out.print("the Result array after rotate is :");
		printArray(ar);
		System.out.println("The number of times it has been rotated is: " + findNoOfRotations(ar));
		System.out.println("The min value in the array is: "+ ar[findMinIndex(ar,0,ar.length-1)]);
		
	}
	
	public static int [] inputArray(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array : ");
		int n = scan.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the numbers in the array : ");
		for (int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		System.out.print("Array entered is : ");
		printArray(arr);
		scan.close();
		return arr;
		
	}
	
	public static void printArray(int[] arr){
		
		for (int i=0;i<arr.length;i++){
			
			System.out.print(arr[i]+" - ");
			
		}
		System.out.println();
		
	}

	
	/**
	 * This method has time complexity : O(n)
	 * 		and it takes Auxiliary space : O(d)
	 * @param arr array to be rotated
	 * @param d number of rotations
	 * @return
	 */
	
	public static void rotateArray1(int [] arr, int d){
		if (d>arr.length){
			d = d%arr.length;
		}
		else if (d==arr.length){
			return;
		}
		
		int [] temp = new int[d];
		int  i =0;
		for (i=0;i<d;i++){
			temp[i]= arr[i];
		}
		
		for (i =d;i<arr.length;i++){
				arr [i-d] = arr[i];
		}
		int j=0;
		for (i = arr.length-d; i<arr.length;i++ ){
				arr[i]=temp[j];
				j++;
		}
	}
	/**
	 * One by one method
	 * This method has time complexity : O(n*d)
	 * 		and it takes Auxiliary space : O(1)
	 * 
	 * @param arr array to be rotated
	 * @param d number of rotations
	 */
	
	public static void rotateArray2(int [] arr, int d){
		
		if (d>arr.length){
			d=d%arr.length;
		}
		else if (d==arr.length){
			return;
		}
		int temp;
		for (int i=0;i<d;i++){
			temp = arr[0];
			for (int j=0;j<arr.length-1;j++){
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
	}
	
	/**
	 * If a sorted array had been rotated unknown number of times, this method would 
	 * return the number of times it had been rotated
	 * @param array
	 * @return number of rotations
	 */
	
	public static int findNoOfRotations(int[] arr){
		
		int minIndex = findMinIndex(arr,0,arr.length-1);
		return arr.length-minIndex;	
	}
	
	/**
	 * return the index minimum value in an sorted array which had been rotated n times
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	private static int findMinIndex(int[] arr,int start, int end) {
		
		if (start==end){
			return start;
		}
		int mid = end-start/2;
		if (arr[mid] < arr[mid-1]){
			return mid;
		}
		else if (arr[mid]>arr[end]){
				return findMinIndex(arr,mid+1,end);
		}
				return findMinIndex(arr,start,mid-1);
	
	}
}
