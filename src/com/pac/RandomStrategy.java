package com.pac;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author LeiJian
 * @date 2019/10/26 21:34
 */
public class RandomStrategy implements BonusStrategy {
    @Override
    public List<Integer> award(int num) {
        // TODO Auto-generated method stub
        return null ;
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return null;
    }
    /**

     * 拼手气红包算法

     * @param totalAmount 红包总金额

     * @param size 领取人数

     * @param scale 红包金额需要保留的小数位数

     * @param minAmount 单个红包的最小金额

     */

    private void randomHandOutAlgorithm(BigDecimal totalAmount, Integer size

            , Integer scale, BigDecimal minAmount) {

        //剩余红包金额

        BigDecimal remainAmount = totalAmount.setScale(scale, BigDecimal.ROUND_DOWN);

        //剩余红包个数

        Integer remainSize = size;

        for (int i = 1; i < size; i++) {

            //前n-1个红包的金额,用随机算法

            BigDecimal random = BigDecimal.valueOf(Math.random());

            BigDecimal halfRemainSize = BigDecimal.valueOf(remainSize).divide(new BigDecimal(2), BigDecimal.ROUND_UP);

            //计算单次红包的最大值，该算法也是微信的红包算法，可以保证抢红包的期望收益应与先后顺序无关，但后抢红包的方差更大，因此手气最佳更可能在后抢的人中诞生

            BigDecimal max1 = remainAmount.divide(halfRemainSize, BigDecimal.ROUND_DOWN);

            //同时，最大值需要保证，减去该红包后，剩下的红包足以满足剩余人数的最小金额

            BigDecimal minRemainAmount = minAmount.multiply(BigDecimal.valueOf(remainSize - 1)).setScale(scale, BigDecimal.ROUND_DOWN);

            BigDecimal max2 = remainAmount.subtract(minRemainAmount);

            //最终，单次红包的最大值等于两个最大值中较小的一个

            BigDecimal max = (max1.compareTo(max2) < 0) ? max1 : max2;

            BigDecimal amount = random.multiply(max).setScale(scale, BigDecimal.ROUND_DOWN);

            //每个红包的数额不能小于预设的最小金额

            if (amount.compareTo(minAmount) < 0) {

                amount = minAmount;

            }

            remainAmount = remainAmount.subtract(amount).setScale(scale, BigDecimal.ROUND_DOWN);

            remainSize = remainSize - 1;

        }

        //最后一个红包，金额等于剩余金额

        BigDecimal amount = remainAmount;

    }
}
