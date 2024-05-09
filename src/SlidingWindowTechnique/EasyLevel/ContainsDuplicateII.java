package SlidingWindowTechnique.EasyLevel;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int ar[]={4,1,2,3,1,5};
        System.out.println(duplicate(ar,3));
    }

    private static boolean duplicate(int[] nums, int k) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer lastIndex = indices.put(nums[i], i);
            if (lastIndex != null && (i - lastIndex) <= k)
                return true;
        }
        return false;
    }
}
