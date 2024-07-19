package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        if (!firstQueue.isEmpty()) {
            arrayDeque.add(firstQueue.poll());
            if (!firstQueue.isEmpty()) arrayDeque.add(firstQueue.poll());
        }
        if (!secondQueue.isEmpty()) {
            arrayDeque.add(secondQueue.poll());
            if (!secondQueue.isEmpty()) arrayDeque.add(secondQueue.poll());
        }

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            System.out.println(arrayDeque);
            firstQueue.add(arrayDeque.poll());
            if (!firstQueue.isEmpty()) {
                arrayDeque.add(firstQueue.poll());
                if (!firstQueue.isEmpty()) arrayDeque.add(firstQueue.poll());
            } secondQueue.add(arrayDeque.poll());
            if (!secondQueue.isEmpty()) {
                arrayDeque.addLast(secondQueue.poll());
                if (!secondQueue.isEmpty()) arrayDeque.add(secondQueue.poll());
            }
        } System.out.println(arrayDeque);

        return arrayDeque;

    }

}
