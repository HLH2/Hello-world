class Test_NoNameInnerClass {
	public static void main(String[] args) {
		Outher o = new Outher();      //�����������
        o.method(new person() {   //����ֵΪ�����ֲ��ڲ���
            public void Test() {     //��Ϊ����Ϊabstract�����εĳ����࣬���Ա�����д��abstract����ĳ��󷽷�
                System.out.println("Test method");
            }
        });
	}
}

abstract class person {
    public abstract void Test();
}

class Outher {
    public void method(person p) {  //ʹ�ø��������������
        p.Test();
    }
}