package sort;

public class Prime {
    public static void solution(int n) {
        boolean [] prime = new boolean [n+1];
        for(int i = 0; i <= n; i++) {
            prime[i] = true;
        }
        for(int d = 2; d*d <= n; d++){
            if(prime[d]){
                for(int t = 2*d; t <= n; t= t + d){
                    prime[t] = false;
                }
            }
        }
        for(int j = 0; j <= n; j++){
            if(prime[j]){
                System.out.println(j);
            }
        }
    }
   
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       Prime.solution(450);
        
    }

}
