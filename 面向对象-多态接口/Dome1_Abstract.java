public class Dome1_Abstract {
	public static void main(String[] args) {
		Animal a = new Cat();     //ʹ�ø��������������
        a.eat();
	}
}

/*
��������ص㣺
    1.������ͳ��󷽷�����ʹ��abstract �ؼ���ʹ��
        ��ĸ�ʽΪ��abstract class ���� {} 
        �����ĸ�ʽΪ��public abstract void main();
    2.�����಻һ���г��󷽷����г��󷽷�����һ���ǳ���������ǽ���
    3.�����಻��ʵ������ô������ʹ�ö�̨�ķ�ʽ���о��������ʵ��������ʵ��Ҳ�Ƕ�̬��һ�֣��������̬
    4.��������ࣺ
        Ҫô�ǳ�����
        Ҫô��д�������е����г��󷽷���
        
�������еĳ�Ա�������ԣ�
    1.���󷽷���ǿ��Ҫ��������������
    2.�ǳ��󷽷�������̳е����飬��ߴ���ĸ�����
*/

abstract class Animal {      //����һ��������
    public abstract void eat();     //����һ�����󷽷�
}

class Cat extends Animal {
    public void eat() {         //ʹ���ӷ����̳г��󷽷��󣬳��󷽷�������г����඼��Ҫ����д
        System.out.println("è����");
    }
}