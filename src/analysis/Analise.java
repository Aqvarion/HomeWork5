package analysis;

import java.util.*;

public class Analise {
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

        //ArrayList
        System.out.println("ArrayList");
        System.out.println(arrayList);

        startTime=System.nanoTime();
        arrayList.add(7);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("\nTime for add: " + estimatedTime);

        startTime=System.nanoTime();
        arrayList.add(size/2,9);
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
        linkedList.add(7);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("\nTime for add: " + estimatedTime);

        startTime=System.nanoTime();
        linkedList.add(size/2,9);
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
        hashSet.add(7);
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
        linkedHashSet.add(7);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("\nTime for add: " + estimatedTime);

        startTime=System.nanoTime();
        linkedHashSet.remove(size/2);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Time for remove " + estimatedTime+"\n");

        //TreeSet
        System.out.println("TreeSet");
        System.out.println(treeSet);

        int temp;
        do {
            temp =r.nextInt(size*10);
        } while (hashMap.containsValue(temp)==false);
        startTime=System.nanoTime();
        treeSet.add(temp);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("\nTime for add: " + estimatedTime+ treeSet.size());

        startTime=System.nanoTime();
        treeSet.remove(size/2);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Time for remove " + estimatedTime+"\n");

        //HashMap
        System.out.println("HashMap");
        System.out.println(hashMap);


        startTime=System.nanoTime();
        hashMap.put(temp,7);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("\nTime for add: " + estimatedTime);


        startTime=System.nanoTime();
        hashMap.remove(size/2);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Time for remove " + estimatedTime+"\n");

        //LinkedHashMap
        System.out.println("LinkedHashMap");
        System.out.println(linkedHashMap);

        startTime=System.nanoTime();
        linkedHashMap.put(temp,7);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("\nTime for add: " + estimatedTime);


        startTime=System.nanoTime();
        linkedHashMap.remove(size/2);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Time for remove " + estimatedTime+"\n");

        //TreeMap
        System.out.println("TreeMap");
        System.out.println(treeMap);

        startTime=System.nanoTime();
        treeMap.put(temp,7);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("\nTime for add: " + estimatedTime);


        startTime=System.nanoTime();
        treeMap.remove(size/2);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Time for remove " + estimatedTime+"\n");


    }
}
