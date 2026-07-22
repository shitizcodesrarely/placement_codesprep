import java.util.*;
public class StepPermission {
    static int [] dp = new int[37];

    static int solve(int n){
        if(n == 0)System.out.print(1);
        if(n == 1)System.out.print(2);
        if(n == 2)System.out.print(3);

        if(dp[n] != -1)System.out.print(dp[n]);

        dp[n] = solve(n-1) + solve(n - 2) + solve(n-3);

        System.out.print(dp[n]);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Arrays.fill(dp,-1);
        int n = sc.nextInt();

        System.out.println(solve(n));
    }
    
}
