public class Dome1_Final {
	public static void main(String[] args) {
		Son s = new Son();
        System.out.println(Son.PI);
	}
}

/*
final:���յ�

finale�����ص�;
1.�����������final�ǲ��ܱ��������д��
2.���ʹ��final�������࣬��ô��Ͳ��ܹ����̳У�
3.���ʹ��final�����α������Ǹ������ͱ���˳�����ֻ�ܹ�����ֵһ��
4�����ʹ��final�����η�������ô�����Ͳ��ܱ���д

ʹ��final�����������������͵�ʱ�򣬵�ֵַ�ǲ��ܹ����ı�ģ��������е������ǿ����޸ĵ�

������д�淶�� ���磺int NUM = 10;  ����������ʹ�ô�д������Ƕ�����ʣ���ȫ��ʹ�ô�д�������м�ʹ��_����
*/

class Son {
    final int NUM = 10;
    public static final double PI = 3.1415926;  
     //final���α�������������һ������public static ʹ�ã���Ϊ�����Ļ��᷽�����
}