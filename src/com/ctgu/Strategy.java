package com.ctgu;

import java.util.List;
/**
 * @author backdiy
 * @date 2019/10/22 20:56
 */

public interface Strategy {
    public Worker getAWorker( List<Worker>  workers );
}

