package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static String cumulativeSum(int[] nums){
            for (int i = 1; i < nums.length; i++) {
                nums[i] = nums[i] + nums[i-1];
            }
        return Arrays.toString(nums);
    }
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(cumulativeSum(nums));

    }
}
