public class Dome_NoNameInnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
        o.method();
	}
}

interface inter {
    public void print();
    public void print1();
}

class Outer {
    //class inner implements inter {
        //public void print() {
         //   System.out.println("��");
        //}
    public void method() {
        //new inner().print();
        new inter() {   
            public void print() {
                System.out.println("�ӿ�");
            }
            public void print1() {
                System.out.println("�ӿ�11");
            }
            public void show() {
                print();
                print1();
            }
        }.show();
    }
}