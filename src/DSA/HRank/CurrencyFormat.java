package HRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double val = sc.nextDouble();

        Locale l1 = Locale.US;
        Locale l4 = new Locale("hi", "India");
        Locale l2 = Locale.CHINA;
        Locale l3 = Locale.FRANCE;


        getCurrencyVal(l1 , val);
        getCurrencyVal(l2 , val);
        getCurrencyVal(l3 , val);
        getCurrencyVal(l4 , val);
    }

    public static void getCurrencyVal(Locale locale , double val) {

        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        String currencyFormat = format.format(val);
        System.out.println(locale.getDisplayCountry()+" : "+currencyFormat);
    }
}
