public class Test2_NoNameInnerClass {
	public static void main(String[] args) {
        
        //因为能使用类名.调用的方法都是静态的，所以使用static修饰，因为它是链式编程，所以返回的值为对象
		//Outer.method().show();  //链式编程，每次调用方法后还能继续调用方法，证明调用方法的返回值类型是对象
        Inter i = Outer.method();   //也可以使用父类引用子类对象，
        i.show();    //编译看父类，运行看子类重写的方法，所以就直接可以输入Hello World;
	}
}

interface Inter {
    void show();
}

class Outer {
    public static Inter method() {
        return new Inter() {    //返回inner的子类对象
            public void show() {
                System.out.println("Hello World");
            }
        };
    }
}