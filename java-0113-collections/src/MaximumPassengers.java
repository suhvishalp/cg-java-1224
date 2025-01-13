import java.util.Scanner;

public class MaximumPassengers {
	
	 public static int maxPassengers(int[][] mat) {
	        int n = mat.length; // Size of the matrix
	        int passengers = 0;

	        // Check if there's a valid path from (0,0) to (n-1,n-1)
	        if (!isPathValid(mat, 0, 0, n - 1, n - 1, true)) {
	            return 0; // No valid forward path
	        }

	        // Forward traversal: (0,0) to (n-1,n-1)
	        passengers += traverse(mat, 0, 0, n - 1, n - 1, true);

	        // Check if there's a valid path from (n-1,n-1) to (0,0)
	        if (!isPathValid(mat, n - 1, n - 1, 0, 0, false)) {
	            return passengers; // Return only forward passengers
	        }

	        // Return traversal: (n-1,n-1) to (0,0)
	        passengers += traverse(mat, n - 1, n - 1, 0, 0, false);

	        return passengers;
	    }

	    private static int traverse(int[][] mat, int startX, int startY, int endX, int endY, boolean isForward) {
	        int n = mat.length;
	        boolean[][] visited = new boolean[n][n];
	        int passengers = 0;
	        int i = startX, j = startY;

	        while (i != endX || j != endY) {
	            // Collect passenger if present
	            if (!visited[i][j] && mat[i][j] == 1) {
	                passengers++;
	                mat[i][j] = 0; // Mark as picked up
	            }
	            visited[i][j] = true;

	            // Forward movement: right/down
	            if (isForward) {
	                if (j + 1 < n && mat[i][j + 1] != -1 && !visited[i][j + 1]) {
	                    j++; // Move right
	                } else if (i + 1 < n && mat[i + 1][j] != -1 && !visited[i + 1][j]) {
	                    i++; // Move down
	                } else {
	                    break; // No valid path forward
	                }
	            } 
	            // Return movement: left/up
	            else {
	                if (j - 1 >= 0 && mat[i][j - 1] != -1 && !visited[i][j - 1]) {
	                    j--; // Move left
	                } else if (i - 1 >= 0 && mat[i - 1][j] != -1 && !visited[i - 1][j]) {
	                    i--; // Move up
	                } else {
	                    break; // No valid path backward
	                }
	            }
	        }

	        // Check last cell
	        if (!visited[i][j] && mat[i][j] == 1) {
	            passengers++;
	            mat[i][j] = 0; // Mark as picked up
	        }

	        return passengers;
	    }

	    private static boolean isPathValid(int[][] mat, int startX, int startY, int endX, int endY, boolean isForward) {
	        int n = mat.length;
	        boolean[][] visited = new boolean[n][n];
	        return dfs(mat, visited, startX, startY, endX, endY, isForward);
	    }

	    private static boolean dfs(int[][] mat, boolean[][] visited, int x, int y, int endX, int endY, boolean isForward) {
	        if (x < 0 || y < 0 || x >= mat.length || y >= mat.length || visited[x][y] || mat[x][y] == -1) {
	            return false;
	        }
	        if (x == endX && y == endY) {
	            return true;
	        }
	        visited[x][y] = true;

	        // Forward movement: right/down
	        if (isForward) {
	            return dfs(mat, visited, x, y + 1, endX, endY, isForward) || dfs(mat, visited, x + 1, y, endX, endY, isForward);
	        } 
	        // Return movement: left/up
	        else {
	            return dfs(mat, visited, x, y - 1, endX, endY, isForward) || dfs(mat, visited, x - 1, y, endX, endY, isForward);
	        }
	    }

	    public static void main(String[] args) {
	        int[][] mat = {
	            {0, 0, 1, 1},
	            {-1, 1, 0, -1},
	            {1, 0, 1, 1},
	            {-1, 0, 1, 0}
	        };

	        System.out.println("Maximum Passengers Collected: " + maxPassengers(mat)); 
	    }
	    
}

