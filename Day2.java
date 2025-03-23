//Pascals Triangle
import java.util.Scanner;
public class Day2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("value of n");
        int n = s.nextInt();
        int pascal[][]  =  new int[n][n];
        for (int i=0;i<n;i++){
            for(int k=0;k<n-i;k++){
                        System.err.print(" ");}
                for (int j=0;j<=i;j++){
                    
                    
                    if(j==0||j==i){
                        pascal[i][j]=1;
                    }
                    else{
                        pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
                        
                    }
                    System.out.print(pascal[i][j]);
                    System.out.print(" ");

                }System.out.println();
        }

        
    }}
