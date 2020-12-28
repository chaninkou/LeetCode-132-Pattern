package leetcode456;

import java.util.Stack;

public class Check132Pattern {
	public boolean find132pattern(int[] nums){
        Stack<Integer> stack = new Stack<>();
        
        int min = Integer.MAX_VALUE;
        
        for (int num : nums) {
        	// Only replaced min when there is smaller number
            if (num <= min) {
                min = num;
            } else {
                while (!stack.empty()) {
                	// If 2 > 1
                    if (stack.peek() >= num){
                    	break;
                    }
                    
                    stack.pop();
                    
                    // If 3 > 2
                    if (stack.pop() > num){
                    	return true;
                    }
                }
                
                // Pretend pushing 3
                stack.push(num);
                // Pretend pushing 2
                stack.push(min);
            }
        }
        
        // [ 4, 1 ]
        return false;
	}
	
	public boolean find132pattern2(int[] nums) {
		int n = nums.length;

		int top = n;
		int third = Integer.MIN_VALUE;

		for (int i = n - 1; i >= 0; i--) {
			if (nums[i] < third) {
				return true;
			}

			// 
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
