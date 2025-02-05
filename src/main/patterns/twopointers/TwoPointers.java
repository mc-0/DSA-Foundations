package main.patterns.twopointers;

import main.util.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TwoPointers {

    public static boolean simplePalimdrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.toLowerCase().charAt(i));
            }
        }

        int start = 0, end = sb.length() - 1;
        while (start < end) {
            if (sb.charAt(start) == sb.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int[] targetSum(int[] input, int target) {
        int[] answer = {-1,-1};
        int start = 0;
        int end = input.length - 1;

        while (start < end) {
            if (input[start] + input[end] == target) {
                answer[0] = start;
                answer[1] = end;
                return answer;
            }
            else {
                if ((input[start] + input[end]) < target) {
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        return answer;
    }

    public static int moveDuplicates(int[] nums) {
        int nextNonDuplicate = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[nextNonDuplicate - 1] != nums[i]) {
                nums[nextNonDuplicate] = nums[i];
                nextNonDuplicate++;
            }
        }
        return nextNonDuplicate;
    }

    public static int removeKeyFromUnsorted(int[] nums, int key) {
        int replaceable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != key) {
                nums[replaceable] = nums[i];
                replaceable++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return replaceable;
    }

    public static int[] squareSortedArray(int[] nums) {
        int[] squared = new int[nums.length];
        int start = 0, end = nums.length - 1;

        for (int i = nums.length - 1; i >= 0 ; i--) {
            int startSquared = (nums[start] * nums[start]);
            int endSquared = (nums[end] * nums[end]);

            if (startSquared >= endSquared) {
                squared[i] = startSquared;
                start++;
            }
            else {
                squared[i] = endSquared;
                end--;
            }
        }
        return squared;
    }

    public static List<List<Integer>> allTriplatesSumToZero(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) // skip same element to avoid duplicate triplets
                continue;
            searchPair(arr, -arr[i], i + 1, triplets);
        }

        return triplets;
    }

    private static void searchPair(int[] arr, int targetSum, int left, List<List<Integer>> triplets) {
        int right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == targetSum) { // found the triplet
                triplets.add(Arrays.asList(-targetSum, arr[left], arr[right]));
                left++;
                right--;
                while (left < right && arr[left] == arr[left - 1])
                    left++; // skip same element to avoid duplicate triplets
                while (left < right && arr[right] == arr[right + 1])
                    right--; // skip same element to avoid duplicate triplets
            } else if (targetSum > currentSum)
                left++; // we need a pair with a bigger sum
            else
                right--; // we need a pair with a smaller sum
        }
    }


    public static int searchTriplet(int[] arr, int targetSum) {
        if (arr == null || arr.length < 3)
            throw new IllegalArgumentException();

        Arrays.sort(arr);
        int smallestDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1, right = arr.length - 1;
            while (left < right) {
                // comparing the sum of three numbers to the 'targetSum' can cause overflow
                // so, we will try to find a target difference
                int targetDiff = targetSum - arr[i] - arr[left] - arr[right];
                if (targetDiff == 0) //  we've found a triplet with an exact sum
                    return targetSum; // return sum of all the numbers

                // the second part of the above 'if' is to handle the smallest sum when we have
                // more than one solution
                if (Math.abs(targetDiff) < Math.abs(smallestDifference)
                        || (Math.abs(targetDiff) == Math.abs(smallestDifference)
                        && targetDiff > smallestDifference))
                    smallestDifference = targetDiff; // save the closest and the biggest difference

                if (targetDiff > 0)
                    left++; // we need a triplet with a bigger sum
                else
                    right--; // we need a triplet with a smaller sum
            }
        }
        return targetSum - smallestDifference;
    }

    public static int searchTripletLessThanTarget(int[] arr, int target) {
        if (arr == null || arr.length < 3)
            throw new IllegalArgumentException();

        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            count += searchPairLessThanTarget(arr, target - arr[i], i);
        }
        return count;
    }

    private static int searchPairLessThanTarget(int[] arr, int targetSum, int first) {
        int count = 0;
        int left = first + 1, right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] < targetSum) { // found the triplet
                // since arr[right] >= arr[left], therefore, we can replace arr[right] by any
                // number between left and right to get a sum less than the target sum
                count += right - left;
                left++;
            } else {
                right--; // we need a pair with a smaller sum
            }
        }
        return count;
    }

    public static List<List<Integer>> searchTripletsLessWithList(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            searchPairLessWithList(arr, target - arr[i], i, triplets);
        }
        return triplets;
    }

    private static void searchPairLessWithList(int[] arr, int targetSum, int first, List<List<Integer>> triplets) {
        int left = first + 1, right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] < targetSum) { // found the triplet
                // since arr[right] >= arr[left], therefore, we can replace arr[right] by any
                // number between left and right to get a sum less than the target sum
                for (int i = right; i > left; i--)
                    triplets.add(Arrays.asList(arr[first], arr[left], arr[i]));
                left++;
            } else {
                right--; // we need a pair with a smaller sum
            }
        }
    }

    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        // Resultant list to store all valid subarrays.
        List<List<Integer>> result = new ArrayList<>();

        // Variable to store the product of elements in the current subarray.
        double product = 1;

        // Left boundary of the current subarray.
        int left = 0;

        // Iterate over the array using 'right' as the right boundary of the current
        // subarray.
        for (int right = 0; right < arr.length; right++) {
            // Update the product with the current element.
            product *= arr[right];

            // If the product is greater than or equal to the target, slide the left
            // boundary to the right until product is less than target.
            while (product >= target && left < arr.length) {
                product /= arr[left++];
            }

            // Create a temporary list to store the current subarray.
            List<Integer> tempList = new LinkedList<>();

            // Iterate from 'right' to 'left' and add all these subarrays to the result.
            for (int i = right; i >= left; i--) {
                // Add the current element at the beginning of the list.
                tempList.add(0, arr[i]);

                // Add the current subarray to the result.
                result.add(new ArrayList<>(tempList));
            }
        }

        // Return the result.
        return result;
    }

    public static void dutchNationalFlag(int[] arr) {
        int i = 0, low = 0;
        int high = arr.length - 1;

        while (i <= high) {
            if (arr[i] == 0) {
                Helper.swap(arr, i, low);
                i++;
                low++;
            }
            else if (arr[i] == 1) {
                i++;
            }
            else {
                Helper.swap(arr, i, high);
                high--;
            }
        }
    }

}
