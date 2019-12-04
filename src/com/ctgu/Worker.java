package com.ctgu;

/**
 * @author backdiy
 * @date 2019/10/22 20:56
 */
public class Worker {
    int id ;
    String name ;
    int age ;
    public Worker() {
    }
    public Worker(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    //省略get、set方法
    @Override
    public String toString() {
        return "Worker [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
