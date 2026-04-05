package org.example.intv;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumArray {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int ln = nums.length;
        for (int i = 0; i < ln; i++) {
            for (int j = i + 1; j < ln; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        //Time :O(n^2) Space : O(2) i.e O(1)
        return result;
    }

    public static int[] twoSumHashing(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int complement;
        int ln = nums.length;
        for (int i = 0; i < ln; i++) {
            complement = target - nums[i];
            if(hs.containsKey(complement))
            {
                return new int[] {hs.get(complement),i};
            }
            hs.put(nums[i],i);
        }
        //Time :O(n) Space : O(n)
        return new int[]{};
    }

    static void main(String[] args) {
        int[] input = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(input, 9)));
        System.out.println(Arrays.toString(twoSum(input, 13)));
        System.out.println(Arrays.toString(twoSum(input, 18)));


        System.out.println(Arrays.toString(twoSumHashing(input,9)));
        System.out.println(Arrays.toString(twoSumHashing(input,13)));
        System.out.println(Arrays.toString(twoSumHashing(input,18)));

    }
}
