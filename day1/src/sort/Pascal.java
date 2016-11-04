package sort;

public class Pascal {
    public static int[][] solution(int n){
        int[][] pt = new int[n][n];
        pt[0][0] = 1;
        for(int i = 1; i < n; i++){
            pt[i][0] = 1;
            for(int j = 1; j < i; j++){
                pt[i][j] = pt[i-1][j-1] + pt[i-1][j];
            }
         pt[i][i] = 1;
        }
        
        
        
        return pt;
    }
    public static void main(String[] args) {
      int pt[][] = Pascal.solution(6);
      for(int i = 0; i < 6; i++){
          for(int j = 0; j <= i; j++){
              System.out.print(pt[i][j]);
          }
          System.out.println();
      }

    }

}
