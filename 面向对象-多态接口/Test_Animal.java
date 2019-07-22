public class Test_Animal {
	public static void main(String[] args) {
		Cat c = new Cat();
        c.setName("����");
        c.setAge(5);
        c.eat();
        System.out.print('\t' + "�ҽ�" + c.getName() + '\t' + "�ҽ���" + c.getAge() + "����" + '\t' + "�һ�");
        c.tx();
        
        System.out.println("-------");
        Dog d = new Dog();
        d.setName("����");
        d.setAge(4);
        d.eat();
        System.out.print("�ҽ�" + d.getName() + '\t' + "�ҽ���" + d.getAge() + "����" + '\t' + "�һ�");
        d.LookHome();
	}
}

/*
���ԣ����������䣬�Է�
è�����ԣ�ץ����
�������ԣ�����
*/

abstract class Animal {
    private String name;     //����
    private int age;         //����
    
    public Animal() {};
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
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
    public abstract void eat();
}

class Cat extends Animal {
    public Cat() {}
    
    public Cat(String name,int age) {
        super(name,age);
    }
    public void eat() {
        System.out.println("è����");
    }
    public void tx() {
        System.out.println("ץ����");
    }
}

class Dog extends Animal {
    public Dog() {}
    
    public Dog(String name,int age) {
        super(name,age);
    }
    public void eat() {
        System.out.println("������");
    }
    public void LookHome() {
        System.out.println("����");
    }
}