//Armstrong no
import java.util.*;
public class Day3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=n;
        int pow=0;
        while(a>0){
         a=a/10;
         pow++;
        }
        a=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            int mul=1;
            for (int i=0;i<pow;i++){
                mul=mul*r;                 
            }
            sum=sum+mul;
        n=n/10;
        }
        if(sum==a){
            System.out.println("Armstrong no");
        }
        else{
            System.out.println("Not a Armstrong no");
        }
    }
}