public import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<ArrayList<Integer>> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int totalOrange = 0;
        int freshOrange = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                totalOrange++;
                if (grid[i][j] == 2) {
                    ArrayList<Integer> newarr = new ArrayList<>();
                    newarr.add(i);
                    newarr.add(j);
                    q.add(newarr);
                }
                if (grid[i][j] == 1) {
                    freshOrange++;
                }
            }
        }

        if (freshOrange == 0) {
            return 0;
        }

        int rottenOranges = 0;
        int time = 0;
        ArrayList<Integer> currentarr = new ArrayList<Integer>();
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!q.isEmpty()) {
            int levelSize = q.size(); // Number of oranges in the current level

            for (int i = 0; i < levelSize; i++) {
                currentarr = q.poll();
                int x = currentarr.get(0);
                int y = currentarr.get(1);

                // Check neighboring cells
                for (int[] dir : directions) {
                    int newX = x + dir[0];
                    int newY = y + dir[1];

                    if (newX >= 0 && newX < n && newY >= 0 && newY < m && grid[newX][newY] == 1) {
                        freshOrange--;
                        grid[newX][newY] = 2;
                        ArrayList<Integer> newarr = new ArrayList<>();
                        newarr.add(newX);
                        newarr.add(newY);
                        q.add(newarr);
                    }
                }
            }

            // If there are more oranges to rot, increment time
            if (!q.isEmpty()) {
                time++;
            }
        }

        return freshOrange == 0 ? time : -1;
    }
}
