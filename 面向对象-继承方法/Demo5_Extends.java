public class Demo5_Extends {
	public static void main(String[] args) {
		Son s = new Son();
	}
}
/*
���������еĹ��췽��Ĭ�϶�����ʸ����пղ����Ĺ��췽��
*/


class Father {
    public Father() {
        System.out.println("Father �Ĺ��췽��");
    }
}

class Son extends Father {
    Son() {
        super();
    }
}