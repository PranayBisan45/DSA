//find number which is smallest element in array 
//greater or equal to target
//
//import java.util.Arrays;
//
//public class searchtarget {
//	public static void main(String[] args) {
//		int [] arr= {2,3,5,9,14,18,17,16};
//		int target=15;
//		int num=ceiling(arr,target);
//		System.out.println(num);
//	}
//
//	private static int ceiling(int[] arr, int target) {
//
//		int[] tarr=new int[arr.length];
//		
//		int cnt=0;
//		for(int i=0;i<arr.length;i++) {
//			
//			
//			if(arr[i]==target) {
//				return arr[i];
//			}
//			else if(arr[i]>target){
//				 tarr[cnt]=arr[i];
//				 cnt++;
//			}
//		}
//		int min=tarr[0];
//		//System.out.println(tarr[0]);
//		//System.out.println(min);
//		System.out.println(Arrays.toString(tarr));
//		for(int i=0;i<tarr.length;i++) {
//			if(tarr[i]==0) {
//				break;
//			}
//			else if(tarr[i]<min) {
//				min=tarr[i];
//				//System.out.println(min);
//			}
//			
//		}
//		
//		return min;
//	}
//}


import java.util.Arrays;

public class searchtarget {
	public static void main(String[] args) {
		int [] arr= {2,3,5,9,14,16,18};
		int target=15;
		int num=ceiling(arr,target);
		System.out.println(arr[num]);
	}

	private static int ceiling(int[] arr, int target) {
		int first=0;
		int last=arr.length-1;
		while(first<=last) {
			int mid=first+(last-first)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				first=mid+1;
			}
			else last=mid-1;
		}
		return first;
	}
}
