package java_1227_arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[5];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
//		for(int i=0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
		for(int number: nums) {
			System.out.println(number);
		}

		//1.find the max and min element from an int array 
		//2.find odd and even numbers from the given array 
		//3. find the second max and second min number from the given array 
		//4. search the given number if it exits in the array
		
	}

}
