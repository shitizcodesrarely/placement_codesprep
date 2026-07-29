import java.util.*;
public class AndyLongestVacation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        boolean [] obllegations = new boolean[N + 1];

        for(int i = 0;i<M;i++){
            int day = sc.nextInt();
            obllegations[day] = true;
        }
        int count = 0;
        int left = 1;
        int ans = 0;

        for(int right = 1;right<=N;right++){
            if(obllegations[right]){
                right++;
            }
            while(count > K){
                if(obllegations[left]){
                    count--;
                    left++;
                }
            }
            ans = Math.max(ans,right - left + 1);

        }
        System.out.print(ans);


        
    }
}