import java.util.*;

public class Car{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int one = 0,two = 0,three = 0,four = 0;

        for(int i = 0;i<n;i++){
            int s = sc.nextInt();
            if(s == '1')one++;
            else if(s == '2' )two++;
            else if(s == '3')three++;
            else four++;

        }
        int gaadi = 0;

        gaadi += four;
        gaadi += three;
        one = Math.max(0,one - three);
        gaadi += two/2;
        two = two % 2;

        if(two == '1'){
            gaadi++;
            one = Math.max(0,one - 2);
        }
        gaadi += (one + 3)/4;

        System.out.print(gaadi);

    }
}