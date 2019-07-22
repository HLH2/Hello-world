public class Demo5_Extends {
	public static void main(String[] args) {
		Son s = new Son();
	}
}
/*
子类中所有的构造方法默认都会访问父类中空参数的构造方法
*/


class Father {
    public Father() {
        System.out.println("Father 的构造方法");
    }
}

class Son extends Father {
    Son() {
        super();
    }
}