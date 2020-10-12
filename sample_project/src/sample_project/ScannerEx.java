/**
 	*java study chapter2, 3
 	*scanner, if~else, for, while, do~while, array, for~each
 	*int[] makeArray{}
 */
package sample_project;

import java.util.Scanner;

public class ScannerEx {
	
	static Scanner scanner = new Scanner(System.in);
	
	static int[] MakeArray(int length){
		
		int[] temp;
		temp = new int[length];
		
		for(int i = 0; i<length; i++) {
			System.out.print(i + "번째 배열값을 입력하시오.");
			temp[i] = scanner.nextInt();
			
		}
		
		return temp;
	}
	
	static int SearchMax(int[] input, int max) {
		max = 0;
		
		for(int i = 0; i<input.length; i++)
		{
			if(input[i] > max)
			max = input[i];
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		int intArray[];
		int max = 0;
		int length = 0;
		
		System.out.println("배열 길이를 입력하시오.");
		length = scanner.nextInt();
		
		System.out.print("배열값을 입력하시오. ");
		intArray = MakeArray(length);
		
		
		System.out.println("입력한 배열값은 ");
		
		for(int i = 0; i<length; i++){
			if(i==0)
			{
				System.out.print(intArray[i]);
			}
			else {
				System.out.print(", " +  intArray[i]);
			}
		}
		System.out.println(" 입니다.");
		
		max = SearchMax(intArray, length);
		
		System.out.print("입력한 값중 가장 최고값은 " + max + "입니다.");
		
		scanner.close();
		
	}

}
