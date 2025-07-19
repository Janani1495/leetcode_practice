import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }

        while (list.size() > 1) {
            int max = Integer.MIN_VALUE;
            int s_max = Integer.MIN_VALUE;
            int maxIndex = -1, sMaxIndex = -1;

            // Find max and second max
            for (int i = 0; i < list.size(); i++) {
                int val = list.get(i);
                if (val > max) {
                    s_max = max;
                    sMaxIndex = maxIndex;
                    max = val;
                    maxIndex = i;
                } else if (val > s_max) {
                    s_max = val;
                    sMaxIndex = i;
                }
            }

            System.out.println("Max: " + max + ", Second Max: " + s_max);

            // Remove max and second max safely
            if (maxIndex > sMaxIndex) {
                list.remove(maxIndex);
                list.remove(sMaxIndex);
            } else {
                list.remove(sMaxIndex);
                list.remove(maxIndex);
            }

            if (max != s_max) {
                list.add(max - s_max);
            }
        }

        return list.isEmpty() ? 0 : list.get(0);
    }
}
