package dev.codecounty.collections.queue;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class NThLargetElement {

    public static void main(String[] args) {

        List<Integer> nums = List.of(45, 46, 3, 51531, 13, 31, 1, 12, 31, 46, 46, 416, 6412, 31, -67);
        int n = 4;

        HashSet<Integer> set = new HashSet<>(nums);
        if (set.size() < n) {
            System.out.println("Invalid input");
            return;
        } else {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            pq.addAll(set);

            for (int i = 1; i <= n - 1; i++) {
                pq.poll();
            }
            System.out.println(pq.peek());


        }

    }
}
