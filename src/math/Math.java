package math;

/**
 * @Author: Nandi Ouyang
 * Mar 30, 2015
 *
 */
public class Math {
	
	/**
	 * Get average integer number between val1 and val2. Prevent integer number overflow 
	 * first part: find all bit value =1 in val1 and val2,using "And" operation
	 * second part: using XOR to merge all bit value 0 and bit value 1 in val1 and val2, then divided by two
	 */
	public static int twoIntAvg(int val1,int val2){
		
		return (val1&val2) + ((val1^val2)>>1);
		
	}

}
