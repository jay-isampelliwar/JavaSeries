package Heap;

public class Main  {

    public  static void main(String args[]) {

        MyHeap p = new MyHeap();

        p.insert(44);
        p.insert(44);
        p.insert(44);
        p.insert(0);
        p.insert(10);
        p.insert(10);
        p.insert(5);
        p.insert(-3);
        p.insert(194);
        p.insert(194);
        p.insert(14);
        p.insert(93);
        p.insert(1);
        p.insert(1);
        p.insert(-739);
        p.insert(-739);
        p.insert(-739);

        p.sortHeap();

    }
}
