package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i < numberOfDishes + 1; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 1; i < everyDishNumberToEat; i++) {
                queue.add(queue.poll());
            }
            list.add(queue.poll());
        }

        return list;
    }
}
