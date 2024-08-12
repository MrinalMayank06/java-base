public class knapsackalgo1 {
public static int knapsack(int capacity, int [] weightd, int [] values, int n){
    int[][] dp = new int [n+1] [capacity+1];

    for (int i = 0; i<= n ; i++){
        for (int w = 0; w <= capacity; w++){
            if (i==0 || w==0);
            else if (weightd[i-1]<= w)
                dp[i][w] = Math.max(values[i-1]+dp[i-1][w-weightd[i-1]],dp[i-1][w]);
        else
            dp[i][w] = dp[i- 1][w];
        }
    }
    return dp[n][capacity];
}

    public static void main(String[] args) {
        int[]  valus = {60,100,120};
        int[] weight = {10, 20 , 30 };
        int capacity  = 50;
int n = valus.length;


System.out.println("maximum value that can be obtained is :  "+knapsack(capacity,weight,valus,n));
}
}
