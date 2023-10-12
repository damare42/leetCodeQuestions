class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  //Two sum
  /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up   to target.
  You may assume that each input would have exactly one solution, and you may not use the same element twice.
  You can return the answer in any order.
  Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
  Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
  */
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if(map.containsKey(complement)) {
        return new int[] {map.get(complement), i};
      }
      map.put(nums[i], i);
    }
  }

  
  //reverse a string
  public String reverseString(String s) {
    char[] arr = s.toCharArray();
    int left = 0;
    int right = arr.length - 1;
    while(left < right) {
      char temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
    return String.valueOf(arr);
  }
  
}