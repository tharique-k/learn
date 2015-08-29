import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String [] args){
		
		System.out.println("Enter the number of numbers\n:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int [] arr = new  int[a];
		System.out.println("enter your array, seperated by new lines\n:");
		for (int i=0;i<a;i++){
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Enter the key you want to find\n:");
		int key = scan.nextInt();
		System.out.println("The number is at : "+locate(key,arr));
		scan.close();
	}
	
	private static int locate(int key, int [] arr){
		
		int hi = arr.length -1;
		int lo = 0;
		while(lo<=hi){
			int mid = lo + (hi-lo)/2;
			if (key<arr[mid]) hi = mid-1;
			else if(key>arr[mid]) lo = mid+1;
			else return mid;
		}
		return -1;
	}
}
