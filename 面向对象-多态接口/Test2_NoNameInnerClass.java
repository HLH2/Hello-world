public class Test2_NoNameInnerClass {
	public static void main(String[] args) {
        
        //��Ϊ��ʹ������.���õķ������Ǿ�̬�ģ�����ʹ��static���Σ���Ϊ������ʽ��̣����Է��ص�ֵΪ����
		//Outer.method().show();  //��ʽ��̣�ÿ�ε��÷������ܼ������÷�����֤�����÷����ķ���ֵ�����Ƕ���
        Inter i = Outer.method();   //Ҳ����ʹ�ø��������������
        i.show();    //���뿴���࣬���п�������д�ķ��������Ծ�ֱ�ӿ�������Hello World;
	}
}

interface Inter {
    void show();
}

class Outer {
    public static Inter method() {
        return new Inter() {    //����inner���������
            public void show() {
                System.out.println("Hello World");
            }
        };
    }
}