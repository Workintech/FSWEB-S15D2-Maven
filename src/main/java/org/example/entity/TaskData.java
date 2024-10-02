package org.example.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name){
        switch (name){
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;
            case "carol":
                return carolsTasks;
            case "all":
                Set<Task> allTasks = new HashSet<>();
                allTasks.addAll(annsTasks);
                allTasks.addAll(bobsTasks);
                allTasks.addAll(carolsTasks);
                allTasks.addAll(unassignedTasks);
                return allTasks;
            default:
                return new HashSet<>();
        }
    }

    public Set<Task> getUnion(Set<Task>... sets) {
        Set<Task> unionSet = new HashSet<>();
        for (Set<Task> set : sets) {
            unionSet.addAll(set);
        }
        return unionSet;
    }

    public Set<Task> getIntersection(Set<Task> tasks1, Set<Task> tasks2) {
        Set<Task> intersectingTasks = new HashSet<>(tasks1);
        intersectingTasks.retainAll(tasks2);
        return intersectingTasks;
    }

    public Set<Task> getDifferences(Set<Task> tasks1, Set<Task> tasks2) {
        Set<Task> differentTasks = new HashSet<>(tasks1);
        differentTasks.removeAll(tasks2);
        return differentTasks;
    }




}
