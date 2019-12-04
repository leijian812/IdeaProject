package com.pac;

import java.util.List;

/**
 * @author LeiJian
 * @date 2019/10/26 21:35
 */
    /**
     * 微信抢红包的方式，根据结构关系图可以知道，接口名为BonusStrategy
     * 里面有两个接口方法，都是抽象的。
     * @author mac1094
     *
     */
// 写一个接口名为BonusStrategy的接口
    public interface BonusStrategy {
        /**
         * 第一个抽象方法List<Integer> award(int num)
         * @param num 参数表示红包个数
         * @return
         */
        public List<Integer> award(int num) ;
        /**
         * 第二个方法表示返回类型
         * @return 返回的参数类型为String
         */
        String getType();


}
