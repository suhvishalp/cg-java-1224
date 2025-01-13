
public class MaximumPassengers2 {

	public static int maxPassengers(int[][] mat) {
        int n = mat.length;
        boolean[][] visited = new boolean[n][n]; // To mark visited cells
        int passengers = 0;

        // Forward traversal: (0,0) to (n-1,n-1)
        passengers += traverse(mat, visited, 0, 0, n - 1, n - 1, true);

        // Reset visited array for return traversal
        visited = new boolean[n][n];

        // Return traversal: (n-1,n-1) to (0,0)
        passengers += traverse(mat, visited, n - 1, n - 1, 0, 0, false);

        return passengers;
    }

    private static int traverse(int[][] mat, boolean[][] visited, int startX, int startY, int endX, int endY, boolean isForward) {
        int n = mat.length;
        int passengers = 0;

        // Initialize starting position
        int i = startX, j = startY;

        while (i != endX || j != endY) {
            // Pick up passenger if present and not yet visited
            if (!visited[i][j] && mat[i][j] == 1) {
                passengers++;
                mat[i][j] = 0; // Mark passenger as picked up
            }
            visited[i][j] = true;

            // Move based on direction (forward: right/down, return: left/up)
            if (isForward) {
                if (j + 1 < n && mat[i][j + 1] != -1 && !visited[i][j + 1]) {
                    j++; // Move right
                } else if (i + 1 < n && mat[i + 1][j] != -1 && !visited[i + 1][j]) {
                    i++; // Move down
                } else {
                    break; // No valid forward path
                }
            } else {
                if (j - 1 >= 0 && mat[i][j - 1] != -1 && !visited[i][j - 1]) {
                    j--; // Move left
                } else if (i - 1 >= 0 && mat[i - 1][j] != -1 && !visited[i - 1][j]) {
                    i--; // Move up
                } else {
                    break; // No valid return path
                }
            }
        }

        // Check the last cell
        if (!visited[i][j] && mat[i][j] == 1) {
            passengers++;
            mat[i][j] = 0;
        }

        return passengers;
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
