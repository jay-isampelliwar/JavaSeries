package DSA.strings;

public class IntToRoman {
    public static void main(String[] args) {

    }


}

class Solution {

    private Number[] numbers = {
            new Number(1000, "M"),
            new Number(900, "CM"),
            new Number(500, "D"),
            new Number(400, "CD"),
            new Number(100, "C"),
            new Number(90, "XC"),
            new Number(50, "L"),
            new Number(40, "XL"),
            new Number(10, "X"),
            new Number(9, "IX"),
            new Number(5, "V"),
            new Number(4, "IV"),
            new Number(1, "I"),

    };

//    public String convertToRoman(int n) {
//
//        String res = "";
//
//        for (Number num : numbers) {
//            int numberOfSymbols = n / num.value;
//            if (numberOfSymbols != 0) {
//                res += num.symbol.repeat(numberOfSymbols);
//                n %= num.value;
//            }
//        }
//    }


    class Number {
        private String symbol;
        private int value;

        public Number(int value, String symbol) {
            this.value = value;
            this.symbol = symbol;
        }
    }
}
