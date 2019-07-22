 class Dome1_InnerClass {
	public static void main(String[] args) {
        Outer o = new Outer();
        o.method();       //直接调用主方法就可以正常输出
		
	}
}

class Outer {
    public void method() {
        int num = 10;
        class Inner {                    //属于局部内部类
            public void print() {
                System.out.println(num);
                System.out.println("HelloWorld");
            }
        }
        Inner i = new Inner();   //在同一个方法下调用局部内部类
        i.print();
    }
    /*public void run() {
        Inner i = new Inner();   //局部内部类是只能在其所在方法内访问的
        i.print();
    } */
}

