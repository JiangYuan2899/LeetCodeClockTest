package google;
import java.util.*;

public class TestGoole {
	
    static class Coordinates {
        int x, y;

        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int[][] dist;

    public static boolean isValid(int i, int j) {
        int m = dist.length, n = dist[0].length;
        return i >= 0 && i < m && j >= 0 && j < n && dist[i][j] == -1;
    }

    public static boolean check(int len, char[][] grid) {

        int m = grid.length, n = grid[0].length;
        Queue<Coordinates> que = new LinkedList<>();
        //初始化dist距离矩阵，将格网中值为'1'的坐标添加进队列,O(m*n)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    dist[i][j] = 0;
                    que.add(new Coordinates(i, j));
                } else
                    dist[i][j] = -1;
            }
        }

        //将路径长度为len以内的格点坐标添加进队列,O(m*n)
        while (!que.isEmpty()) {
            Coordinates tmp = que.poll();
            int x = tmp.x, y = tmp.y;
            if (dist[x][y] == len)
                continue;
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    if (Math.abs(dx + dy) == 1 && isValid(x + dx, y + dy)) {
                        dist[x + dx][y + dy] = dist[x][y] + 1;
                        que.add(new Coordinates(x + dx, y + dy));
                    }
                }
            }
        }

        //对于没有在队列中的格点坐标得到他们的外包正方形,O(m*n)
        int minSum = Integer.MAX_VALUE, maxSum = Integer.MIN_VALUE, minSub = Integer.MAX_VALUE, maxSub = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dist[i][j] == -1) {
                    minSum = Math.min(minSum, i + j);
                    minSub = Math.min(minSub, i - j);
                    maxSum = Math.max(maxSum, i + j);
                    maxSub = Math.max(maxSub, i - j);
                }
            }
        }

        if (minSum == Integer.MAX_VALUE)
            return true;

        //寻找合适的坐标使得上面的格点都在len距离以内
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '0') {
                    int sum = Math.max(Math.abs(i + j - minSum), Math.abs(i + j - maxSum));
                    int sub = Math.max(Math.abs(i - j - minSub), Math.abs(i - j - maxSub));
                    if (Math.max(sum, sub) <= len)
                        return true;
                }
            }
        }
        return false;

    }

	    public static void main(String[] args) {

	        Scanner in = new Scanner(System.in);

	        int T = in.nextInt();

	        for (int n = 1; n <= T; n++) {

	            int rows = in.nextInt();
	            int cols = in.nextInt();

	            char[][] grid = new char[rows][cols];
	            dist = new int[rows][cols];

	            for (int i = 0; i < rows; i++) {
	                grid[i] = in.next().toCharArray();
	            }
	            int l = 0, r = rows + cols;
	            while (l < r) {

	                int mid = (r - l) / 2 + l;
	                if (check(mid, grid))
	                    r = mid;
	                else
	                    l = mid + 1;
	            }
	            System.out.println("Case #" + n + ": " + l);
	        }

	    }


}
