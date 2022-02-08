/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int[][] grid = new int[m][n];
        int mines = 0;
        for (int i = 0; i < m && mines < k; i++) {
            for (int j = 0; j < n && mines < k; j++) {
                double r = Math.random();
                if (r < 1.04 * ((double) k / ((double) m * (double) n))) {
                    grid[i][j] = 101;
                    mines += 1;
                }
            }
        }
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (grid[i][j] > 100) {
                    grid[i + 1][j] += 1;
                    grid[i - 1][j] += 1;
                    grid[i][j + 1] += 1;
                    grid[i][j - 1] += 1;
                    grid[i + 1][j + 1] += 1;
                    grid[i + 1][j - 1] += 1;
                    grid[i - 1][j + 1] += 1;
                    grid[i - 1][j - 1] += 1;
                }
            }
        }
        if (grid[0][0] > 100) {
            grid[0][1] += 1;
            grid[1][0] += 1;
            grid[1][1] += 1;
        }
        if (grid[m - 1][0] > 100) {
            grid[m - 1][1] += 1;
            grid[m - 2][0] += 1;
            grid[m - 2][1] += 1;
        }
        if (grid[0][n - 1] > 100) {
            grid[0][n - 2] += 1;
            grid[1][n - 1] += 1;
            grid[1][n - 2] += 1;
        }
        if (grid[m - 1][n - 1] > 100) {
            grid[m - 1][n - 2] += 1;
            grid[m - 2][m - 2] += 1;
            grid[m - 2][n - 2] += 1;
        }
        for (int i = 1; i < n - 1; i++) {
            if (grid[0][i] > 100) {
                grid[0][i + 1] += 1;
                grid[0][i - 1] += 1;
                grid[1][i] += 1;
                grid[1][i + 1] += 1;
                grid[1][i - 1] += 1;
            }
        }
        for (int i = 1; i < n - 1; i++) {
            if (grid[m - 1][i] > 100) {
                grid[m - 1][i + 1] += 1;
                grid[m - 1][i - 1] += 1;
                grid[m - 2][i] += 1;
                grid[m - 2][i + 1] += 1;
                grid[m - 2][i - 1] += 1;
            }
        }
        for (int i = 1; i < m - 1; i++) {
            if (grid[i][0] > 100) {
                grid[i + 1][0] += 1;
                grid[i - 1][0] += 1;
                grid[i][1] += 1;
                grid[i + 1][1] += 1;
                grid[i - 1][1] += 1;
            }
        }
        for (int i = 1; i < m - 1; i++) {
            if (grid[i][n - 1] > 100) {
                grid[i + 1][n - 1] += 1;
                grid[i - 1][n - 1] += 1;
                grid[i][n - 2] += 1;
                grid[i + 1][n - 2] += 1;
                grid[i - 1][n - 2] += 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 100) System.out.print("*  ");
                else System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
