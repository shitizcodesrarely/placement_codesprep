import java.util.*;

public class Maximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<max;i++){
            int num = sc.nextInt();
            max = Math.max(num,max);
        }
    }
    
}
