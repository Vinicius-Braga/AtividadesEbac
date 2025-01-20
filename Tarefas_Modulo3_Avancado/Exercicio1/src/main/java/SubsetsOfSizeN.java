import java.util.ArrayList;
import java.util.List;

public class SubsetsOfSizeN {
    public static List<List<Integer>> subsetsOfSizeN(int[] S, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), S, n, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> path, int[] S, int n, int start) {
        if (path.size() == n) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < S.length; i++) {
            path.add(S[i]);
            backtrack(result, path, S, n, i + 1);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] S1 = {1, 2, 3};
        int n1 = 2;
        System.out.println(subsetsOfSizeN(S1, n1));  // Saída: [[1, 2], [1, 3], [2, 3]]

        int[] S2 = {1, 2, 3, 4};
        int n2 = 1;
        System.out.println(subsetsOfSizeN(S2, n2));  // Saída: [[1], [2], [3], [4]]
    }
}
