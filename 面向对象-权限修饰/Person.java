/*
������ĸ�ʽ��
    package ������
    �༶��������.�ֿ�

�������ע�����
    1.package �����ǳ���ĵ�һ����ִ�еĴ���
    2.package�����һ��java�ļ���ֻ����һ��
    3.���û��package��Ĭ�ϱ�ʾ�ް���
    
��α������д�������;
    1.javac -d . HelloWorld.java
    2.java ����.Helloworld
    
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