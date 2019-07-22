public class Domo1_Extends {
	public static void main(String[] args) {
		Dog c = new Dog();
        c.color = "blue";
        c.leg = 4;
        c.eat();
        c.sleep();
        System.out.println("my name is Dog, 我的颜色是:" + c.color + '\t' + "我的腿个数是：" + c.leg ); 
	}
}

class Animal {      //父类
    String color;          //动物的颜色
    int leg;            //动物腿的个数
    
    public void eat() {
        System.out.println("吃饭");
    }
    
    public void sleep() {
        System.out.println("睡觉");
    }
}


//可使用extends继承，格式如class 子类名 extends 父类名 
/*
继承的好处：
   1.提高了代码的复用性
   2.提高了代码的维护性
   3.让类与类之间产生了关系，是多态的前提
继承的弊端：
   1.类的耦合性增强了
   
开发的原则：高内聚，低耦合
 耦合：类与类的关系更加紧密
 内聚：就是自己完成某件事情的能力
 
JAVA中类的继承特点：
    a.java只支持单继承，不支持多继承
    b.java支持多层继承（继承体系） （子类可以使用父类的方法，但父类不能使用子类的方法）
    c.如果想用这个体系的所有功能，用最底层的类创建对象
    d.如果想看这个体系对的共性功能，看最顶层的类
    
JAVA中继承的注意事项：
    1.子类只能继承父类所有的非私有的成员（成员方法和成员变量）私有为：private
    2.子类不能继承父类的构造方法，但是可以通过super关键字去访问父类的构造方法
    3.不要为了部分功能而去继承
*/

class Cat extends Animal {  //继承的子类
    /*String color;          //动物的颜色
    int leg;            //动物腿的个数
    
    public void eat() {
        System.out.println("吃饭");
    }
    
    public void sleep() {
        System.out.println("睡觉");
    }*/
}

class Dog extends Cat {
    /*String color;          //动物的颜色
    int leg;            //动物腿的个数
    
    public void eat() {
        System.out.println("吃饭");
    }
    
    public void sleep() {
        System.out.println("睡觉");
    }*/
}