public class Fangfa_Chongxie {
	public static void main(String[] args) {
		Ios8 i = new Ios8();
        i.siri();
        i.call();
	}
}

/*
��д����ע�����
1.�ڸ����У�˽�еķ����ǲ��ܱ���д�ģ���Ϊ����˽�еķ����������޷��̳�
2.������д���෽����ʱ�򣬷���Ȩ����ñ���һ��
3.��̬��ֻ�ܹ����Ǿ�̬�ķ��������ܹ����ǷǾ�̬��
4.overload���Ըı䷵��ֵ���ͣ�ֻ�������б�
������д�� �����г����˺͸����з�������һģһ���ķ������뷵��ֵ�����йأ�����ֵ��һ�£������Ӹ���ģ�
�������أ� �����г��ֵķ�����һ���������б�ͬ�ķ������뷵��ֵ�޹�
���������÷�����ʱ��
            �������౾�����Ҹ���
*/

class Ios7 {
    public void call() {
        System.out.println("��绰");
    }
    
    
    public void siri() {
        System.out.println("speak English");
    }
}

class Ios8 extends Ios7 {
    public void siri() {
        super.siri();     //ʹ���ӷ������¶��壬�Ը��Ǹ����������ϣ��������ǰ�Ĺ��ܣ�����ӷ������ø�����
        System.out.println("speak chinese");
    }
}