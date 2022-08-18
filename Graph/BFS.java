package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static int n = 7;
    static int[] vis = new int[n];

    public static void bfs(int i, ArrayList<ArrayList<Integer>> a) {
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ar = new ArrayList<>();
        vis[i] = 1;
        q.add(i);
        while (!q.isEmpty()) {
            Integer node = q.poll();
            ar.add(node);
            for (Integer j : a.get(node)) {
                if (vis[j] == 0)
                    vis[j] = 1;
                q.add(i);
            }
        }
        System.out.println(ar);

    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            a.add(new ArrayList<>());
        }
        System.out.println(a);

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

        for (int i = 0; i <= n; i++) {
            if (vis[i] == 0) {
                bfs(i, a);
            }
        }
        System.out.println(Arrays.toString(vis));
    }
}
