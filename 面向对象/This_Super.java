public class This_Super {
	public static void main(String[] args) {
		Son s = new Son();
	}
}

class Father {
    int num1 = 10;
    int num2 = 30;
    
    public Father() {
        System.out.println("This is Super ");
    }
}

class Son extends Father {
    int num2 = 20;
    
    Son() {
        super();    //每个构造方法的第一条语句默认是super() 
    }
    
    public void print() {
        System.out.println(this.num1);
        System.out.println(this.num2);  //This表示首先调用子类的成员变量，如果子类没有这个成员变量，则代表调用父类的
        System.out.println(super.num2);  //super是直接调用父类的成员变量，格式为super.num2 ,使用super调用父类的成员方法格式为:super.num();
        System.out.println();
    }
}