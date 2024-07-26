import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        int colExt = map.get(ext);
        int colSortBy = map.get(sort_by);

        List<int[]> list = new ArrayList<>();
        for (int[] datum : data) {
            for (int j = 0; j < datum.length; j++) {
                if (j == colExt && datum[j] < val_ext) {
                    list.add(datum);
                }
            }
        }
        list.sort(Comparator.comparingInt(a -> a[colSortBy]));

        int[][] answer = new int[list.size()][list.get(0).length];

        for (int i = 0; i < list.size(); i++) {
            System.arraycopy(list.get(i), 0, answer[i], 0, list.get(i).length);
        }

        return answer;
    }
}