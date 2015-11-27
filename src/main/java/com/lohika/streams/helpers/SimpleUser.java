package com.lohika.streams.helpers;

/**
 * @author Igor Babiy (ibabiy@okta.com)
 */
public class SimpleUser {
    private int age;
    private String name;

    public SimpleUser(int age, String name) {
        this.age = age;
        this.name = name;
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

    @Override
    public String toString() {
        return "SimpleUser{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
