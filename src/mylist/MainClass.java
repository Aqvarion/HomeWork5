package mylist;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.add(13);
        myLinkedList.add(15);
        myLinkedList.add(66);
        myLinkedList.add(88);
        myLinkedList.add(88);
        myLinkedList.add(99);
        System.out.println(myLinkedList);
        myLinkedList.add(2,91);
        System.out.println(myLinkedList);
        myLinkedList.set(4,7);
        System.out.println(myLinkedList);
        System.out.println("Element 66: "+myLinkedList.indexOf(66));
        System.out.println("Get 3: "+myLinkedList.get(3));
        myLinkedList.remove(2);
        System.out.println("Remove element of index 2: "+myLinkedList);



        System.out.println("Array: "+Arrays.toString(myLinkedList.toArray()));
        System.out.println("Size: "+myLinkedList.size());

        System.out.print("Work of iterator: ");
        for (Object k: myLinkedList) {System.out.print(k+" ");}


        myLinkedList.clear();
        System.out.println("\n"+myLinkedList);
    }
}
