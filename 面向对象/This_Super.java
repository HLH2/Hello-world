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
        super();    //ÿ�����췽���ĵ�һ�����Ĭ����super() 
    }
    
    public void print() {
        System.out.println(this.num1);
        System.out.println(this.num2);  //This��ʾ���ȵ�������ĳ�Ա�������������û�������Ա�������������ø����
        System.out.println(super.num2);  //super��ֱ�ӵ��ø���ĳ�Ա��������ʽΪsuper.num2 ,ʹ��super���ø���ĳ�Ա������ʽΪ:super.num();
        System.out.println();
    }
}