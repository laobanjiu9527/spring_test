package pers.lsh;

import java.util.Map;

public class User {
    private int age;
    private String name;
    private Demo demo;
    private Map<Integer, String> userMap;

    public Map<Integer, String> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<Integer, String> userMap) {
        this.userMap = userMap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", demo=" + demo +
                ", userMap=" + userMap +
                '}';
    }

    public void hello(){
        System.out.println("hello spring");
    }
}
