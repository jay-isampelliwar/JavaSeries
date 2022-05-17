package Arrays;

public class StockBuySell {

    public static  void  main (String args []) {

        int ar [] = {3,1,4,8,7,2,5,101};

        int minSoFor = ar[0];
        int maxProfit = 0;

        for(int i = 0; i < ar.length; i++) {

            if (minSoFor > ar[i]) minSoFor = ar[i];

            int profit = ar[i] - minSoFor;

            if (profit > maxProfit) maxProfit = profit;

        }

        System.out.println(maxProfit);
    }
}
