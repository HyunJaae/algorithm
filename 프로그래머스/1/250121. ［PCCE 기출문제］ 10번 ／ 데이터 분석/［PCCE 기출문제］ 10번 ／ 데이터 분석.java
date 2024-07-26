import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int colExt = getIdx(ext);
        int colSortBy = getIdx(sort_by);

        return Arrays.stream(data)
                .filter(datum -> datum[colExt] < val_ext)
                .sorted(Comparator.comparingInt(a -> a[colSortBy]))
                .collect(Collectors.toList())
                .toArray(new int[0][0]);
    }
    
    private int getIdx(String str) {
        switch (str) {
            case "code":
                return 0;
            case "date":
                return 1;
            case "maximum":
                return 2;
            case "remain":
                return 3;
        }
        return 0;
    }
}