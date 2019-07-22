/*
定义包的格式：
    package 包名，
    多级包可以用.分开

定义包的注意事项：
    1.package 必须是程序的第一条可执行的代码
    2.package语句在一个java文件中只能有一个
    3.如果没有package，默认表示无包名
    
如何编译运行带包的类;
    1.javac -d . HelloWorld.java
    2.java 包名.Helloworld
    
    voer there market
*/

package com.sina;
public class Person {
    private String name;
    private int age;
    
    public Person() {}
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
	public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void print() {
        System.out.println("I love my girl friend");
    }
}   