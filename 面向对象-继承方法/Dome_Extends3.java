public class Dome_Extends3 {
	public static void main(String[] args) {
		Sonu s = new Sonu();
        System.out.println(s.getName() + "..." + s.getAge());
        System.out.println("----------");
        Sonu s1 = new Sonu("������",19);
        System.out.println(s1.getName() + "..." + s1.getAge());
	}
}

/*
super(....)����this(....)��������ڹ��췽���ĵ�һ�����
*/

class Father1 {
    private String name;
    private int age;
    
    public Father1() {
        System.out.println("This is �ղι���");
    }
    
    public Father1(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("This is �вι���");
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
}

class Sonu extends Father1 {
    public Sonu() {
        ///super("������",22);    //���ø����еĹ��췽��
        this("���",20);       //���ñ���Ĺ��췽��      This��superֻ�ܴ���һ����һɽ���ݶ���
        System.out.println("����Ŀղι���");
    }
    
    public Sonu(String name,int age) {
        super(name,age);
        System.out.println("������вι���");
    }
}