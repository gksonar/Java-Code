package Graph;

import java.util.ArrayList;

public class DFS {
    public static ArrayList<Integer> dfs(int i, ArrayList<ArrayList<Integer>> a) {
        boolean vis[] = new boolean[i + 1];
        ArrayList<Integer> ans = new ArrayList<>();
        dfsofG(i, a, vis, ans);
        return ans;
    }

    public static void dfsofG(int v, ArrayList<ArrayList<Integer>> a, boolean vis[], ArrayList<Integer> ans) {
        vis[v] = true;
        ans.add(v);
        for (Integer neighbor : a.get(v)) {
            if (!vis[neighbor]) {
                dfsofG(neighbor, a, vis, ans);
            }
        }
    }

    public static void main(String[] args) {
        int n = 7;
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            a.add(new ArrayList<>());
        }
        // System.out.println(a);

        a.get(1).add(2);
        a.get(2).add(1);

        a.get(2).add(3);
        a.get(3).add(2);

        a.get(2).add(7);
        a.get(7).add(2);

        a.get(3).add(5);
        a.get(5).add(3);

        a.get(4).add(6);
        a.get(6).add(4);

        a.get(5).add(7);
        a.get(7).add(5);

        for (int i = 0; i <= n; i++) {
            System.out.print("List: " + i + "------");
            for (int j = 0; j < a.get(i).size(); j++) {
                System.out.print(a.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(dfs(1, a));
    }
}
