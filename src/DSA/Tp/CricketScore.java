package Tp;

import java.util.Scanner;

public class CricketScore {

    public static void main (String args []) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Overs : ");
        int Overs = sc.nextInt();
        System.out.println("\n\n");


        if (Overs != 10 && Overs != 20 && Overs != 50){ throw new Exception("Only 10 / 20 / 50 Over Match is allow"); }

        switch (Overs) {

            case 10:
                Over10(Overs);
                displayResult();
                break;
            case 20:
                Over20(Overs);
                displayResult();
                break;
            case 50:
                Over50(Overs);
                displayResult();
                break;

        }

    }

    private static long totalRuns = 0;
    private static int totalOver = 0;
    private static double numberOfBalls = 0;
    private static int countWickets = 0;

    private static void Over10(int Overs) {

        for (int i = 1; i <= Overs*6; i++) {

            numberOfBalls += 0.1;

            int wicket = (int)(Math.random()*11);

            if (wicket == 10) countWickets++;
            if(countWickets == 10) break;
            if (numberOfBalls == 0.6) {

                totalOver++;
                numberOfBalls = 0.0;
            }

            int run = (int)((Math.random()*7)/ 1.1);
            if(run != 5) totalRuns += run;
        }
    }
    private static void Over20(int Overs) {

        for (int i = 1; i <= Overs*6; i++) {

            numberOfBalls += 0.1;

            int wicket = (int)(Math.random()*20);

            if (wicket == 10) countWickets++;
            if(countWickets == 10) break;
            if (numberOfBalls == 0.6) {

                totalOver++;
                numberOfBalls = 0.0;
            }

            int run = (int)((Math.random()*7) / 2);
            if(run != 5) totalRuns += run;
        }
    }
    private static void Over50(int Overs) {

        for (int i = 1; i <= Overs*6; i++) {

            numberOfBalls += 0.1;

            int wicket = (int)(Math.random()*30);

            if (wicket == 10) countWickets++;
            if(countWickets == 10) break;
            if (numberOfBalls == 0.6) {

                totalOver++;
                numberOfBalls = 0.0;
            }

            int run = (int)((Math.random()*7) / 2.3);
            if(run != 5) totalRuns += run;
        }
    }
    private static void displayResult () {

        System.out.println("\tScorecard\n");
        System.out.println(totalRuns+"/"+countWickets);
        if (countWickets == 10) System.out.println("Over : "+totalOver);
        else System.out.println("Over : "+(int)totalOver);

    }
}
