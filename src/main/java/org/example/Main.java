package org.example;

import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.StringSet;
import org.example.entity.Task;



public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Java Collections", "Write List Interface",
                "Ann", Status.IN_QUEUE, Priority.LOW);
        System.out.println(task1);
    }
}