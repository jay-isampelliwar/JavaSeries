package DoublelyList;

public class Main {

    public static void main(String[] args) {

        DoublelyList list = new DoublelyList();
        list.add(55);



        list.print();
        System.out.println();

        list.reverseList();
        list.printFormTail();
    }
}
