 class Dome1_InnerClass {
	public static void main(String[] args) {
        Outer o = new Outer();
        o.method();       //ֱ�ӵ����������Ϳ����������
		
	}
}

class Outer {
    public void method() {
        int num = 10;
        class Inner {                    //���ھֲ��ڲ���
            public void print() {
                System.out.println(num);
                System.out.println("HelloWorld");
            }
        }
        Inner i = new Inner();   //��ͬһ�������µ��þֲ��ڲ���
        i.print();
    }
    /*public void run() {
        Inner i = new Inner();   //�ֲ��ڲ�����ֻ���������ڷ����ڷ��ʵ�
        i.print();
    } */
}

