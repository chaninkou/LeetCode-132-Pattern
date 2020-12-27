package leetcode456;

public class Check132Pattern {
	public boolean find132pattern(int[] nums) {
		int n = nums.length;

		int top = n;
		int third = Integer.MIN_VALUE;

		for (int i = n - 1; i >= 0; i--) {
			if (nums[i] < third) {
				return true;
			}

			while (top < n && nums[i] > nums[top]) {
				third = nums[top];
				top++;
			}

			top--;
			nums[top] = nums[i];
		}

		return false;
	}
}
