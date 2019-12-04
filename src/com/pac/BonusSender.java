package com.pac;

import java.util.List;

/**
 * @author LeiJian
 * @date 2019/10/26 21:39
 */
public class BonusSender implements BonusStrategy {
    /**
     * 重写接口的第一个方法
     */
    @Override
    public List<Integer> award(int num) {

        return null;
    }

    /**
     * 重写接口的第二个方法
     */
    @Override
    public String getType() {

        return null;
    }
    /**
     * 该类有一个方法，该方法没有返回值。
     * 参数类型是BonusStrateg
     * @param strategy 参数
     */
    public void sendBonus(BonusStrategy strategy) {
        System.out.println("红包类型：普通红包/拼手气红包");
    }
}
