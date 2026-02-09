package dev.codecounty.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String... args) {


        int[] nums = {56, 45, 878, 5, 6};

        // All the collections accept only Object type
        ArrayList list = new ArrayList();
        list.add(56);
        list.add("Hey");
        list.add(8.2);
        list.add(true);

        System.out.println(list);


        ArrayList<Integer> listOfNums = new ArrayList<>();
        listOfNums.add(56);
        listOfNums.add(45);
        listOfNums.add(878);
        listOfNums.add(5);
//        listOfNums.add(6.9);
        System.out.println(listOfNums);//[56, 45, 878, 5]


        listOfNums.remove(2);//[56, 45, 5]
        System.out.println(listOfNums);

        listOfNums.add(null);
        System.out.println(listOfNums);
        listOfNums.set(2, 69);
        System.out.println(listOfNums);


        listOfNums.add(2, 699);
        System.out.println(listOfNums);

//      for i
        for (int i = 0; i < listOfNums.size(); i++) {
//            listOfNums.add(11);
            System.out.print(listOfNums.get(i) + " ");
        }
        System.out.println();

//        for each
        for (Integer num : listOfNums) {
//            listOfNums.add(11);
            System.out.print(num + " ");
        }
        System.out.println();

//        3. Using iterator
        Iterator<Integer> iterator = listOfNums.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }
        System.out.println();

//        TODO 1 Research on looping from last to first in listOfNums


        listOfNums.removeLast();
        System.out.println("Streams");
        listOfNums.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

//        if(listOfNums.stream().anyMatch(x -> x % 2 == 0)) System.out.println("Found");


        if (listOfNums.isEmpty()) {
            System.out.println("Empty");

        }

        System.out.println("First and last");
        System.out.println(listOfNums.get(0));
        System.out.println(listOfNums.get(listOfNums.size() - 1));

        System.out.println(listOfNums.getFirst());
        System.out.println(listOfNums.getLast());

        List<Integer> list2 = List.of(54, 65, 56, 4, 435);
//        list2.add(5);
//
        listOfNums.addAll(list2);//TODO 2 See how you can truly merge two lists
        System.out.println(listOfNums);

//        System.out.println(listOfNums);
//        listOfNums.retainAll(list2);
        System.out.println(listOfNums);
        listOfNums.clear();
    }
}
