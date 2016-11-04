package sort;

public class Pas {
    public static int[][] pascalTriangle(int n) {
        int[][] pt = new int[n][];

        for (int i = 0; i < n; i++) {
          pt[i] = new int[i + 1];                            // Construct row i.
          pt[i][0] = 1;                              // Leftmost value of row i.
          for (int j = 1; j < i; j++) {
            pt[i][j] = pt[i - 1][j - 1] + pt[i - 1][j];  // Sum 2 entries above.
          }
          pt[i][i] = 1;                             // Rightmost value of row i.
        }
        return pt;
      }
   
    
    public static void main(String[] args) {
        int pt[][] = Pas.pascalTriangle(6);
        for(int i = 0; i < 6; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(pt[i][j]);
            }
        }        
    }

}
