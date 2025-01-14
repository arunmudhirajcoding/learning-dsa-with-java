// 169. Majority Element
// Easy Topics:
// Given an array nuns of size n. return the majority element,
// The majority element is the element that appears more than
// n / 2 times. You may assume that the majority element
// always exists in the array.
// Example 1:
// Input; nums = [3, 2, 3]
// Output: 3
// Example 2:
// Input; nums = [2, 2, 1, 1, 1,2, 2]
// Output: 2
public class majorityElement {
    public static void main(String[] args) {
        int nums[] = {10,20, 20, 20, 30, 40, 40, 40, 40, 40, 20, 50, 20, 20 , 80,20};

        // algorithem used is boye mooore voting algorithm but it only works if the there  majority element always exist  more n/2 times
        int majority = nums[0],vote = 1;
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] == majority ) {// if element found vote increase
                vote++;
            } else if (vote>0) {// if different element found vote decrease
                vote--;
            } else { //if vote is 0 and different element found 
                majority = nums[i];
                vote = 1;
            }
        }
        System.out.println(majority);
    }
}
