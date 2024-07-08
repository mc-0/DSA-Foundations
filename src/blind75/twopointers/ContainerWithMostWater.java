package blind75.twopointers;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxCapacity = 0;
        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            int maxHeight = Math.min(height[start], height[end]);
            int currentWidth = end - start;

            int area = maxHeight * currentWidth;

            maxCapacity = Math.max(maxCapacity, area);

            if (height[start] < height[end]) {
                start++;
            }
            else {
                end--;
            }

        }
        return maxCapacity;

    }

}
