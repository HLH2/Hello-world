public class Test_Static {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = ("mr.he");
		p1.country = ("china");
		p1.speak();
		
		Person p2 = new Person();
		p2.name = "mr.wang";
		p2.speak();
	}
}
//1.����ʹ�þ�̬������ʹ�ö�̬���Ƽ�ʹ������. ��person.country = *;
//2.�޷��Ӿ�̬���������е��÷Ǿ�̬�ĳ�Ա��������̬�ĳ�Ա����ֻ�ܹ�����̬�ķ�������
//3.���һ���������еķ������Ǿ�̬�ģ�����Ҫ����˽�з�����Ŀ���ǲ��������ഴ��������󣬿���ʹ������.ֱ�ӵ���

class Person {
	String name;
	static String country; 
    
	public void speak() {
		System.out.println(name + "..." + country);
    }
}