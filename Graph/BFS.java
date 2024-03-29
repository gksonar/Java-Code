package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static ArrayList<Integer> bfs(int i, ArrayList<ArrayList<Integer>> a) {
        boolean[] vis = new boolean[i + 1];
        ArrayList<Integer> ar = new ArrayList<>();
        for (int j = 1; j <= i; j++) {
            if (vis[i] == false) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;
                while (!q.isEmpty()) {
                    int node = q.poll();
                    ar.add(node);
                    for (int it : a.get(node)) {
                        if (vis[it] == false) {
                            vis[it] = true;
                            q.add(it);
                        }
                    }
                }
                // System.out.println(Arrays.toString(vis));
            }
        }

        return ar;
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
        System.out.println(bfs(n, a));
    }
}
