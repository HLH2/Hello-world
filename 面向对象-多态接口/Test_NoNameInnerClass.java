class Test_NoNameInnerClass {
	public static void main(String[] args) {
		Outher o = new Outher();      //创建父类对象
        o.method(new person() {   //更改值为无名局部内部类
            public void Test() {     //因为此类为abstract所修饰的抽象类，所以必须重写以abstract定义的抽象方法
                System.out.println("Test method");
            }
        });
	}
}

abstract class person {
    public abstract void Test();
}

class Outher {
    public void method(person p) {  //使用父类引用子类对象
        p.Test();
    }
}