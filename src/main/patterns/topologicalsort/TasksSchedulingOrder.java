package main.patterns.topologicalsort;

import java.util.*;
// Time: O(V+E)
// Space: O(V+E)
public class TasksSchedulingOrder {

    public List<Integer> findOrder(int tasks, int[][] prerequisites) {

        if (tasks == 0) {
            return new ArrayList<>();
        }

        // initialization
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        HashMap<Integer, Integer> inDegrees = new HashMap<>();
        for (int i = 0; i < tasks; i++) {
            graph.put(i, new ArrayList<>());
            inDegrees.put(i, 0);
        }

        // populate
        for (int[] prerequisite : prerequisites) {
            int parent = prerequisite[0], child = prerequisite[1];
            graph.get(parent).add(child);
            inDegrees.put(child, inDegrees.get(child) + 1);
        }

        Queue<Integer> taskQueue = new LinkedList<>();
        for (Map.Entry<Integer, Integer> source : inDegrees.entrySet()) {
            if (source.getValue() == 0) {
                taskQueue.add(source.getKey());
            }
        }

        List<Integer> sortedOrder = new ArrayList<>();
        while (!taskQueue.isEmpty()) {
            int currentTask = taskQueue.poll();
            sortedOrder.add(currentTask);
            List<Integer> subTasks = graph.get(currentTask);
            for (int task : subTasks) {
                inDegrees.put(task, inDegrees.get(task) - 1);
                if (inDegrees.get(task) == 0) {
                    taskQueue.add(task);
                }
            }
        }

        if (sortedOrder.size() != tasks) {
            return new ArrayList<>();
        }

        return sortedOrder;

    }

}
