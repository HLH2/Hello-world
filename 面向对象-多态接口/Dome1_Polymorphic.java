public class Dome1_Polymorphic {
	public static void main(String[] args) {
        Father a = new Father();
        a.eat();
        
		Dog d = new Dog();
        d.eat();
        
        Father a1 = new Dog();  //使用父方法引用子对象
        a1.eat();       //成员变量
        System.out.println(a1.num);     //成员方法
        
        int i = 10;
        byte b = 20;
        //i = b;   基本数据类型自动提升，基本数据类型是无法进行下降的
        b = (byte)i;    //强制类型转换
	}
}

/*
多态的概述：
    事物存在的多种形态
    
多态的前提：
    1.需要有继承关系
    2.要有方法重写
    3.要有父类引用指向子类对象

成员变量：
    编译看左边（父类） ，运行看左边（父类）
成员方法：
    编译看左边（父类） ，运行看右边（子类） //动态绑定

静态方法：
    编译看左边（父类） ，运行看左边（父类）
    静态和类相关，算不上重写，所以，访问还是左边的
    只有非静态的成员方法，编译看左边，运行看右边
*/

class Father {
    
    int num = 10;   //父类的成员变量
    
    public void eat() {
        System.out.println("我喜欢你");   //定义父方法
    }
    
    
}

class Dog extends Father {    //定义子方法

    int num = 20;   //子类类的成员变量

    public void eat() {
        System.out.println("可是我不喜欢你");
    }
}