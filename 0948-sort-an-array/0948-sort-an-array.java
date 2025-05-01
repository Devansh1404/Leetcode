import java.util.Random;

class Solution {
    Random rand = new Random(); // Reuse single Random instance

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivotIndex = randomizedPartition(nums, low, high);
            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }
    }

    private int randomizedPartition(int[] nums, int low, int high) {
        int pivotIdx = low + rand.nextInt(high - low + 1);
        swap(nums, pivotIdx, high); // Swap random pivot with last
        return partition(nums, low, high);
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }

        swap(nums, i + 1, high);
        return i + 1;
    }

    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
