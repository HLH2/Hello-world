public class Domo1_Extends {
	public static void main(String[] args) {
		Dog c = new Dog();
        c.color = "blue";
        c.leg = 4;
        c.eat();
        c.sleep();
        System.out.println("my name is Dog, �ҵ���ɫ��:" + c.color + '\t' + "�ҵ��ȸ����ǣ�" + c.leg ); 
	}
}

class Animal {      //����
    String color;          //�������ɫ
    int leg;            //�����ȵĸ���
    
    public void eat() {
        System.out.println("�Է�");
    }
    
    public void sleep() {
        System.out.println("˯��");
    }
}


//��ʹ��extends�̳У���ʽ��class ������ extends ������ 
/*
�̳еĺô���
   1.����˴���ĸ�����
   2.����˴����ά����
   3.��������֮������˹�ϵ���Ƕ�̬��ǰ��
�̳еı׶ˣ�
   1.����������ǿ��
   
������ԭ�򣺸��ھۣ������
 ��ϣ�������Ĺ�ϵ���ӽ���
 �ھۣ������Լ����ĳ�����������
 
JAVA����ļ̳��ص㣺
    a.javaֻ֧�ֵ��̳У���֧�ֶ�̳�
    b.java֧�ֶ��̳У��̳���ϵ�� ���������ʹ�ø���ķ����������಻��ʹ������ķ�����
    c.������������ϵ�����й��ܣ�����ײ���ഴ������
    d.����뿴�����ϵ�ԵĹ��Թ��ܣ���������
    
JAVA�м̳е�ע�����
    1.����ֻ�ܼ̳и������еķ�˽�еĳ�Ա����Ա�����ͳ�Ա������˽��Ϊ��private
    2.���಻�ܼ̳и���Ĺ��췽�������ǿ���ͨ��super�ؼ���ȥ���ʸ���Ĺ��췽��
    3.��ҪΪ�˲��ֹ��ܶ�ȥ�̳�
*/

class Cat extends Animal {  //�̳е�����
    /*String color;          //�������ɫ
    int leg;            //�����ȵĸ���
    
    public void eat() {
        System.out.println("�Է�");
    }
    
    public void sleep() {
        System.out.println("˯��");
    }*/
}

class Dog extends Cat {
    /*String color;          //�������ɫ
    int leg;            //�����ȵĸ���
    
    public void eat() {
        System.out.println("�Է�");
    }
    
    public void sleep() {
        System.out.println("˯��");
    }*/
}