package Tp;

public class PrintHelloWorldWithoutSemiColon {

    public static void main(String args []) {

        if(System.out.printf("Hello World") == null ){}

        if(System.out.append("Hello World") == null) {}

        if(System.out.append("Hello World").equals(null)) {}

        for (int i = 0; i < 5; System.out.println("Hello World")) {
            i++;
        }


    }
}
