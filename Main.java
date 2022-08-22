import java.util.Random;

public class Main {

	public static void main(String[] args) {	
		int[] randNumArray = randomNumArr();
		bubbleSort(randNumArray);
	}
	
	public static void bubbleSort(int[] numArr) {
		int count = 0;
		printNumArr(numArr);
		for(int j = 0; j < numArr.length; j++) {
			if(valid(numArr)) break;
			count++;
			System.out.println("------- Round " + count + " -------");
			for(int i = 0; i < numArr.length; i++) {
				int small = 0;
				int big = 0;			
				
				if(i != numArr.length - 1) {				
					if(numArr[i] > numArr[i + 1]) {
						small = numArr[i + 1];
						big = numArr[i];				
					}else {
						small = numArr[i];
						big = numArr[i + 1];
					}	
					
					numArr[i] = small;
					numArr[i + 1] = big;
				}else {
					if(numArr[i] > numArr[i - 1]) {
						small = numArr[i - 1];
						big = numArr[i];				
					}else {
						small = numArr[i];
						big = numArr[i - 1];
					}
					
					numArr[i - 1] = small;
					numArr[i] = big;
				}				
				System.out.println("[" + i + "]:" + numArr[i]);			    
			}								
		}	
		System.out.println(count + " round(s) of sorting is/are needed to sort " + numArr.length + " elements.");
		printNumArr(numArr);
	}
	
	public static boolean valid(int[] numArr) {
		boolean isSorted = false;
		
		for(int i = numArr.length - 1; i >= 0; i--) {
			if(i != 0 && numArr[i] < numArr[i-1]) {
				isSorted = false;
				break;
			}else isSorted = true;					
		}

		return isSorted;
	}
	
	public static int[] randomNumArr() {
		Random rd = new Random();
		int arr[] = new int[rd.nextInt((10 - 1) + 1) + 1];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt((100 - 1) + 1) + 1;
		}
		return arr;
	}
	
	public static void printNumArr(int[] numArr) {
		System.out.print("numArr[");
		for(int i = 0; i < numArr.length; i++) {
			if(i == 0) {
				System.out.print(numArr[i]);
			}else {
				System.out.print(", " + numArr[i]);
			}
			
		}
		System.out.println("]");
	}

}
