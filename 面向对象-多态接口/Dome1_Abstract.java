public class Dome1_Abstract {
	public static void main(String[] args) {
		Animal a = new Cat();     //使用父类引用子类对象
        a.eat();
	}
}

/*
抽象类的特点：
    1.抽象类和抽象方法必须使用abstract 关键字使用
        类的格式为：abstract class 类名 {} 
        方法的格式为：public abstract void main();
    2.抽象类不一定有抽象方法，有抽象方法的类一定是抽象类或者是解耦
    3.抽象类不能实例化那么，可以使用多台的方式，有具体的子类实例化，其实这也是多态的一种，抽象类多态
    4.抽象的子类：
        要么是抽象类
        要么重写抽象类中的所有抽象方法‘
        
抽象类中的成员方法特性：
    1.抽象方法，强制要求子类做的事情
    2.非抽象方法，子类继承的事情，提高代码的复用性
*/

abstract class Animal {      //这是一个抽象类
    public abstract void eat();     //这是一个抽象方法
}

class Cat extends Animal {
    public void eat() {         //使用子方法继承抽象方法后，抽象方法里的所有抽象类都需要被重写
        System.out.println("猫吃鱼");
    }
}