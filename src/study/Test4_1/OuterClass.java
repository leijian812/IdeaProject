package study.Test4_1;

/**
 * @author LeiJian
 * @date 2019/10/27 12:58
 */
public class OuterClass {

    public static class Circle implements ICal {

        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }


    ICal getRectangle(){
        return new ICal() {
            double weight = 3;
            double length = 4;
            @Override
            public double getArea() {
                return weight*length;
            }
        };

    }
}