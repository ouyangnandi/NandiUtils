package print;

import java.util.Arrays;

/**
 * @Author: Nandi Ouyang
 * @Date  :  May 1, 2015
 * @Desc  :
 */
public class Print {
	
	public static void printArray(int[] arr){
		if(arr==null||arr.length==0) System.out.println("The array is empty");
		
		System.out.println(Arrays.toString(arr) + " Size: " + arr.length);

	}

}
