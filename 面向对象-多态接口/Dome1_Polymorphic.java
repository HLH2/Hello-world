public class Dome1_Polymorphic {
	public static void main(String[] args) {
        Father a = new Father();
        a.eat();
        
		Dog d = new Dog();
        d.eat();
        
        Father a1 = new Dog();  //ʹ�ø����������Ӷ���
        a1.eat();       //��Ա����
        System.out.println(a1.num);     //��Ա����
        
        int i = 10;
        byte b = 20;
        //i = b;   �������������Զ����������������������޷������½���
        b = (byte)i;    //ǿ������ת��
	}
}

/*
��̬�ĸ�����
    ������ڵĶ�����̬
    
��̬��ǰ�᣺
    1.��Ҫ�м̳й�ϵ
    2.Ҫ�з�����д
    3.Ҫ�и�������ָ���������

��Ա������
    ���뿴��ߣ����ࣩ �����п���ߣ����ࣩ
��Ա������
    ���뿴��ߣ����ࣩ �����п��ұߣ����ࣩ //��̬��

��̬������
    ���뿴��ߣ����ࣩ �����п���ߣ����ࣩ
    ��̬������أ��㲻����д�����ԣ����ʻ�����ߵ�
    ֻ�зǾ�̬�ĳ�Ա���������뿴��ߣ����п��ұ�
*/

class Father {
    
    int num = 10;   //����ĳ�Ա����
    
    public void eat() {
        System.out.println("��ϲ����");   //���常����
    }
    
    
}

class Dog extends Father {    //�����ӷ���

    int num = 20;   //������ĳ�Ա����

    public void eat() {
        System.out.println("�����Ҳ�ϲ����");
    }
}