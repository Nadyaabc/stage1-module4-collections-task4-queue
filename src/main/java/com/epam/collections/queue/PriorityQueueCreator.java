package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> result = new PriorityQueue<>(Comparator.reverseOrder());

        List<String> newList = new ArrayList<>(firstList);
        newList.addAll(secondList);
        result.addAll(newList);
        return result;
    }
}
