public class Dome1_interface {
	public static void main(String[] args) {
		Dome d = new Dome();
        d.printA();
        d.printB();
	}
}
/*
接口中的方法都是抽象的

接口特点：
    1.接口用关键字Interface表示
        interface 接口名 {}
    2.类实现接口使用implements表示
        class 类名 implements 接口名 {}
    3.接口不能被实例化，如果想实例化，可以通过父类引用子类方法进行实例化
    4.接口的子类：
        可以是抽象类，但是意义不大
        可以是具体类，但需要重写接口中所有的抽象方法 (推荐方案)
        
接口的成员变量都是常量，并且是静态的并公开的
        默认修饰符：public static final //三个关键字是自动给出的，可以交换位置
        接口中是没有构造方法的
        
关系：
    类与类： 继承关系，只能单继承，但是可以多层继承
    类与接口：实现关系，可以单实现，也可以多实现，并且还可以在继承一个类的同时实现多个接口
    接口与接口：继承关系，可以单继承，也可以多继承

设计理念的区别:
    抽象类：被继承体现的是is a的关系，抽象类中定义的是该继承体系的共性功能
    接口 ：被实现体现的额是like a的关系，接口中定义的是该继承体系的扩展功能
*/


interface Inter {
    public static final int num = 10;      //接口总不能定义非抽象方法
    //public print() {};             //接口中不能有构造方法
    void print();                          //接口的方法前面会自动生成public abstract void ,会默认设置为抽象方法
}
interface InterA {
    public abstract void printA();
}
interface InterB {
    public abstract void printB();
}
interface InterC extends InterA,InterB {              //可以通过一个子接口调用继承两个父接口把两个父接口绑定在一起
}

class Dome extends Object implements InterC {    //一个类不写继承任何类，那么默认的继承类为object
    public void printA() {
        System.out.println("PrintA");
    }
    public void printB() {
        System.out.println("PrintB");
    }
}