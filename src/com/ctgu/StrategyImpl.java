package com.ctgu;
import java.util.List;
/**
 * @author backdiy
 * @date 2019/10/22 20:56
 */
public class StrategyImpl implements Strategy{
    public Worker getAWorker( List<Worker>  workers ){
        int ans = 0;
        Worker maxn = null;
        for (Worker i :
                workers) {
            if (i.age > ans) {
                ans = i.age;
                maxn = i;
            }
        }
        return maxn;
    }
}
