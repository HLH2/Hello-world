public class Demo2_SuperMan {
	public static void main(String[] args) {
		Person p = new SuperMan();    //����ת��
        System.out.println(p.name);
        p.̸����();
        //p.teyou();     //��̬�ı׶ˣ��޷�ʹ���������е�����
        
        SuperMan sm = (SuperMan)p;    //����ת�ͣ���p����ת��Ϊsm
        sm.̸����();     
        sm.teyou();    //�����ǿ���ʹ���Լ����еķ���
        System.out.println(sm.name);
	}
}

/*
��̬�ĺô���
    1.����˴����ά���ԣ��̳б�֤��
    2.����˵Ĵ������չ�ԣ��ɶ�̬��֤��
    
��̬�Ļ�����
    ����ʹ���������������
*/



class Person {
    String name = "mr.he";
    public void ̸����() {
        System.out.println("���Ǹ����");
    }
}

class SuperMan extends Person {
    String name = "superman";
    public void ̸����() {
        System.out.println("��Ҳ�������");
    }
    
    public void teyou() {
        System.out.println("�������е�����");
    }
}