public class ContainerWithMostWater {

    public static int maxWater(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int max = 0;

        while (left < right) {

            int width = right - left;

            int h = Math.min(height[left], height[right]);

            int water = width * h;

            max = Math.max(max, water);

            // Move smaller height pointer
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxWater(height));
    }
}
