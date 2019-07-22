public class Dome1_Final {
	public static void main(String[] args) {
		Son s = new Son();
        System.out.println(Son.PI);
	}
}

/*
final:最终的

finale修饰特点;
1.父方法中添加final是不能被子类给重写的
2.如果使用final来修饰类，那么类就不能够被继承，
3.如果使用final来修饰变量，那个变量就变成了常量，只能够被赋值一次
4，如果使用final来修饰方法，那么方法就不能被重写

使用final来修饰引用数据类型的时候，地址值是不能够被改变的，但对象中的属性是可以修改的

常量书写规范： 例如：int NUM = 10;  其中名字需使用大写，如果是多个单词，需全部使用大写，并且中间使用_隔开
*/

class Son {
    final int NUM = 10;
    public static final double PI = 3.1415926;  
     //final修饰变量叫做常量，一般会搭配public static 使用，因为这样的话会方便调用
}