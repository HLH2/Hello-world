public class Dome1_interface {
	public static void main(String[] args) {
		Dome d = new Dome();
        d.printA();
        d.printB();
	}
}
/*
�ӿ��еķ������ǳ����

�ӿ��ص㣺
    1.�ӿ��ùؼ���Interface��ʾ
        interface �ӿ��� {}
    2.��ʵ�ֽӿ�ʹ��implements��ʾ
        class ���� implements �ӿ��� {}
    3.�ӿڲ��ܱ�ʵ�����������ʵ����������ͨ�������������෽������ʵ����
    4.�ӿڵ����ࣺ
        �����ǳ����࣬�������岻��
        �����Ǿ����࣬����Ҫ��д�ӿ������еĳ��󷽷� (�Ƽ�����)
        
�ӿڵĳ�Ա�������ǳ����������Ǿ�̬�Ĳ�������
        Ĭ�����η���public static final //�����ؼ������Զ������ģ����Խ���λ��
        �ӿ�����û�й��췽����
        
��ϵ��
    �����ࣺ �̳й�ϵ��ֻ�ܵ��̳У����ǿ��Զ��̳�
    ����ӿڣ�ʵ�ֹ�ϵ�����Ե�ʵ�֣�Ҳ���Զ�ʵ�֣����һ������ڼ̳�һ�����ͬʱʵ�ֶ���ӿ�
    �ӿ���ӿڣ��̳й�ϵ�����Ե��̳У�Ҳ���Զ�̳�

������������:
    �����ࣺ���̳����ֵ���is a�Ĺ�ϵ���������ж�����Ǹü̳���ϵ�Ĺ��Թ���
    �ӿ� ����ʵ�����ֵĶ���like a�Ĺ�ϵ���ӿ��ж�����Ǹü̳���ϵ����չ����
*/


interface Inter {
    public static final int num = 10;      //�ӿ��ܲ��ܶ���ǳ��󷽷�
    //public print() {};             //�ӿ��в����й��췽��
    void print();                          //�ӿڵķ���ǰ����Զ�����public abstract void ,��Ĭ������Ϊ���󷽷�
}
interface InterA {
    public abstract void printA();
}
interface InterB {
    public abstract void printB();
}
interface InterC extends InterA,InterB {              //����ͨ��һ���ӽӿڵ��ü̳��������ӿڰ��������ӿڰ���һ��
}

class Dome extends Object implements InterC {    //һ���಻д�̳��κ��࣬��ôĬ�ϵļ̳���Ϊobject
    public void printA() {
        System.out.println("PrintA");
    }
    public void printB() {
        System.out.println("PrintB");
    }
}