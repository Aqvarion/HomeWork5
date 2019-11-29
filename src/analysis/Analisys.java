package analysis;

import java.util.*;

public class Analisys {
    public static void main(String[] args) {
        int size = 10000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Map<Integer,Integer> hashMap = new HashMap<>();
        Map<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        Map<Integer,Integer> treeMap = new TreeMap<>();

        Random r = new Random();
        for(int i= 0;i<size;i++){
            arrayList.add(r.nextInt(size*10));
        }
        linkedList.addAll(arrayList);

        while(hashSet.size()!=size){
            hashSet.add(r.nextInt(size*10));
        }
        linkedHashSet.addAll(hashSet);
        treeSet.addAll(hashSet);


        while(hashMap.size()!=size){
            hashMap.put(r.nextInt(size*10),r.nextInt(size*10));
        }
        linkedHashMap.putAll(hashMap);
        treeMap.putAll(hashMap);

        long startTime;
        long estimatedTime;
        int number = 7;
        int number1 = 9;

        //ArrayList
        System.out.println("ArrayList");
        System.out.println(arrayList);

        startTime=System.nanoTime();
        arrayList.add(number);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("\nTime for add: " + estimatedTime);

        startTime=System.nanoTime();
        arrayList.add(size/2,number1);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Time for insert: " + estimatedTime);

        startTime=System.nanoTime();
        arrayList.remove(size/2);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Time for remove " + estimatedTime+"\n");

        //LinkedList
        System.out.println("LinkedList");
        System.out.println(linkedList);

        startTime=System.nanoTime();
        linkedList.add(number);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("\nTime for add: " + estimatedTime);

        startTime=System.nanoTime();
        linkedList.add(size/2,number1);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Time for insert: " + estimatedTime);

        startTime=System.nanoTime();
        linkedList.remove(size/2);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Time for remove " + estimatedTime+"\n");

        //HashSet
        System.out.println("HashSet");
        System.out.println(hashSet);
        startTime=System.nanoTime();
        hashSet.add(number);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("\nTime for add: " + estimatedTime);

        startTime=System.nanoTime();
        hashSet.remove(size/2);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Time for remove " + estimatedTime+"\n");

        //LinkedHashSet
        System.out.println("LinkedHashSet");
        System.out.println(linkedHashSet);

        startTime=System.nanoTime();
        linkedHashSet.add(number);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("\nTime for add: " + estimatedTime);

        startTime=System.nanoTime();
        linkedHashSet.remove(size/2);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Time for remove " + estimatedTime+"\n");

        //TreeSet
        System.out.println("TreeSet");
        System.out.println(treeSet);

        startTime=System.nanoTime();
        treeSet.add(number);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("\nTime for add: " + estimatedTime);

        startTime=System.nanoTime();
        treeSet.remove(size/2);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Time for remove " + estimatedTime+"\n");


        System.out.println(hashMap);
        System.out.println(linkedHashMap);
        System.out.println(treeMap);




    }
}
