package leetcode456;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {6,1,4,2};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		Check132Pattern solution = new Check132Pattern();
		
		System.out.println("Solution: " + solution.find132pattern(nums));
	}
}
