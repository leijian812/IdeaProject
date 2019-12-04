package com.ctgu;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author backdiy
 * @date 2019/10/22 21:01
 */
public class Test {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker(1, "Jack", 20));
        workers.add(new Worker(2, "Bob", 30));
        workers.add(new Worker(3, "Jhon", 40));
        Strategy strategy = new StrategyImpl();
        System.out.println(strategy.getAWorker(workers).toString());
    }
}
