package study.Test3_1;

/**
 * @author LJ
 * @date 2019/9/28 16:58
 */
class Ball extends Circle {
    Ball(double r) {
        super(r);
    }
    double getValumn() {
        return getArea()*r*4.0/3.0;
    }
}
